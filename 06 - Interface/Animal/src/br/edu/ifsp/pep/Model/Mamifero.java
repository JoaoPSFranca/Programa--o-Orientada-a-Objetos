package br.edu.ifsp.pep.Model;

public class Mamifero extends Animal{
    public Mamifero(String nome) {
        super(nome);
    }
    
    public void amamentar(){
        System.out.println("O mamifero amamentou. ");
    }
}
