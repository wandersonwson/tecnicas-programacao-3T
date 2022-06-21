package dev.wson.tecnicas.exercicio2;

public class Aluno {
    private String nome;
    private String genero;
    private double nota;

    public Aluno(String nome, String genero, double nota) {
        this.nome = nome;
        this.genero = genero;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public double getNota() {
        return nota;
    }
    @Override
    public String toString() {
        return String.format("%s [Gênero: %s; Nota: %.1f]", nome, genero, nota);
    }
}