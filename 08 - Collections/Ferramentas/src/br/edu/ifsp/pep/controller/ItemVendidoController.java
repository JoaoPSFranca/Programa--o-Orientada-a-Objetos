package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.models.FerramentaVenda;
import br.edu.ifsp.pep.models.ItemVendido;
import br.edu.ifsp.pep.models.Venda;
import java.util.ArrayList;

public class ItemVendidoController {
    private static final ArrayList<ItemVendido> itensVendidos = new ArrayList<>();
    
    public void adicionar(FerramentaVenda fv, Venda v, int quant){
        ItemVendido iv = new ItemVendido(fv, v, quant);
        itensVendidos.add(iv);
    }
    
    public void VendasCliente(String cpf){
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
    
    public double totalVendasCliente(String cpf){
        double total = 0.0;
        
        for (ItemVendido iv : itensVendidos) {
            if(iv.getV().getCliente().getCpf().equals(cpf)){
                total += iv.getFv().getValor() * iv.getQuantidade();
            }
        }
        
        return total;
    }
    
    public int quantidadeVedndidaFerramenta(int codigo){
        int total = 0;
        
        for (ItemVendido iv : itensVendidos) {
            if(iv.getFv().getCodigo() == codigo){
                total += iv.getQuantidade();
            }
        }
        
        return total;
    }
}
