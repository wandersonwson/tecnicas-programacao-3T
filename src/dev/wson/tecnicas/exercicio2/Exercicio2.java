package dev.wson.tecnicas.exercicio2;

import java.util.List;
import java.util.OptionalDouble;

public class Exercicio2 {
    private List<Aluno> alunos;

    public Exercicio2() {
        alunos = inserirAlunos();
    }
    public void iniciar() {
        System.out.println("------ Técnicas de Programação: Exercício 2 ------");
        somarNotasPorGenero();
        calcularMediaPorGenero();
        listarReprovadosPorGenero();
        listarAprovadosPorGenero();
        System.out.println("------");
    }
    private void listarAprovadosPorGenero() {
        System.out.println("Lista de APROVADOS por gênero:");
        System.out.println("Feminino:");
        alunos.stream()
            .filter(a -> a.getGenero().equals("F") && a.getNota() >= 6)
            .forEach(System.out::println);
        System.out.println("Masculino:");
        alunos.stream()
            .filter(a -> a.getGenero().equals("M") && a.getNota() >= 6)
            .forEach(System.out::println);
    }
    private void listarReprovadosPorGenero() {
        System.out.println("Lista de REPROVADOS por gênero:");
        System.out.println("Feminino:");
        alunos.stream()
            .filter(a -> a.getGenero().equals("F") && a.getNota() < 6)
            .forEach(System.out::println);
        System.out.println("Masculino:");
        alunos.stream()
            .filter(a -> a.getGenero().equals("M") && a.getNota() < 6)
            .forEach(System.out::println);
    }
    private void calcularMediaPorGenero() {
        System.out.println("Média das notas por gênero:");
        OptionalDouble mediaFeminina = alunos.stream()
            .filter(a -> a.getGenero().equals("F"))
            .mapToDouble(Aluno::getNota)
            .average();
        System.out.printf("Feminino: %.1f.%n", mediaFeminina.getAsDouble());
        OptionalDouble mediaMasculina = alunos.stream()
            .filter(a -> a.getGenero().equals("M"))
            .mapToDouble(Aluno::getNota)
            .average();
        System.out.printf("Masculino: %.1f.%n", mediaMasculina.getAsDouble());
    }
    private void somarNotasPorGenero() {
        System.out.println("Soma das notas por gênero:");
        Double somaFeminina = alunos.stream()
            .filter(a -> a.getGenero().equals("F"))
            .mapToDouble(Aluno::getNota)
            .reduce(0, Double::sum);
        System.out.printf("Feminino: %.1f.%n", somaFeminina);
        Double somaMasculina = alunos.stream()
            .filter(a -> a.getGenero().equals("M"))
            .mapToDouble(Aluno::getNota)
            .reduce(0, Double::sum);
        System.out.printf("Masculino: %.1f.%n", somaMasculina);
    }
    private List<Aluno> inserirAlunos() {
        return List.of(
            new Aluno("Carlos Alberto", "M", 3.5),
            new Aluno("Maria Rita", "F", 5.5),
            new Aluno("Pedro Augusto", "M", 10),
            new Aluno("Júlia Anchieta", "F", 7.8),
            new Aluno("Felipe Rocha", "M", 4),
            new Aluno("Talita Pereira", "F", 9.2),
            new Aluno("Marcos Silva", "M", 8.9),
            new Aluno("Fabiola Nogueira", "F", 4.5),
            new Aluno("Silvero Teixeira", "F", 8.4),
            new Aluno("Linda Oliveira", "M", 10),
            new Aluno("Carol Chaves", "F", 8.3),
            new Aluno("Juliano Ávila", "M", 4.8),
            new Aluno("Tatiana Junqueira", "F", 10),
            new Aluno("Ricardo Moraes", "M", 6.5),
            new Aluno("Priscila Salgado", "F", 3.8)
        );
    }
}