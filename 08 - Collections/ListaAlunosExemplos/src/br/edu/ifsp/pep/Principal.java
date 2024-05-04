package br.edu.ifsp.pep;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        final int MAX = 20000;
        long tInicio = System.currentTimeMillis();
        List<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < MAX; i++) {
            lista.add(i);
        }
        for (int i = 0; i < MAX; i++) {
            lista.contains(i);
        }
        long tFim = System.currentTimeMillis();
        System.out.println("Temtpo total: " + (tFim - tInicio) + "ms");
    }
}
