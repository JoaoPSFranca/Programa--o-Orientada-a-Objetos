package br.edu.ifsp.pep.jdbc;

import br.edu.ifsp.pep.dao.DAO;
import br.edu.ifsp.pep.model.Pessoa;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PessoaDao_JDBC implements DAO {

    @Override
    public void adicionar(Pessoa pessoa) {
        String sql = "INSERT INTO Pessoa (pes_nome, pes_dataNascimento, pes_email, pes_endereco, pes_salario, pes_telefone) " + 
                "VALUES (?, ?, ?, ?, ?, ?)";
        
        Connection conexao = Conexao.getConexao();
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            
            java.sql.Date dataNascimento = new java.sql.Date(pessoa.getDataNascimento().getTime());
            ps.setDate(2, dataNascimento);
            
            //ps.setDate(2, (Date) pessoa.getDataNascimento());
            
            ps.setString(3, pessoa.getEmail());
            ps.setString(4, pessoa.getEndereco());
            ps.setDouble(5, pessoa.getSalario());
            ps.setString(6, pessoa.getTelefone());
            
            ps.execute();
            
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Pessoa> getTodas() {
        String sql = "select * from pessoa";
        
        Connection conexao = Conexao.getConexao();
        
        List<Pessoa> pessoas = new ArrayList();
        
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Pessoa p = new Pessoa();
                p.setCodigo(rs.getInt("pes_codigo"));
                p.setNome(rs.getString("pes_nome"));
                p.setDataNascimento(rs.getDate("pes_dataNascimento"));
                p.setEmail(rs.getString("pes_email"));
                p.setEndereco(rs.getString("pes_endereco"));
                p.setSalario(rs.getDouble("pes_salario"));
                p.setTelefone(rs.getString("pes_telefone"));
                
                pessoas.add(p);
            }
            
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return pessoas;
    }

    @Override
    public void remover(int codigo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void alterar(Pessoa pessoa) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Pessoa> getPessoasOrdenadasPeloNome() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Pessoa getPessoa(int codigo) throws Exception {
        String sql = "select * from pessoa where pes_codigo = ?";

        Connection conexao = Conexao.getConexao();
        Pessoa p = null;
        
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, codigo);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                p = new Pessoa();
                p.setNome(rs.getString("pes_nome"));
                p.setDataNascimento(rs.getDate("pes_dataNascimento"));
                p.setEmail(rs.getString("pes_email"));
                p.setEndereco(rs.getString("pes_endereco"));
                p.setSalario(rs.getDouble("pes_salario"));
                p.setTelefone(rs.getString("pes_telefone"));
            }
            
            ps.close();
            conexao.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
        return p;
    }
    
}
