package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(){}

    public Mentoria(LocalDate data, String descrição, String mentoria) {
        super(descrição, mentoria);
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                ", titulo='" + getTitulo() +
                ", descrição='" + getDescricao() +
                "data=" + data +
                '}';
    }
}
