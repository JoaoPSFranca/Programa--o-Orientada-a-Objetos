import br.edu.ifsp.pep.modelo.Invoice;
import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String numero;
        String desc;
        int quantidade;
        double preco;
        
        System.out.print("Informe o numero do produto 1: ");
        numero = ler.next();
        
        System.out.print("Informe a descricao do produto 1: ");
        desc = ler.next();
        
        System.out.print("Informe a quantidade do produto 1: ");
        quantidade = ler.nextInt();
        
        System.out.print("Informe o preco do produto 1: ");
        preco = ler.nextDouble();
        
        Invoice i = new Invoice(numero, desc, quantidade, preco);
        
        System.out.print("\nInforme o numero do produto 2: ");
        numero = ler.next();
        
        System.out.print("Informe a descricao do produto 2: ");
        desc = ler.next();
        
        System.out.print("Informe a quantidade do produto 2: ");
        quantidade = ler.nextInt();
        
        System.out.print("Informe o preco do produto 2: ");
        preco = ler.nextDouble();
        
        Invoice i2 = new Invoice(numero, desc, quantidade, preco);
    
        System.out.println("\nTotal do produto 1: " + i.getInvoiceAmount());
        System.out.print("Total do produto 2: " + i2.getInvoiceAmount());
        System.out.println("\nTotal da fatura: " + (i.getInvoiceAmount() + i2.getInvoiceAmount()));
    
    }
    
}
