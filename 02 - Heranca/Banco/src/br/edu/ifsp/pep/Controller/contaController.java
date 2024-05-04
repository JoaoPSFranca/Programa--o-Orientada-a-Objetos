package br.edu.ifsp.pep.Controller;
import br.edu.ifsp.pep.Modelo.Conta;
import br.edu.ifsp.pep.Modelo.contaCorrenteEspecial;
import br.edu.ifsp.pep.Modelo.contaPoupanca;
import java.util.ArrayList;

public class contaController {
    private final ArrayList<Conta> cc = new ArrayList<>();
    private final ArrayList<contaCorrenteEspecial> cce = new ArrayList<>();
    private final ArrayList<contaPoupanca> ccp = new ArrayList<>();
    
    private Conta validarConta(String numConta, String agencia){
        Conta contaProcurada = null;
        
        for (Conta c : cc) {
            if (c.getAgencia().equals(agencia) && c.getNumConta().equals(numConta)) {
                contaProcurada = c;
                break;
            }
        }
        
        return contaProcurada;
    }
    
    public void criarConta(String agencia, String numConta, String proprietario, String email, String telefone, double saldo, int dia, int mes, int ano){
        Conta c = new Conta(agencia, numConta, proprietario, email, telefone, saldo, dia, mes, ano);
        cc.add(c);
    }
    
    public void criarContaCorrenteEspecial(Double limite, String agencia, String numConta, String proprietario, String email, String telefone, double saldo, int dia, int mes, int ano){
        contaCorrenteEspecial ce = new contaCorrenteEspecial(limite, agencia, numConta, proprietario, email, telefone, saldo, dia, mes, ano);
        cce.add(ce);
        cc.add(ce);
    }
    
    public void criarContaPoupanca(float remuneracao, String agencia, String numConta, String proprietario, String email, String telefone, double saldo, int dia, int mes, int ano){
        contaPoupanca cp = new contaPoupanca(remuneracao, agencia, numConta, proprietario, email, telefone, saldo, dia, mes, ano);
        ccp.add(cp);
        cc.add(cp);
    }

    public void visualizarSaldo(String numConta, String agencia){
        Conta c = validarConta(numConta, agencia);
        
        if (c == null)
            System.out.println("Conta não encontrada. ");
        else
            System.out.println("Saldo da conta: " + c.getSaldo());
    }

    public void depositar(String numConta, String agencia, double saldo){
        Conta c = validarConta(numConta, agencia);
        
        if (c == null)
            System.out.println("Conta não encontrada. ");
        else
            c.depositar(saldo);
    }

    public void sacar(String numConta, String agencia, double valor){
        Conta c = validarConta(numConta, agencia);
        
        if (c == null)
            System.out.println("Conta não encontrada. ");
        else {
            if (c instanceof contaCorrenteEspecial contaCorrente)
                contaCorrente.sacar(valor);
            else
                c.sacar(valor);
        }
    }
    
    public void transferir(String agencia1, String numConta1, String agencia2, String numConta2, double valor){
        Conta c = validarConta(numConta1, agencia1);
        
        if(c != null){
            c = validarConta(numConta2, agencia2);
            
            if(c != null){
                sacar(numConta1, agencia1, valor);
                depositar(numConta2, agencia2, valor);
            } else
                System.out.println("Conta que receberá o valor não foi encontrada. ");
        } else
            System.out.println("A conta que enviará o valor não foi encontrada");
    }
}
