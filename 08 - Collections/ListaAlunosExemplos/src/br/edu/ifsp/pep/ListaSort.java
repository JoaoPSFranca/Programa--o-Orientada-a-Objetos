package br.edu.ifsp.pep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaSort {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Joao da Silva");
        lista.add("Antonio Souza");
        lista.add("Lucia Ferreira");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
