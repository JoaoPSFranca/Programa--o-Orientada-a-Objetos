package br.edu.ifsp.pep.modelo;

public class TecnicoAdministrativo extends Pessoa{
    private String setor;
    private String cargo;

    public TecnicoAdministrativo(String setor, String cargo, String prontuario, String nome, String telefone) {
        super(prontuario, nome, telefone);
        this.setor = setor;
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
