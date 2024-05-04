package br.edu.ifsp.pep;
import br.edu.ifsp.pep.Modelo.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Cesar", "456");
        Pessoa p2 = new Pessoa("Ana", "123");
       
        p1.setCurso("BCC");
       
        System.out.println("Codigo: " + p1.getCodigo());
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Curso: " + p1.getCurso());
        
        System.out.println("\nCodigo: " + p2.getCodigo());
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Curso: " + p2.getCurso());
    }
}
