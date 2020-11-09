package br.com.estacio.ads;

import java.util.List;

public class FaculdadeTestDrive {
    public static void main(String[] args) {
        Faculdade faculdade = new Faculdade("Estácio", "ADS");
        List<Profissao> profissoes = faculdade.getProfissoes();
        System.out.println(profissoes);
        profissoes.add(new Profissao("Carpinteiro", 10));
        profissoes.add(new Profissao("Marceneiro", 2));
        profissoes.add(new Profissao("Arquiteto", 9));
        System.out.println(profissoes);
    }
}
