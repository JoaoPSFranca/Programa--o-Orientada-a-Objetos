package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.models.Aluguel;
import br.edu.ifsp.pep.models.FerramentaAluguel;
import br.edu.ifsp.pep.models.ItemAlugado;
import java.util.ArrayList;

public class ItemAlugadoController {
    public static final ArrayList<ItemAlugado> itensAlugados = new ArrayList<>();

    public void adicionar(Aluguel a, FerramentaAluguel fa){
        ItemAlugado iv = new ItemAlugado(a, fa);
        itensAlugados.add(iv);
    }
    
    public void LocacoesCliente(String cpf){
        for (ItemAlugado ia : itensAlugados) {
            if(ia.getA().getCliente().getCpf().equals(cpf)){
                Aluguel a = ia.getA();
                System.out.println("\nLocacao: ");
                System.out.println("Data da locacao: " + a.getDataLocacao());
                System.out.println("Data da devolucao: " + a.getDataDevolucao());
                System.out.println("Valor da Diaria: " + a.getValorDiaria());
                System.out.println("Ferramenta: " + a.getFerramentasAluguel().getNome());
                System.out.println("Funcionario: " + a.getFuncionario().getNome());
                System.out.println("Cliente: " + a.getCliente().getNome());
            }
        }
    }
    
    public double totalLocacoesCliente(String cpf){
        double total = 0.0;
        
        for (ItemAlugado ia : itensAlugados) {
            if(ia.getA().getCliente().getCpf().equals(cpf)){
                Aluguel a = ia.getA();
                total += a.getValorAluguel();
            }
        }
        
        return total;
    }
    
    public double totalLocacoesFuncionario(String cpf){
        double total = 0.0;
        
        for (ItemAlugado ia : itensAlugados) {
            if(ia.getA().getFuncionario().getCpf().equals(cpf)){
                Aluguel a = ia.getA();
                total += a.getValorAluguel();
            }
        }
        
        return total;
    }
    
}
