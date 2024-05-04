package br.edu.ifsp.pep;
import br.edu.ifsp.pep.Exception.DivisaoPorZeroException;
import br.edu.ifsp.pep.Modelo.Calculadora;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o numeroador: ");
        int numero1 = scanner.nextInt();

        System.out.println("Informe o denominador: ");
        int numero2 = scanner.nextInt();
        
        Calculadora calc = new Calculadora(numero1, numero2);
        
        try { 
            calc.dividir(); 
        } 
        catch (DivisaoPorZeroException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
