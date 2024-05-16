package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.model.ItemVenda;
import br.edu.ifsp.pep.model.Venda;
import br.eud.ifsp.pep.exception.CodigoInvalido;
import br.eud.ifsp.pep.exception.TipoPagamentoInvalido;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class vendaController {
    private static final ArrayList<Venda> vendas = new ArrayList<>();
    
    public static boolean verificarCodigo(int codigo){
        boolean verificar = true;
        
        for (Venda v : vendas) {
            if(v.getCodigo() == codigo)
                verificar = false;
        }
        
        return verificar;
    }
    
    public static boolean verificarTipoPagamento(String tipoPagamento){
        boolean verificar = true;
        
        if(!tipoPagamento.equalsIgnoreCase("dinheiro"))
            verificar = false;
        else if(!tipoPagamento.equalsIgnoreCase("cheque"))
            verificar = false;
        else if(!tipoPagamento.equalsIgnoreCase("cartao"))
            verificar = false;
        
        return verificar;
    }
    
    public static void adicionarVenda(String tipoPagamento, ArrayList<ItemVenda> itens, int codigo) throws CodigoInvalido {
        if(!verificarCodigo(codigo))
            throw new CodigoInvalido("Código Invalido. ");
        else{
            if(!verificarTipoPagamento(tipoPagamento))
                throw new CodigoInvalido("Tipo de pagamento invalido. ");
            else{
                Venda v = new Venda(LocalDate.now(), tipoPagamento, itens, codigo);
                vendas.add(v);
            }
        }
    }
    
    public static double totalVenda(Venda v){
        double total = 0.0;
        
        for (ItemVenda iv : v.getItens()) {
            total += iv.getPreco() * iv.getQuantidade();
        }
        
        return total;
    }
    
    public static double procurarTotalVenda(int codigo) throws CodigoInvalido{
        if(!verificarCodigo(codigo))
            throw new CodigoInvalido("Código Invalido. ");
        else{
            Venda ve;
            double total = 0.0;
            
            for (Venda v : vendas) {
                if(v.getCodigo() == codigo){
                    ve = v;
                    total = ve.getTotalVenda();
                }
            }
            return total;
        }
    }
    
    public static ArrayList<Venda> procurarVendaTipoPagamento(String tipoPagamento) throws TipoPagamentoInvalido{
        ArrayList<Venda> ve = new ArrayList<>();
        
        if(!verificarTipoPagamento(tipoPagamento))
            throw new TipoPagamentoInvalido("Tipo de pagamento invalido. ");
        else{
            for (Venda v : vendas) {
                if(v.getTipoPagamento().equalsIgnoreCase(tipoPagamento)){
                    ve.add(v);
                }
            }
        }
        
        return ve;
    }
    
    public static double totalVendasTipoPagamento(String tipoPagamento) throws TipoPagamentoInvalido{
        double total = 0.0;
        
        if(!verificarTipoPagamento(tipoPagamento))
            throw new TipoPagamentoInvalido("Tipo de pagamento invalido. ");
        else{
            ArrayList<Venda> v = procurarVendaTipoPagamento(tipoPagamento);
            
            for (Venda ve : v) {
                total += ve.getTotalVenda();
            }
        }
        
        return total;
    }
    
    public static List<Venda> ordenarTipoPagamento(){
        List<Venda> ve = vendas;
        Collections.sort(ve);
        return ve;
    }
}
