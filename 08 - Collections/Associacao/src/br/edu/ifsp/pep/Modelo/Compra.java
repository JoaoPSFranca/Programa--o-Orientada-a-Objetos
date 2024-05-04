package br.edu.ifsp.pep.Modelo;

public class Compra implements MovimentoFinanceiro {
    private int numeroCompra;
    private int quantComprada;
    private String fornecedor;
    private double valorCompra;
    
    private Produto produto;
    
    public Compra(int numeroCompra, int quantComprada, String fornecedor, double valorCompra, Produto produto) {
        this.produto = produto;
        this.numeroCompra = numeroCompra;
        this.quantComprada = quantComprada;
        this.fornecedor = fornecedor;
        this.valorCompra = valorCompra;
    }

    public int getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(int numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public int getQuantComprada() {
        return quantComprada;
    }

    public void setQuantComprada(int quantComprada) {
        this.quantComprada = quantComprada;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    
}
