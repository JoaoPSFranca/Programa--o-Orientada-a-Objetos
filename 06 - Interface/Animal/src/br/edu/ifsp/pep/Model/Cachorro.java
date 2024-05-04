package br.edu.ifsp.pep.Model;

public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalEstimacao {
    private String tamanho;
    private String raca;

    public Cachorro(String tamanho, String raca, String nome) {
        super(nome);
        this.tamanho = tamanho;
        this.raca = raca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void amamentar() {
        System.out.println("O cachorro" + super.getNome() + " amamentou. ");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro" + super.getNome() + " latiu. ");
    }

    @Override
    public void alimentar(){
        System.out.println("O cachorro " + super.getNome() + " foi alimentado. ");
    }

    @Override
    public void levarVeterinario(){
       System.out.println("O cachorro " + super.getNome() + " foi levado ao veterinario. ");
    }

    @Override
    public void brincar(){
       System.out.println("O usuario brincou com o cachorro " + super.getNome() + ". ");
    }

    @Override
    public void levarPassear(){
       System.out.println("O cachorro " + super.getNome() + " foi levado para passear. ");
    }
}
