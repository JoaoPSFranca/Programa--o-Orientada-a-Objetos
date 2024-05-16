package br.edu.ifsp.pep;

import java.time.LocalDate;
import br.edu.ifsp.pep.models.Aluguel;
import br.edu.ifsp.pep.models.Cliente;
import br.edu.ifsp.pep.models.FerramentaAluguel;
import br.edu.ifsp.pep.models.FerramentaVenda;
import br.edu.ifsp.pep.models.Funcionario;
import br.edu.ifsp.pep.models.ItemAlugado;
import br.edu.ifsp.pep.models.ItemVendido;
import br.edu.ifsp.pep.models.Venda;
import java.util.ArrayList;

public class Principal {
    private static final ArrayList<ItemVendido> itensVendidos = new ArrayList<>();
    private static final ArrayList<ItemAlugado> itensAlugados = new ArrayList<>();
    
    public static void LocacoesCliente(String cpf){
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
    
    public static void VendasCliente(String cpf){
        for (ItemVendido iv : itensVendidos) {
            if(iv.getV().getCliente().getCpf().equals(cpf)){
                Venda v = iv.getV();
                System.out.println("\nVenda: ");
                System.out.println("Data da venda: " + v.getDataVenda());
                System.out.println("Ferramenta: " + iv.getFv().getNome());
                System.out.println("Quantidade: " + iv.getQuantidade());
                System.out.println("Quantidade de itens vendidos: " + iv.getQuantidade());
                System.out.println("Cliente: " + v.getCliente().getNome());
            }
        }
    }
    
    public static double totalLocacoesCliente(String cpf){
        double total = 0.0;
        
        for (ItemAlugado ia : itensAlugados) {
            if(ia.getA().getCliente().getCpf().equals(cpf)){
                Aluguel a = ia.getA();
                total += a.getValorAluguel();
            }
        }
        
        return total;
    }
    
    public static double totalVendasCliente(String cpf){
        double total = 0.0;
        
        for (ItemVendido iv : itensVendidos) {
            if(iv.getV().getCliente().getCpf().equals(cpf)){
                total += iv.getFv().getValor() * iv.getQuantidade();
            }
        }
        
        return total;
    }
    
    public static int quantidadeVedndidaFerramenta(int codigo){
        int total = 0;
        
        for (ItemVendido iv : itensVendidos) {
            if(iv.getFv().getCodigo() == codigo){
                total += iv.getQuantidade();
            }
        }
        
        return total;
    }
    
    public static double totalLocacoesFuncionario(String cpf){
        double total = 0.0;
        
        for (ItemAlugado ia : itensAlugados) {
            if(ia.getA().getFuncionario().getCpf().equals(cpf)){
                Aluguel a = ia.getA();
                total += a.getValorAluguel();
            }
        }
        
        return total;
    }
    
    public static void main(String[] args) {
        Cliente c1 = new Cliente("765.840.325-31", "Tereza Costa", "terezacosta@gmail.com.br", "(67) 3728-2967", 2000);
        Cliente c2 = new Cliente("369.416.856-70", "Cauê Nunes", "cauenunes@gmail.com.br", "(63) 2503-4280", 1500);
        
        Funcionario f1 = new Funcionario("Atendente", 2132.00, "971.672.444-65", "Otávio Moreira", "otaviomoreira@hotmail.com.br", "(71) 3995-5555");
        Funcionario f2 = new Funcionario("Sub-Gerente", 2740.00, "772.826.444-38", "Arthur da Paz", "arthurdapaz@hotmail.com.br", "(81) 99824-6667");
        
        FerramentaAluguel fa1 = new FerramentaAluguel("Machado", 47.99);
        FerramentaAluguel fa2 = new FerramentaAluguel("Martelo", 26.49);
        FerramentaAluguel fa3 = new FerramentaAluguel("Parafusadeira", 53.49);
        FerramentaAluguel fa4 = new FerramentaAluguel("Caixa de Ferramentas", 99.99);
        
        FerramentaVenda fv1 = new FerramentaVenda("Arco de Serra", 14.99);
        FerramentaVenda fv2 = new FerramentaVenda("Alicate", 22.49);
        FerramentaVenda fv3 = new FerramentaVenda("Nivel", 7.99);
        
        Venda v1 = new Venda(LocalDate.of(2024, 03, 27), c1);
        Venda v2 = new Venda(LocalDate.of(2024, 04, 15), c2);
        Venda v3 = new Venda(LocalDate.of(2024, 04, 30), c1);
        Venda v4 = new Venda(LocalDate.of(2024, 05, 12), c2);
        
        itensVendidos.add(new ItemVendido(fv1, v1, 3));
        itensVendidos.add(new ItemVendido(fv2, v2, 2));
        itensVendidos.add(new ItemVendido(fv3, v3, 5));
        itensVendidos.add(new ItemVendido(fv2, v4, 1));
        
        Aluguel a1 = new Aluguel(LocalDate.now(), LocalDate.now().plusDays(4), f2, c1, fa1); 
        Aluguel a2 = new Aluguel(LocalDate.now(), LocalDate.now().plusDays(3), f1, c2, fa2); 
        Aluguel a3 = new Aluguel(LocalDate.now(), LocalDate.now().plusDays(6), f2, c1, fa3); 
        Aluguel a4 = new Aluguel(LocalDate.now(), LocalDate.now().plusDays(7), f1, c2, fa4); 
        
        itensAlugados.add(new ItemAlugado(a1, fa1));
        itensAlugados.add(new ItemAlugado(a2, fa2));
        itensAlugados.add(new ItemAlugado(a3, fa3));
        itensAlugados.add(new ItemAlugado(a4, fa4));
        
        //apresentar locacoes e vendas pelo cliente 1
        LocacoesCliente("765.840.325-31");
        VendasCliente("765.840.325-31");
        
        //Total gastos pelo cliente 2
        double total = totalLocacoesCliente("369.416.856-70");
        total += totalVendasCliente("369.416.856-70");
        System.out.println("\nTotal gasto pelo cliente " + c2.getNome() + ": R$" + total);
        
        //total vendido de uma ferramenta
        System.out.println("Total de " + fv2.getNome() + " vendidas: " + quantidadeVedndidaFerramenta(fv2.getCodigo()));
        
        //total recebido de locações por um funcionário
        total = totalLocacoesFuncionario(f1.getCpf());
        System.out.println("\nTotal ganho pelo funcionario " + f1.getNome() + ": R$" + total);
    }
}
