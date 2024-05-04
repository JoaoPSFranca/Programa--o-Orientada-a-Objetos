import br.edu.ifsp.pep.modelo.Employee;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        String sobrenome;
        double salario;
        
        System.out.print("Informe o nome do priemiro employee: ");
        nome = ler.next();
        
        System.out.print("Informe o sobrenome do priemiro employee: ");
        sobrenome = ler.next();
        
        System.out.print("Informe o salario mensal do priemiro employee: ");
        salario = ler.nextDouble();
        
        Employee e = new Employee(nome, sobrenome, salario);
        
        System.out.print("\nInforme o nome do segundo employee: ");
        nome = ler.next();
        
        System.out.print("Informe o sobrenome do segundo employee: ");
        sobrenome = ler.next();
        
        System.out.print("Informe o salario mensal do segundo employee: ");
        salario = ler.nextDouble();
        
        Employee e2 = new Employee(nome, sobrenome, salario);
        
        System.out.println("\n--------------------------------------------");
        System.out.println("Employee name: " + e.getName());
        System.out.println("Employee surname: " + e.getSurname());
        System.out.println("Employee salary: " + e.getAnnualSalary());
        System.out.println("--------------------------------------------");
        System.out.println("Employee name: " + e2.getName());
        System.out.println("Employee surname: " + e2.getSurname());
        System.out.println("Employee salary: " + e2.getAnnualSalary());
        System.out.println("--------------------------------------------");
        
        e.setIncreasedAnnualSalary();
        e2.setIncreasedAnnualSalary();
        
        System.out.println("\nGerando aumento de salario...\n");
        
        System.out.println("--------------------------------------------");
        System.out.println("Employee name: " + e.getName());
        System.out.println("Employee surname: " + e.getSurname());
        System.out.println("Employee salary: " + e.getAnnualSalary());
        System.out.println("--------------------------------------------");
        System.out.println("Employee name: " + e2.getName());
        System.out.println("Employee surname: " + e2.getSurname());
        System.out.println("Employee salary: " + e2.getAnnualSalary());
        System.out.println("--------------------------------------------\n");
    }
}