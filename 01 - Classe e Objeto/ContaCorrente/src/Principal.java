import br.edu.ifsp.pep.controller.ContaCorrenteController;
import br.edu.ifsp.pep.modelo.ContaCorrente;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    //Poderia ser instanciado no construtor.
    //Por enquanto utilizar static para os atributos da classe Principal.
    private static ContaCorrenteController contaCorrenteController
            = new ContaCorrenteController();

    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        
        int opcao;
        
        do{
            System.out.println("1 - Criar conta corrente. ");
            System.out.println("2 - Apresentar todas as contas. ");
            System.out.println("3 - Apresentar uma conta. ");
            System.out.println("0 - Sair. ");
            
            System.out.println("Escolha uma opção: ");
            opcao = ler.nextInt();
            
            switch (opcao){
                case 1:
                    criarContaCorrente();
                    break;
                case 2:
                    apresentarContaCorrente();
                    break;
                case 3:
                    String numero = ler.next();
                    apresentarUmaContaCorrente(numero);
                    break;
            }
            
        } while(opcao != 0);
        
/*
        ContaCorrente cc = new ContaCorrente("123", 1000);

        System.out.println(cc.getNumero());
        System.out.println(cc.getSaldo());

        //Fazer um depósito: R$ 500.
        cc.depositar(500);
        System.out.println(cc.getSaldo());

        //Fazer um saque: R$ 2000.
        cc.sacar(500);

        System.out.println(cc.getSaldo());

        ContaCorrente c1 = new ContaCorrente("456", 500);
        ContaCorrente c2 = new ContaCorrente("789", 1500);

//        ContaCorrente[] contas = new ContaCorrente[10];
//        contas[0] = cc;
//        contas[1] = c1;
//        contas[2] = c2;
//        ArrayList<ContaCorrente> contas = new ArrayList();
//        contas.add(cc);
//        contas.add(c1);
//        contas.add(c2);
        contaCorrenteController.adicionar(cc);
        contaCorrenteController.adicionar(c1);
        contaCorrenteController.adicionar(c2);

        //Obtém as contas que estão no controller.
        ArrayList<ContaCorrente> contas
                = contaCorrenteController.getContas();

        System.out.println("---------------------");
        for (int i = 0; i < contas.size(); i++) {
            ContaCorrente conta = contas.get(i);
            System.out.println(conta.getSaldo());
        }

        System.out.println("---------------------");
        for (ContaCorrente conta : contas) {
            System.out.println(conta.getSaldo());
        }
*/
    }
    
    //Por enquanto, os métodos da classe principal
    //terão a palavra chave static.
    private static void criarContaCorrente() {
        //Permite ler informações do console.
        Scanner ler = new Scanner(System.in);

//        ler.next() // não lê espaço
//        ler.nextLine() //lê espaço

        //O usuário informa o número da conta.
        System.out.println("Informe o número da conta: ");
        String numero = ler.next();
        
        //O usuário informa o saldo inicial.
        System.out.println("Informe o saldo inicial: ");
        double saldo = ler.nextDouble();
        
        //Cria um objeto do tipo Conta Corrente
        //com as informações que o usuário forneceu.
        ContaCorrente cc = new ContaCorrente(numero, saldo);
        
        //Adiciona o objeto conta corrente na lista
        //que é gerenciada pelo controlador.
        contaCorrenteController.adicionar(cc);
    }
    
    private static void apresentarUmaConta(ContaCorrente conta){
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("-----------------");
    }

    private static void apresentarContaCorrente() {
        //Obter as contas
        ArrayList<ContaCorrente> contas = 
                contaCorrenteController.getContas();
        
        //Percorrer a lista e mostar as informações.
        for (ContaCorrente conta : contas) {
            apresentarUmaConta(conta);
        }
    }
    
    private static void apresentarUmaContaCorrente(String numero){
        ContaCorrente conta = contaCorrenteController.procurar(numero);
        
        System.out.println("-----------------");
        apresentarUmaConta(conta);
    }
}
