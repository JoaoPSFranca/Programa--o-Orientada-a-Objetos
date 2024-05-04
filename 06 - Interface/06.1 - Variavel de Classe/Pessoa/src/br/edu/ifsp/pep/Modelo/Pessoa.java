package br.edu.ifsp.pep.Modelo;

public class Pessoa {
    private static String curso;
    private static int incrementarCodigo = 0;
    
    private int codigo;
    private String nome;
    private String cpf;

    public int getCodigo() {
        return codigo;
    }

    public Pessoa(String nome, String cpf) {
        this.codigo = ++incrementarCodigo;
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        Pessoa.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
