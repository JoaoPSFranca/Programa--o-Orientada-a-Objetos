package br.edu.ifsp.pep.model;

public class ItemVenda {
    private int quantidade;
    private double preco;
    private Produto prod;

    public ItemVenda(int quantidade, Produto prod) {
        this.quantidade = quantidade;
        this.preco = prod.getPreco();
        this.prod = prod;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }
    
    
}
