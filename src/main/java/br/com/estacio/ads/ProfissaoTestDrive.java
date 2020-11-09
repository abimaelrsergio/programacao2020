package br.com.estacio.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProfissaoTestDrive {
    public static void main(String[] args) {
        Profissao p1 = new Profissao("Pedreiro", 2);
        Profissao p2 = new Profissao("Arquiteto", 20);
        Profissao p3 = new Profissao("Marceneiro", 7);
        ArrayList<Profissao> profissoes = new ArrayList<Profissao>();
        profissoes.add(p1);
        profissoes.add(p2);
        profissoes.add(p3);
        System.out.println(profissoes);
        Collections.sort(profissoes);
        System.out.println(profissoes);
        Collections.sort(profissoes, Comparator.comparing(Profissao::getAnosExperiencia));
        System.out.println(profissoes);
    }
}
