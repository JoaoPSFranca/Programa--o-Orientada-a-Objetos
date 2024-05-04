package br.edu.ifsp.pep.Modelo;

public class PessoaFisica extends ImpostoRenda{
    private double saude;
    private double instrucao;
    private double dependente;

    public double getSaude() {
        return saude;
    }

    public void setSaude(double saude) {
        if(saude >= 5000)
            this.saude = 5000;
        else
            this.saude = saude;
    }

    public double getInstrucao() {
        return instrucao;
    }

    public void setInstrucao(double instrucao) {
        if(instrucao >= 2500)
            this.instrucao = 2500;
        else
            this.instrucao = instrucao;
    }

    public double getDependente() {
        return dependente;
    }

    public void setDependente(int dependente) {
        if (dependente >= 4)
            this.dependente = (double) (4 * 1500);
        else
            this.dependente = (double) dependente * 1500;
    }
    
    @Override
    public void calcularAliquota(){
        double montante = getDependente() + getSaude() + getInstrucao();
        setRendaLiquida(montante);
        
        if(montante < 10000)
            setAliquota(1);
        else
            if(montante < 20000)
                setAliquota(1.1);
            else
                setAliquota(1.25);
    }
    
    @Override
    public void calcularImposto(){
        double valor = getRendaLiquida() * getAliquota();
        setImposto(valor);
    }
}
