import br.com.dio.desafio.domain.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        LocalDate data = LocalDate.now();

        Curso curso = new Curso(8, "curso java", "descrição curso java");

        Curso curso1 = new Curso(8, "curso js", "descrição curso js");

        Mentoria mentoria = new Mentoria(data, "descrição mentoria java", "mentoria de java");

        Bootcamp javaBootcamp = new Bootcamp("Bootcamp java", "Descrição bootcamp Java Developer");
        javaBootcamp.getConteudos().add(curso);
        javaBootcamp.getConteudos().add(curso1);
        javaBootcamp.getConteudos().add(mentoria);


        Dev gabrielDeveloperJava = new Dev("Gabriel");
        gabrielDeveloperJava.inscreverBootcamp(javaBootcamp);
        System.out.println("Conteúdos Inscritos Gabriel:" + gabrielDeveloperJava.getConteudosInscritos());
        gabrielDeveloperJava.progredir();
        gabrielDeveloperJava.progredir();
        gabrielDeveloperJava.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gabriel:" + gabrielDeveloperJava.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Gabriel:" + gabrielDeveloperJava.getConteudosConcluidos());
        System.out.println("XP: " + gabrielDeveloperJava.calcularTotalXp());

        System.out.println("-------------------------------------");

        Dev taynaraDeveloperJava = new Dev("Taynara");
        taynaraDeveloperJava.inscreverBootcamp(javaBootcamp);
        System.out.println("Conteúdos Inscritos Taynara:" + taynaraDeveloperJava.getConteudosInscritos());
        taynaraDeveloperJava.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Taynara:" + taynaraDeveloperJava.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Taynara:" + taynaraDeveloperJava.getConteudosConcluidos());
        System.out.println("XP: " + taynaraDeveloperJava.calcularTotalXp());


    }
}