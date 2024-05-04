package br.edu.ifsp.pep;

import br.edu.ifsp.pep.modelo.FormaBidimensional;
import br.edu.ifsp.pep.modelo.Circulo;
import br.edu.ifsp.pep.modelo.Quadrado;
import br.edu.ifsp.pep.modelo.Triangulo;

public class principal {
    public static void main(String[] args){
        FormaBidimensional fb = new FormaBidimensional();
        fb.setNome("Forma Bidimensional. ");
        
        Circulo cc = new Circulo();
        cc.setNome("Circulo. ");
        
        Quadrado qua = new Quadrado();
        qua.setNome("Quadrado. ");
        
        Triangulo tri = new Triangulo();
        tri.setNome("Triângulo. ");
        
        fb.exibir();
        cc.exibir();
        qua.exibir();
        tri.exibir();
    }
}
