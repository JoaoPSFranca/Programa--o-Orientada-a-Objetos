package br.edu.ifsp.pep;
import br.edu.ifsp.pep.Controller.contaController;
import java.util.Scanner;

public class Principal {
    private final static Scanner ler = new Scanner(System.in);
    private final static contaController cc = new contaController();
     
    public static int menu(){
        int opt;
        
        System.out.println("\nMenu: ");
        System.out.println("1 - Cadastrar conta. ");
        System.out.println("2 - Visualizar saldo. ");
        System.out.println("3 - Depositar. ");
        System.out.println("4 - Sacar. ");
        System.out.println("5 - Transferir valores entre contas. ");
        System.out.println("0 - Sair. ");
        
        System.out.print("\nSua opção: ");
        opt = ler.nextInt();
        ler.nextLine();
        
        return opt;
    }
    
    public static int menuCadastrar(){
        int opt;
        
        System.out.println("\nMenu Cadastrar: ");
        System.out.println("1 - Cadastrar conta corrente. ");
        System.out.println("2 - Cadastrar conta corrente especial. ");
        System.out.println("3 - Cadastrar conta poupança. ");
        System.out.println("0 - voltar. ");
        
        System.out.print("\nSua opção: ");
        opt = ler.nextInt();
        ler.nextLine();
        
        return opt;
    }
    
    public static String lerAgencia(){
        System.out.print("\nInforme a Agencia: ");
        return ler.nextLine();
    }
    
    public static String lerConta(){
        System.out.print("Informe o numero da conta: ");
        return ler.nextLine();
    }
    
    public static String lerProprietario(){
        System.out.print("Informe o proprietario: ");
        return ler.nextLine();
    }
    
    public static String lerEmail(){
        System.out.print("Informe o email: ");
        return ler.nextLine();
    }
    
    public static String lerTelefone(){
        System.out.print("Informe o telefone: ");
        return ler.nextLine();
    }
    
    public static double lerSaldo(){
        System.out.print("Informe o saldo: ");
        double x = ler.nextDouble();
        ler.nextLine();
        return x;
    }
    
    public static int lerDia(){
        System.out.print("Informe o dia de nascimento: ");
        int x = ler.nextInt();
        ler.nextLine();
        return x;
    }
    
    public static int lerMes(){
        System.out.print("Informe o mes de nascimento: ");
        int x = ler.nextInt();
        ler.nextLine();
        return x;
    }
    
    public static int lerAno(){
        System.out.print("Informe o ano nascimento: ");
        int x = ler.nextInt();
        ler.nextLine();
        return x;
    }
    
    public static float lerRemuneracao(){
        System.out.print("Informe o valor da remuneração: ");
        float x = ler.nextFloat();
        ler.nextLine();
        return x;
    }
    
    public static double lerLimite(){
        System.out.print("Informe o limite: ");
        double x = ler.nextDouble();
        ler.nextLine();
        return x;
    }
    
    public static double lerValor(){
        System.out.print("Informe o valor: ");
        double x = ler.nextDouble();
        ler.nextLine();
        return x;
    }
    
    public static void main(String[] args) {
        int 
            opt = -1, 
            opt2,
            dia = 0,
            mes = 0,
            ano = 0;
        String 
            agencia = "", 
            numConta = "",
            proprietario = "",
            email = "",
            telefone = "";
        double
            saldo = 0.0, 
            valor,
            limite;
        float remuneracao;
        
        while(opt != 0){
            opt = menu();
            
            switch(opt){
                case 0 -> {
                }
                case 1 -> {
                    opt2 = menuCadastrar();
                    
                    if(opt2 > 0 && opt2 < 4){
                        agencia = lerAgencia();
                        numConta = lerConta();
                        proprietario = lerProprietario();
                        email = lerEmail();
                        telefone = lerTelefone();
                        saldo = lerSaldo();
                        dia = lerDia();
                        mes = lerMes();
                        ano = lerAno();
                    }
                    
                    switch(opt2){
                        case 0 -> {
                    }
                        case 1 -> cc.criarConta(agencia, numConta, proprietario, email, telefone, saldo, dia, mes, ano);
                        case 2 -> {
                            limite = lerLimite();
                            cc.criarContaCorrenteEspecial(limite, agencia, numConta, proprietario, email, telefone, saldo, dia, mes, ano);
                    }
                        case 3 -> {
                            remuneracao = lerRemuneracao();
                            cc.criarContaPoupanca(remuneracao, agencia, numConta, proprietario, email, telefone, saldo, dia, mes, ano);
                    }
                        default -> System.out.println("Opção inválida!");
                    }
                }
                case 2 -> {
                    agencia = lerAgencia();
                    numConta = lerConta();
                    cc.visualizarSaldo(numConta, agencia);
                }
                case 3 -> {
                    agencia = lerAgencia();
                    numConta = lerConta();
                    valor = lerValor();
                    cc.depositar(numConta, agencia, valor);
                }
                case 4 -> {
                    agencia = lerAgencia();
                    numConta = lerConta();
                    valor = lerValor();
                    cc.sacar(numConta, agencia, valor);
                }
                case 5 -> {
                    System.out.println("\nConta que irá transferir: ");
                    agencia = lerAgencia();
                    numConta = lerConta();
                    
                    System.out.println("\nConta que irá receber: ");
                    String agencia2 = lerAgencia();
                    String numConta2 = lerConta();
                    
                    valor = lerValor();
                    cc.transferir(agencia, numConta, agencia2, numConta2, valor);
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
    
}
