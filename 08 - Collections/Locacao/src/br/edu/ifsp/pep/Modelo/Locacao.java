package br.edu.ifsp.pep.Modelo;

import java.time.LocalDate;

public class Locacao {
    private int id;
    private int incrementID = 1;
    private LocalDate data;
    private Pessoa pessoa;

    public Locacao(Pessoa pessoa) {
        this.id = incrementID;
        incrementID++;
        this.data = LocalDate.now();
        this.pessoa = pessoa;
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
