import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        LocalDate data = LocalDate.now();

        Curso curso = new Curso(8, "curso java", "descrição curso java");

        Curso curso1 = new Curso(8, "curso js", "descrição curso js");

        Mentoria mentoria = new Mentoria(data, "descrição mentoria java", "mentoria de java");

        System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);
    }
}