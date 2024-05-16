package br.edu.ifsp.pep.models;

import java.time.LocalDate;

public class Venda {
    private LocalDate dataVenda;
    private Cliente cliente;

    public Venda(LocalDate dataVenda, Cliente cliente) {
        this.dataVenda = dataVenda;
        this.cliente = cliente;
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
