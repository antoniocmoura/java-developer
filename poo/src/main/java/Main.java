import com.antoniocmoura.dominio.Aluno;
import com.antoniocmoura.dominio.Bootcamp;
import com.antoniocmoura.dominio.Curso;
import com.antoniocmoura.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        final var cursoJava = Curso.novoCurso("Introdução ao Java", "Curso de Java Básico", 8);
        final var cursoPoo = Curso.novoCurso("Programação Orientada a Objetos", "Fundamentos da Programação Orientada a Objetos", 6);

        final var mentoriaJava = Mentoria.novaMentoria("Mentoria de Java", "Orientação a Objetos", LocalDate.now());

        final var aluno1 = Aluno.novoAluno("Antonio Carlos de Moura");
        final var aluno2 = Aluno.novoAluno("José da Silva");

        final var bootcamp = Bootcamp.novoBootcamp("Bootcamp Java Developer", "Java do Básico ao Avançado");
        bootcamp.adicionarConteudo(cursoJava);
        bootcamp.adicionarConteudo(cursoPoo);
        bootcamp.adicionarConteudo(mentoriaJava);
        bootcamp.inscreverAluno(aluno1);
        bootcamp.inscreverAluno(aluno2);

        aluno1.progredir();
        aluno1.progredir();
        aluno1.imprimirProgresso();

        aluno2.progredir();
        aluno2.progredir();
        aluno2.progredir();
        aluno2.imprimirProgresso();

    }
}
