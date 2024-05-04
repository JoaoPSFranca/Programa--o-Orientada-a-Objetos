import br.edu.ifsp.pep.modelo.Date;
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int mes;
        int dia;
        int ano;
        
        System.out.println("Informe o dia: ");
        dia = ler.nextInt();
        
        System.out.println("Informe o mes: ");
        mes = ler.nextInt();
        
        System.out.println("Informe o ano: ");
        ano = ler.nextInt();
        
        Date data = new Date(mes, dia, ano);
        
        String dataFormatada = data.mnostrarData(dia, mes, ano);
        
        System.out.println(dataFormatada);
    }
}
