package br.edu.ifsp.pep.Modelo;

import java.time.LocalDate;
import java.util.List;

public class Venda {
    private LocalDate dataVenda;
    private List<ItemVendido> itens;
    private Cliente cliente;

    public Venda(LocalDate dataVenda, List<ItemVendido> itens, Cliente cliente) {
        this.dataVenda = dataVenda;
        this.itens = itens;
        this.cliente = cliente;
    }

    public List<ItemVendido> getItens() {
        return itens;
    }

    public void setItens(List<ItemVendido> itens) {
        this.itens = itens;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
