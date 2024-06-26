package br.edu.ifsp.pep.Model;

import java.util.Date;

public class Despesa implements Movimento{
    private long codigo;
    private String descricao;
    private double valor;
    private Date data;

    public Despesa(long codigo, String descricao, double valor, Date data) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    @Override
    public double getValorMovimento(){
        return getValor();
    }
    
    @Override
    public String getMovimento(){
        return "nada";
    }
}
