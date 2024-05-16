package br.edu.ifsp.pep;

import java.time.LocalDate;
import br.edu.ifsp.pep.controller.ItemAlugadoController;
import br.edu.ifsp.pep.controller.ItemVendidoController;
import br.edu.ifsp.pep.models.Aluguel;
import br.edu.ifsp.pep.models.Cliente;
import br.edu.ifsp.pep.models.FerramentaAluguel;
import br.edu.ifsp.pep.models.FerramentaVenda;
import br.edu.ifsp.pep.models.Funcionario;
import br.edu.ifsp.pep.models.Venda;

public class Principal {
    public static ItemVendidoController ivc = new ItemVendidoController();
    public static ItemAlugadoController iac = new ItemAlugadoController();
    
    public static void main(String[] args) {
        Cliente c1 = new Cliente("765.840.325-31", "Tereza Costa", "terezacosta@gmail.com.br", "(67) 3728-2967", 2000);
        Cliente c2 = new Cliente("369.416.856-70", "Cauê Nunes", "cauenunes@gmail.com.br", "(63) 2503-4280", 1500);
        
        Funcionario f1 = new Funcionario("Atendente", 2132.00, "971.672.444-65", "Otávio Moreira", "otaviomoreira@hotmail.com.br", "(71) 3995-5555");
        Funcionario f2 = new Funcionario("Sub-Gerente", 2740.00, "772.826.444-38", "Arthur da Paz", "arthurdapaz@hotmail.com.br", "(81) 99824-6667");
        
        FerramentaAluguel fa1 = new FerramentaAluguel("Machado", 10);
        FerramentaAluguel fa2 = new FerramentaAluguel("Martelo", 5);
        FerramentaAluguel fa3 = new FerramentaAluguel("Parafusadeira", 15);
        FerramentaAluguel fa4 = new FerramentaAluguel("Caixa de Ferramentas", 20);
        
        FerramentaVenda fv1 = new FerramentaVenda("Arco de Serra", 15);
        FerramentaVenda fv2 = new FerramentaVenda("Alicate", 20);
        FerramentaVenda fv3 = new FerramentaVenda("Nivel", 10);
        
        Venda v1 = new Venda(LocalDate.of(2024, 03, 27), c1);
        Venda v2 = new Venda(LocalDate.of(2024, 04, 15), c2);
        Venda v3 = new Venda(LocalDate.of(2024, 04, 30), c1);
        Venda v4 = new Venda(LocalDate.of(2024, 05, 12), c2);
        
        ivc.adicionar(fv1, v1, 3);
        ivc.adicionar(fv2, v2, 2);
        ivc.adicionar(fv3, v3, 5);
        ivc.adicionar(fv2, v4, 1);
        
        Aluguel a1 = new Aluguel(LocalDate.now(), LocalDate.now().plusDays(4), f2, c1, fa1); 
        Aluguel a2 = new Aluguel(LocalDate.now(), LocalDate.now().plusDays(3), f1, c2, fa2); 
        Aluguel a3 = new Aluguel(LocalDate.now(), LocalDate.now().plusDays(6), f2, c1, fa3); 
        Aluguel a4 = new Aluguel(LocalDate.now(), LocalDate.now().plusDays(7), f1, c2, fa4); 
        
        iac.adicionar(a1, fa1);
        iac.adicionar(a2, fa2);
        iac.adicionar(a3, fa3);
        iac.adicionar(a4, fa4);
        
        //apresentar locacoes e vendas pelo cliente 1
        iac.LocacoesCliente("765.840.325-31");
        ivc.VendasCliente("765.840.325-31");
        
        //Total gastos pelo cliente 2
        double total = iac.totalLocacoesCliente("369.416.856-70");
        total += ivc.totalVendasCliente("369.416.856-70");
        System.out.println("\nTotal gasto pelo cliente " + c2.getNome() + ": R$" + total);
        
        //total vendido de uma ferramenta
        System.out.println("Total de " + fv2.getNome() + " vendidas: " + ivc.quantidadeVedndidaFerramenta(fv2.getCodigo()));
        
        //total recebido de locações por um funcionário
        total = iac.totalLocacoesFuncionario(f1.getCpf());
        System.out.println("\nTotal ganho pelo funcionario " + f1.getNome() + ": R$" + total);
    }
}
