package br.edu.ifsp.pep.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venda implements Comparable<Venda>{
    private LocalDate dataVenda;
    private String tipoPagamento;
    private ArrayList<ItemVenda> itens;
    private int codigo;

    public Venda(LocalDate dataVenda, String tipoPagamento, ArrayList<ItemVenda> itens, int codigo) {
        this.dataVenda = dataVenda;
        this.tipoPagamento = tipoPagamento;
        this.itens = itens;
        this.codigo = codigo;
    }
    
    @Override
    public int compareTo(Venda venda) {
        return this.tipoPagamento.compareTo(venda.getTipoPagamento());
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public ArrayList<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }
    
    public double getTotalVenda(){
        double total = 0.0;
        
        for (ItemVenda iv : itens) {
            total += iv.getPreco() * iv.getQuantidade();
        }
        
        if(getTipoPagamento().equalsIgnoreCase("dinheiro"))
            total *= 0.9;
        else if(getTipoPagamento().equalsIgnoreCase("cartao"))
            total *= 0.95;
        
        return total;
    }
}
