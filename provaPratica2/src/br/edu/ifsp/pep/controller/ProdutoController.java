package br.edu.ifsp.pep.controller;

import br.edu.ifsp.pep.model.Produto;
import br.eud.ifsp.pep.exception.CodigoInvalido;
import java.util.ArrayList;

public class ProdutoController {
    private static final ArrayList<Produto> prods = new ArrayList<>();
    
    public static boolean verificarCodigo(int codigo){
        boolean verificar = true;
        
        for (Produto prod : prods) {
            if(prod.getCodigo() == codigo)
                verificar = false;
        }
        
        return verificar;
    }
    
    public static void adicionarProd(int codigo, String nome, int quantidadeEstoque, double preco) throws CodigoInvalido {
        if(!verificarCodigo(codigo))
            throw new CodigoInvalido("Código Invalido. ");
        else{
            Produto prod = new Produto(codigo, nome, quantidadeEstoque, preco);
            prods.add(prod);
        }
    }
}
