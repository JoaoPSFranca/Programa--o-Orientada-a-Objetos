package br.edu.ifsp.pep.Modelo;

public class Veiculo {
    private int id;
    private int incrementID = 1;
    private String descricao;

    public Veiculo(String descricao) {
        this.id = incrementID;
        incrementID++;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
