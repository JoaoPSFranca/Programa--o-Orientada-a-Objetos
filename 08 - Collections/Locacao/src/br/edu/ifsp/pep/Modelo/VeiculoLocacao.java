package br.edu.ifsp.pep.Modelo;

import java.time.LocalDate;

public class VeiculoLocacao {
    private int diasLocacao;
    private LocalDate dataDevolucao;
    private Veiculo veiculo;
    private Locacao locacao;

    public VeiculoLocacao(int diasLocacao, Veiculo veiculo, Locacao locacao) {
        this.diasLocacao = diasLocacao;
        this.veiculo = veiculo;
        this.locacao = locacao;
        this.setDataDevolucao();
    }
    
    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    public int getDiasLocacao() {
        return diasLocacao;
    }

    public void setDiasLocacao(int diasLocacao) {
        this.diasLocacao = diasLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao() {
        this.dataDevolucao = this.locacao.getData().plusDays(this.diasLocacao);
    }
}
