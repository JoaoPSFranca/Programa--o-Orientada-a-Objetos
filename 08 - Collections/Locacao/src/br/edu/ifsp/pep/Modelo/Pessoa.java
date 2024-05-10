package br.edu.ifsp.pep.Modelo;

public class Pessoa {
    private int id;
    private int incrementID = 1;
    private String nome;

    public Pessoa(String nome) {
        this.id = incrementID;
        incrementID++;
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
