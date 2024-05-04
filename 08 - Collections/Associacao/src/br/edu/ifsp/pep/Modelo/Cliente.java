package br.edu.ifsp.pep.Modelo;

public class Cliente {
    private int codigo;
    private String nome;
    private String contato;

    public Cliente(int codigo, String nome, String contato) {
        this.codigo = codigo;
        this.nome = nome;
        this.contato = contato;
    }
 
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    
}
