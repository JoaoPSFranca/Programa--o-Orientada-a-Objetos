package br.edu.ifsp.pep.Modelo;
import br.edu.ifsp.pep.Exception.DivisaoPorZeroException;

public class Calculadora {
    private int numero1;
    private int numero2;

    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public int dividir() throws DivisaoPorZeroException{
        if (numero2 == 0) {
            throw new DivisaoPorZeroException("Não pode dividir por zero");
        }
        return numero1 / numero2;
    }
    
    public int somar(){
        return numero1 + numero2;
    }
}
