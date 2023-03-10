import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Script");
        curso2.setDescricao("Descrição curso Java Script");
        curso2.setCargahoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Develop");
        bootcamp.setDescricao("Descrição Bootcamp Java Develop");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVanessa = new Dev();
        devVanessa.setNome("Vanessa");
        devVanessa.inscreverBootcampo(bootcamp);
        System.out.println("Conteúdos Inscritos de Vanessa: " + devVanessa.getConteudosInscritos());
        devVanessa.progredir();
        System.out.println("____");
        System.out.println("Conteúdos Inscritos de Vanessa: " + devVanessa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Vanessa: " + devVanessa.getConteudosConcluidos());
        System.out.println("XP: " + devVanessa.calcularTotalXp());

        System.out.println("_______________________________________");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcampo(bootcamp);
        System.out.println("Conteúdos Inscritos de Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("____");
        System.out.println("Conteúdos Inscritos de Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

    }
}