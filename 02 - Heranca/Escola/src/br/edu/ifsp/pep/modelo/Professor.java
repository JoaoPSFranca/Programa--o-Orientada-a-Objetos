package br.edu.ifsp.pep.modelo;

public class Professor extends Pessoa {
    private String area_atuante;
    private String tipo_contato;

    public Professor(String area_atuante, String tipo_contato, String prontuario, String nome, String telefone) {
        super(prontuario, nome, telefone);
        this.area_atuante = area_atuante;
        this.tipo_contato = tipo_contato;
    }

    public String getArea_atuante() {
        return area_atuante;
    }

    public void setArea_atuante(String area_atuante) {
        this.area_atuante = area_atuante;
    }
    
    public String getTipo_contato() {
        return tipo_contato;
    }
    
    public void setTipo_contato(String tipo_contato) {
        this.tipo_contato = tipo_contato;
    }

}
