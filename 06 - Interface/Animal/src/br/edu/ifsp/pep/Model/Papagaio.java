package br.edu.ifsp.pep.Model;

public class Papagaio extends Ave{
    public Papagaio(String nome) {
        super(nome);
    }  
    
    @Override
    public void voar(){
        System.out.println("O papagaio " + super.getNome() + " voou. ");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O papagaio " + super.getNome() + " cantou. ");
    }
}
