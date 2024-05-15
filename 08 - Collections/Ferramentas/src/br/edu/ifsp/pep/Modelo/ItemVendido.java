package br.edu.ifsp.pep.Modelo;

public class ItemVendido {
    private FerramentaVenda fv;
    private Venda v;
    private int quantidade;

    public ItemVendido(FerramentaVenda fv, Venda v, int quantidade) {
        this.fv = fv;
        this.v = v;
        this.quantidade = quantidade;
    }

    public FerramentaVenda getFv() {
        return fv;
    }

    public void setFv(FerramentaVenda fv) {
        this.fv = fv;
    }

    public Venda getV() {
        return v;
    }

    public void setV(Venda v) {
        this.v = v;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
