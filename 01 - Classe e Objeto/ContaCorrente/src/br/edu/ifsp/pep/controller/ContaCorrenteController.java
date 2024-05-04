package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.modelo.ContaCorrente;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
//Armazenar as contas correntes (objetos)
public class ContaCorrenteController {

    private ArrayList<ContaCorrente> contas;

    public ContaCorrenteController() {
        this.contas = new ArrayList<>();
    }

    public void adicionar(ContaCorrente contaCorrente) {
        this.contas.add(contaCorrente);
    }

    //Criar um método para retornar as contas correntes
    //que estão no atributo contas.
    public ArrayList<ContaCorrente> getContas() {
        return contas;
    }
    
    public ContaCorrente procurar(String numero) {
        ContaCorrente c = null;
        
        for (ContaCorrente conta : contas) {
            if(numero.equals(conta.getNumero())){
                c = conta;
            }
        }
        
        return c;
    }
}
