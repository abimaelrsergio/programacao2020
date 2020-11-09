package br.com.estacio.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Faculdade {
    private String nome;
    private String curso;
    private List<Profissao> profissoes = new ArrayList<>();

    public Faculdade(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public void adicionar(Profissao profissao){
        this.profissoes.add(profissao);
    }

    public List<Profissao> getProfissoes() {
        return Collections.unmodifiableList(profissoes);
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }
}
