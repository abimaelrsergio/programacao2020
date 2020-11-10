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
}
