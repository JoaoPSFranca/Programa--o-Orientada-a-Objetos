package br.edu.ifsp.pep;

public class SobrecargaDeMetodo {
    public int calcularQuadrado(int numero){
        System.out.println("Chamada do método " + "recebendo o parâmetro int. ");
        return numero * numero;
    }
    
    public double calcularQuadrado(double numero){
        System.out.println("Chamada do método " + "recebendo o parâmetro double. ");
        return numero * numero;
    }
}
