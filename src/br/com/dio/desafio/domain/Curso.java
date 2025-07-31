package br.com.dio.desafio.domain;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {
        super();
    }

    public Curso(int cargahoraria, String titulo, String descricao) {
        super(descricao, titulo);
        this.cargaHoraria = cargahoraria;
    }


    @Override
    public double calcularXp() {
        return XP_PADRAO + cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria=" + cargaHoraria +
                ", titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                '}';
    }
}
