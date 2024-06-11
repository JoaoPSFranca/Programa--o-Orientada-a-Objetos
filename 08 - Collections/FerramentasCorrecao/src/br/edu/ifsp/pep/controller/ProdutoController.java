package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    private List<Produto> produtos  = new ArrayList<>();
    
    public void adicionar(Produto produto) throws Exception {
        for (Produto p : produtos) {
            if (p.getCodigo() == produto.getCodigo()) {
                throw new Exception("Já existe um produto com esse código");
            }
        }
        
        this.produtos.add(produto);
    }
}
