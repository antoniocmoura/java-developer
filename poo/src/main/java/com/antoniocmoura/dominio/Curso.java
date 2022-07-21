package com.antoniocmoura.dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
public class Curso extends Conteudo {

    private int cargaHoraria;

    protected Curso(
            final String titulo,
            final String descricao,
            final int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public static Curso novoCurso(String aTitulo, String aDescricao, int aCargaHoraria) {
        return new Curso(aTitulo, aDescricao, aCargaHoraria);
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        final var titulo = this.getTitulo();
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
