package br.edu.ifsp.pep.models;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String cargo, double salario, String cpf, String nome, String email, String telefone) {
        super(cpf, nome, email, telefone);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
