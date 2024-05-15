package br.edu.ifsp.pep.Modelo;

public class Ferramenta {
    private int incrementCodigo = 0;
    private int codigo;
    private String nome;

    public Ferramenta(String nome) {
        incrementCodigo++;
        this.codigo = incrementCodigo;
        this.nome = nome;
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
}
