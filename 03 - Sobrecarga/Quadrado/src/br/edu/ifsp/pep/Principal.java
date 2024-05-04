package br.edu.ifsp.pep;

public class Principal {
    public static void main(String[] args) {
        SobrecargaDeMetodo sobrecarga = new SobrecargaDeMetodo();
        
        double resultado = sobrecarga.calcularQuadrado(5.0);
        System.out.println("Resultado 1: " + resultado);
        
        int resultado2 = sobrecarga.calcularQuadrado(50);
        System.out.println("Resultado 2: " + resultado2);
    }
}
