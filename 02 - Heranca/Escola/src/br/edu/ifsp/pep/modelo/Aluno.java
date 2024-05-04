package br.edu.ifsp.pep.modelo;

public class Aluno extends Pessoa {
    private String curso;
    private int semestre;

    public Aluno(String curso, int semestre, String prontuario, String nome, String telefone) {
        super(prontuario, nome, telefone);
        this.curso = curso;
        this.semestre = semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public int getSemestre() {
        return semestre;
    }
    
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

}
