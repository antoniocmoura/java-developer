package com.antoniocmoura.dominio;

import lombok.Getter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private Set<Aluno> alunosInscritos;
    private Set<Conteudo> conteudos;

    protected Bootcamp(
            final String nome,
            final String descricao,
            final LocalDate dataInicial,
            final LocalDate dataFinal
    ) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.alunosInscritos = new HashSet<>();
        this.conteudos = new LinkedHashSet<>();
    }

    public static Bootcamp novoBootcamp(
            final String aNome,
            final String aDescricao
    ) {
        return new Bootcamp(
                aNome,
                aDescricao,
                LocalDate.now(),
                LocalDate.now().plusDays(45)
        );
    }

    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    public void inscreverAluno(Aluno aluno) {
        alunosInscritos.add(aluno);
        aluno.inscreverConteudoBootcamp(conteudos);
    }

}
