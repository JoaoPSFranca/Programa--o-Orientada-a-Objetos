package br.edu.ifsp.pep;

import br.edu.ifsp.pep.Modelo.Cliente;
import br.edu.ifsp.pep.Modelo.Venda;
import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(1, "Cesar", "(18) 91423-1234");
       
        Venda v1 = new Venda(1, LocalDateTime.now(), "Cartão Crédito", c1);
       
        System.out.println("Informações do Cliente: ");
        System.out.println("Nome: " + c1.getNome());
        
        System.out.println("Informações da Venda: ");
        System.out.println("Numero nota fiscal: " + v1.getNumeroNotaFiscal());
        System.out.println("Forma de pagamento: " + v1.getFormaPagamento());
        System.out.println("Data: " + v1.getData());
        
        System.out.println("Codigo do cliente: " + v1.getCliente().getCodigo());
        System.out.println("Nome do cliente: " + v1.getCliente().getNome());
        System.out.println("Contato do cliente: " + v1.getCliente().getContato());
    }
}
