package br.edu.ifsp.pep.Model;

public class Ave extends Animal{

    public Ave(String nome) {
        super(nome);
    }
    
    public void voar(){
        System.out.println("A ave " + super.getNome() + " voou. ");
    }
}
