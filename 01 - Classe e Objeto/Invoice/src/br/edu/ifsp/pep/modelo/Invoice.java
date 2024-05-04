package br.edu.ifsp.pep.modelo;

public class Invoice {
    String numero;
    String desc;
    int quantidade;
    double preco;

    public Invoice(String numero, String desc, int quantidade, double preco) {
        this.numero = numero;
        this.desc = desc;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade <= 0)
            this.quantidade = 0;
        else
            this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco <= 0.0)
            this.preco = 0.0;
        else
            this.preco = preco;
    }
    
    public double getInvoiceAmount(){
        return (this.quantidade * this.preco);
    }
    
}
