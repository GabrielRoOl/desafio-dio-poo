package br.com.dio.desafio.domain;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public Conteudo() {}

    public Conteudo(String descricao, String titulo) {
        this.descricao = descricao;
        this.titulo = titulo;
    }

    public abstract double calcularXp();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
