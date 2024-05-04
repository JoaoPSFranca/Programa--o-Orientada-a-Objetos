package br.edu.ifsp.pep.modelo;

public class ContaCorrente {

    //Atributos
    private final String numero;
    private double saldo;

    //Construtores
    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    //Métodos
    //modificador de acesso
    //Retorno
    //Nome
    //Parâmetros (se houver)
    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        }
    }

    //Criar o método getNumero
    public String getNumero() {
        return numero;
    }
}
