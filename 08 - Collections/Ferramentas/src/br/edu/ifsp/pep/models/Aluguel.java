package br.edu.ifsp.pep.models;

import java.time.LocalDate;
import java.time.Period;

public class Aluguel {
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private double valorDiaria;
    private Funcionario funcionario;
    private Cliente cliente;
    private FerramentaAluguel ferramentasAluguel;
    
    //Ver quantidade de dias alugados
    //Period period = Period.between(startDate, endDate);
    //int diasMeses = period.getMonths() * 30;
    //int diasAnos = period.getYears() * 365;
    //int dias = period.getDays() + diasMeses + diasAnos;
    
    public Aluguel(LocalDate dataLocacao, LocalDate dataDevolucao, Funcionario funcionario, Cliente cliente, FerramentaAluguel ferramentasAluguel) {
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.ferramentasAluguel = ferramentasAluguel;
        this.valorDiaria = ferramentasAluguel.getValorDiaria();
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FerramentaAluguel getFerramentasAluguel() {
        return ferramentasAluguel;
    }

    public void setFerramentasAluguel(FerramentaAluguel ferramentasAluguel) {
        this.ferramentasAluguel = ferramentasAluguel;
    }
    
    public int getDiasAlugados(){
        Period period = Period.between(this.dataLocacao, this.dataDevolucao);
        int diasMeses = period.getMonths() * 30;
        int diasAnos = period.getYears() * 365;
        return period.getDays() + diasMeses + diasAnos;
    }
    
    public double getValorAluguel(){
        int dias = this.getDiasAlugados();
        return dias * this.valorDiaria;
    }
}
