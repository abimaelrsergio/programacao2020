package br.com.estacio.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FaculdadeTestDrive {
    public static void main(String[] args) {
        Faculdade faculdade = new Faculdade("Estácio", "ADS");
        faculdade.adicionar(new Profissao("Carpinteiro", 10));
        faculdade.adicionar(new Profissao("Marceneiro", 2));
        faculdade.adicionar(new Profissao("Arquiteto", 9));
        faculdade.adicionar(new Profissao("Padeiro", 5));
        System.out.println("ordem: " + faculdade.getProfissoes());
        List<Profissao> profissoes = new ArrayList<>(faculdade.getProfissoes());
        Collections.sort(profissoes);
        System.out.println(profissoes);
        System.out.println("Total exp: " + faculdade.getTotalAnosExperiencia());
        System.out.println(faculdade);
    }
}
