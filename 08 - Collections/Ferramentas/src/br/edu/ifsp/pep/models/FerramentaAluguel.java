package br.edu.ifsp.pep.models;

public class FerramentaAluguel extends Ferramenta {
    private double valorDiaria;
    private int increment = 0;
    private int numeroPatrimonio;
    
    public FerramentaAluguel(String nome, double valor) {
        super(nome);
        increment += 10;
        this.valorDiaria = valor;
        this.numeroPatrimonio = increment;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    public int getNumeroPatrimonio() {
        return numeroPatrimonio;
    }

    public void setNumeroPatrimonio(int numeroPatrimonio) {
        this.numeroPatrimonio = numeroPatrimonio;
    }
}
