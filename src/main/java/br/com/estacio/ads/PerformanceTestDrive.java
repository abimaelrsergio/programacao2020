package br.com.estacio.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class PerformanceTestDrive {
    public static void main(String[] args) {
        //Collection<Integer> numeros = new ArrayList<>();
        Collection<Integer> numeros = new HashSet<>();
        long inicio = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++){
            numeros.add(i);
        }
        long tempoAdd = System.currentTimeMillis();
        long inicioBusca = System.currentTimeMillis();
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }
        long fimBusca = System.currentTimeMillis();
        long fim = System.currentTimeMillis();
        long tempoTotal = fim - inicio;
        System.out.println("Tempo add(): " + (tempoAdd - inicio));
        System.out.println("Tempo contains(): " + (fimBusca - inicioBusca));
        System.out.println("Tempo gasto: " + tempoTotal);
    }
}
