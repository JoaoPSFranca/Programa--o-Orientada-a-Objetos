package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Pessoa;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PessoaDao implements DAO{
    private static int codigo = 0;
    private List<Pessoa> pessoas = new ArrayList<>();
    
    @Override
    public void adicionar(Pessoa pessoa) {
        pessoa.setCodigo(++codigo);
        this.pessoas.add(pessoa);
    }
    
    @Override
    public List<Pessoa> getTodas() {
        return new ArrayList<>();
    }

    @Override
    public void remover(int codigo) throws Exception {
        Pessoa pessoa = getPessoa(codigo);
        this.pessoas.remove(pessoa);
    }

    @Override
    public void alterar(Pessoa pessoa) throws Exception {
        Pessoa p = getPessoa(pessoa.getCodigo());
        p = pessoa;
    }

    @Override
    public List<Pessoa> getPessoasOrdenadasPeloNome() {
        Collections.sort(pessoas);
        return pessoas;
    }

    @Override
    public Pessoa getPessoa(int codigo) throws Exception {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getCodigo() == codigo) {
                return pessoa;
            }
        }
        throw new Exception("Pessoa não encontrada.");
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}
