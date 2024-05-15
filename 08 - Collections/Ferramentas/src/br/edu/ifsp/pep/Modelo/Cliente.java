package br.edu.ifsp.pep.Modelo;

public class Cliente extends Pessoa {
    private double limite;

    public Cliente(String cpf, String nome, String email, String telefone, double limite) {
        super(cpf, nome, email, telefone);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
}
