package br.edu.ifsp.pep.Model;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    protected void emitirSom(){
        System.out.println("Animal emitiu som. ");
    }
}
