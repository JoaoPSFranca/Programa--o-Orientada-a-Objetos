package br.edu.ifsp.pep.Model;
import java.util.Date;

public class Venda implements Movimento {
    private long numero;
    private Date data; 
    private String formaPagamento;
    private double valor;

    public Venda(long numero, Date data, String formaPagamento, double valor) {
        this.numero = numero;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.valor = valor;
    }
    
    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
