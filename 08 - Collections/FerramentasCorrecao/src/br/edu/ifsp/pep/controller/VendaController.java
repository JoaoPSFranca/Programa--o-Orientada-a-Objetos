package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.model.Venda;
import java.util.ArrayList;
import java.util.List;

public class VendaController {
    private List<Venda> Vendas = new ArrayList<>();
    
    public double getValorTotal(int codigo){
        for (Venda venda : Vendas) {
            if (venda.getCodigo() == codigo) {
                return venda.getValorTotal();
            }
        }
    }
}
