package br.edu.ifsp.pep.model;

import java.util.List;

public class Venda {
    private int codigo;
    private String tipoPagamento;
    private Cliente cliente;
    private List<ItemVenda> itens;

    public double getValorTotal(){
        double valor = 0;
        
        for (ItemVenda item : itens) {
            valor += item.getPreco() - item.getQuantidade();
        }
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }
    
    
}
