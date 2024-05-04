package br.edu.ifsp.pep.Modelo;

public class Conta {
    private String agencia;
    private String numConta;
    private String proprietario;
    private String email;
    private String telefone;
    private double saldo;
    private int dia;
    private int mes;
    private int ano;

    public Conta(String agencia, String numConta, String proprietario, String email, String telefone, double saldo, int dia, int mes, int ano) {
        this.agencia = agencia;
        this.numConta = numConta;
        this.proprietario = proprietario;
        this.email = email;
        this.telefone = telefone;
        this.saldo = saldo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public void sacar(double valor){
        if(this.saldo >= valor)
            this.saldo -= valor;
    }
}
