package br.edu.ifsp.pep;

import br.edu.ifsp.pep.jdbc.Conexao;

public class Principal {
    public static void main(String[] args) {
        if (Conexao.getConexao() == null) {
            System.out.println("Falhou...");
        } else {
            System.out.println("Conectou...");
        }
    }
}
