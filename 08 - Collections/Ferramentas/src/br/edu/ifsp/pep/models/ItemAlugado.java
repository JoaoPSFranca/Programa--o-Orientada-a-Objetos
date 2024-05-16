package br.edu.ifsp.pep.models;

public class ItemAlugado {
    private Aluguel a;
    private FerramentaAluguel fa;

    public ItemAlugado(Aluguel a, FerramentaAluguel fa) {
        this.a = a;
        this.fa = fa;
    }

    public Aluguel getA() {
        return a;
    }

    public void setA(Aluguel a) {
        this.a = a;
    }

    public FerramentaAluguel getFa() {
        return fa;
    }

    public void setFa(FerramentaAluguel fa) {
        this.fa = fa;
    }
    
}
