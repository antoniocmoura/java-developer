package com.antoniocmoura.dominio;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Aluno {

    private String nome;
    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudosConcluidos;

    protected Aluno(final String nome) {
        this.nome = nome;
        conteudosInscritos = new LinkedHashSet<>();
        conteudosConcluidos = new LinkedHashSet<>();
    }

    public static Aluno novoAluno(final String aNome) {
        return new Aluno(aNome);
    }

    public void inscreverConteudoBootcamp(Set<Conteudo> conteudoBootcamp){
        this.conteudosInscritos.addAll(conteudoBootcamp);
    }


    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Aluno " + nome + " não está matriculado em nenhum conteúdo!");
        }
    }

    public void imprimirProgresso() {
        System.out.println("Conteúdos Inscritos " + nome +  ":" + conteudosInscritos);
        System.out.println("Conteúdos Concluídos " + nome + ":" + conteudosConcluidos);
        System.out.println("XP:" + calcularTotalXp());
    }

    public double calcularTotalXp() {
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp();
            soma += next;
        }
        return soma;
    }

}
