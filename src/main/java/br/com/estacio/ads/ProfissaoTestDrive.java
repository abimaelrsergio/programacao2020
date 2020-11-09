package br.com.estacio.ads;

import java.util.ArrayList;

public class ProfissaoTestDrive {
    public static void main(String[] args) {
        Profissao p1 = new Profissao("Pedreiro", 20);
        Profissao p2 = new Profissao("Arquiteto", 2);
        Profissao p3 = new Profissao("Marceneiro", 7);
        ArrayList<Profissao> profissoes = new ArrayList<Profissao>();
        profissoes.add(p1);
        profissoes.add(p2);
        profissoes.add(p3);
        System.out.println(profissoes);
    }
}
