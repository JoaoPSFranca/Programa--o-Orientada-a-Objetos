package br.edu.ifsp.pep.modelo;

public class Pessoa {
    private String prontuario;
    private String nome;
    private String telefone;

    public Pessoa(String prontuario, String nome, String telefone) {
        this.prontuario = prontuario;
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
