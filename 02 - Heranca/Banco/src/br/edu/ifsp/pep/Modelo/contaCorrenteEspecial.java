package br.edu.ifsp.pep.Modelo;

public class contaCorrenteEspecial extends Conta{
    private double limite;

    public contaCorrenteEspecial(double limite, String agencia, String numConta, String proprietario, String email, String telefone, double saldo, int dia, int mes, int ano) {
        super(agencia, numConta, proprietario, email, telefone, saldo, dia, mes, ano);
        this.limite = limite;
    }
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public void sacar(double valor){
        if((getSaldo() + this.limite) >= valor)
            setSaldo(getSaldo() - valor);
    }
}
