package br.com.estacio.ads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComparacaoListas {
    public static void main(String[] args) {
        System.out.println("### LinkedList e ArrayList ###");
        List<Integer> numerosArrayList  = new ArrayList<>();
        List<Integer> numerosLinkedList = new LinkedList<>();
        int quantidadeElementos = 10000000;
        long tempoArrayList  = inserirElementos(numerosArrayList, quantidadeElementos);
        long tempoLinkedList = inserirElementos(numerosLinkedList, quantidadeElementos);
        System.out.println("Tempo inserção no ArrayList: " + tempoArrayList);
        System.out.println("Tempo inserção no LinkedList: " + tempoLinkedList);
        tempoArrayList  = removerPrimeirosItens(numerosArrayList);
        tempoLinkedList = removerPrimeirosItens(numerosLinkedList);
        System.out.println("Tempo remoção ArrayList: " + tempoArrayList);
        System.out.println("Tempo remoção LinkedList: " + tempoLinkedList);
    }

    private static long inserirElementos(List<Integer> numeros, int quantidade){
        long tempoInicial = System.currentTimeMillis();
        for(int i = 0; i < quantidade; i++){
            numeros.add(i);
        }
        long tempoFinal = System.currentTimeMillis();
        return tempoFinal - tempoInicial;
    }

    private static long removerPrimeirosItens(List<Integer> numeros) {
        long ini = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            numeros.remove(0);
        }
        long fim = System.currentTimeMillis();
        return fim - ini;
    }
}
