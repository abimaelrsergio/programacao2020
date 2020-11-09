package br.com.estacio.ads;

public class Profissao implements Comparable<Profissao> {

    private String nome;
    private int anosExperiencia;

    public Profissao(String nome, int anosExperiencia) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Profissao{" +
                "nome='" + nome + '\'' +
                ", anosExperiencia=" + anosExperiencia +
                '}';
    }

    public int compareTo(Profissao outraProfissao) {
        return this.nome.compareTo(outraProfissao.nome);
    }
}
