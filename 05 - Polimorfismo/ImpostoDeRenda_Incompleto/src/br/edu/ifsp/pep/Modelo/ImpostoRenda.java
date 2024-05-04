package br.edu.ifsp.pep.Modelo;

public abstract class ImpostoRenda {
    private double rendaBruta;
    private double rendaLiquida;
    private double aliquota;
    private double imposto;

    public double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    public double getRendaLiquida() {
        return rendaLiquida;
    }

    public void setRendaLiquida(double rendaLiquida) {
        this.rendaLiquida = rendaLiquida;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public abstract void calcularAliquota();
    
    public abstract void calcularImposto();
}