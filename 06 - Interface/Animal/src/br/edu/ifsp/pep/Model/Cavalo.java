package br.edu.ifsp.pep.Model;

public class Cavalo extends Mamifero implements AnimalDomesticado{
    public Cavalo(String nome) {
        super(nome);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O cavalo " + super.getNome() + " relinchou. ");
    }
    
    @Override
    public void amamentar(){
        System.out.println("O cavalo " + super.getNome() + " amamentou. ");
    }
    
    @Override
    public void alimentar(){
        System.out.println("O cavalo " + super.getNome() + " foi alimentado. ");
    }
    
    @Override
    public void levarVeterinario(){
       System.out.println("O cavalo " + super.getNome() + " foi levado ao veterinario. ");
    }
}
