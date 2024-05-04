package br.edu.ifsp.pep.Modelo;

public class contaPoupanca extends Conta{
    private float remuneracao;

    public contaPoupanca(float remuneracao, String agencia, String numConta, String proprietario, String email, String telefone, double saldo, int dia, int mes, int ano) {
        super(agencia, numConta, proprietario, email, telefone, saldo, dia, mes, ano);
        this.remuneracao = remuneracao;
    }
    
    public float getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(float remuneracao) {
        this.remuneracao = remuneracao;
    }

}
