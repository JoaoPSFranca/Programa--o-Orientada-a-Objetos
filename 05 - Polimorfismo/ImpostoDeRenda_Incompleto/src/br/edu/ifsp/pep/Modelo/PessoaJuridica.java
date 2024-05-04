package br.edu.ifsp.pep.Modelo;

public class PessoaJuridica extends ImpostoRenda {
    private double pessoal;
    private double equipamentos;

    public double getPessoal() {
        return pessoal;
    }

    public void setPessoal(double pessoal) {
        this.pessoal = pessoal;
    }

    public double getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(double equipamentos) {
        this.equipamentos = equipamentos;
    }
    
    @Override
    public void calcularAliquota(){
        double montante = getPessoal() + getEquipamentos();
        setRendaLiquida(montante);
        
        if(montante < 100000)
            setAliquota(1.05);
        else
            if(montante < 200000)
                setAliquota(1.1);
            else
                setAliquota(1.3);
    }
}
