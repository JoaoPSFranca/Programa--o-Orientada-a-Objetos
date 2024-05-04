package br.edu.ifsp.pep.modelo;

public class FormaBidimensional {
    
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void exibir(){
        System.out.println(this.nome);
    }
}
