package br.edu.ifsp.pep.Modelo;

public class FerramentaVenda extends Ferramenta {
    private double valor;

    public FerramentaVenda(double valor, String nome) {
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
