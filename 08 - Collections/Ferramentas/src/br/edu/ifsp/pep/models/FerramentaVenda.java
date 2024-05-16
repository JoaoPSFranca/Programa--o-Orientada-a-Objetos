package br.edu.ifsp.pep.models;

public class FerramentaVenda extends Ferramenta {
    private double valor;

    public FerramentaVenda(String nome, double valor) {
        super(nome);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
