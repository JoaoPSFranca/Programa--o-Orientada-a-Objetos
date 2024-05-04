package br.edu.ifsp.pep.Modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Venda {
    private int numeroNotaFiscal;
    private LocalDateTime data;
    private String formaPagamento;
    
    private Cliente cliente;
    
    private List<itemVendido> itens;

    public Venda(int numeroNotaFiscal, LocalDateTime data, String formaPagamento, Cliente cliente, List<itemVendido> itens) {
        this.numeroNotaFiscal = numeroNotaFiscal;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.cliente = cliente;
        this.itens = itens;
    }
     
    public int getNumeroNotaFiscal() {
        return numeroNotaFiscal;
    }

    public void setNumeroNotaFiscal(int numeroNotaFiscal) {
        this.numeroNotaFiscal = numeroNotaFiscal;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
