package br.edu.ifsp.pep;
import br.edu.ifsp.pep.Model.Cachorro;
import br.edu.ifsp.pep.Model.Cavalo;
import br.edu.ifsp.pep.Model.Papagaio;

public class Principal {
    public static void main(String[] args) {
        Papagaio papa = new Papagaio("Aroudo");
        Cavalo cava = new Cavalo("Jorge");
        Cachorro cacho = new Cachorro("70cm", "Pincher", "Fernando");
       
        papa.voar();
        papa.emitirSom();
       
        System.out.println("");
        
        cava.emitirSom();
        cava.amamentar();
        cava.alimentar();
        cava.levarVeterinario();
    
        System.out.println("");
        
        cacho.emitirSom();
        cacho.amamentar();
        cacho.alimentar();
        cacho.levarVeterinario();
        cacho.brincar();
        cacho.levarPassear();
    }
}
