package br.edu.ifgoiano.construtores.exercicio05;

public class Main {
  public static void main(String[] args) {
    Disciplina matematica = new Disciplina("Matemática", 50, "Zezim");
    Disciplina portugues = new Disciplina("Português", 50, "Denecley");
    Disciplina historia = new Disciplina("História", 50, "Rosana");

    Aluno aluno = new Aluno("202500001", "Robert");

    aluno.adicionarDisciplina(matematica);
    aluno.adicionarDisciplina(portugues);
    aluno.adicionarDisciplina(historia);

    aluno.registrarNota(0, 1);
    aluno.registrarNota(1, 2);
    aluno.registrarNota(2, 9);

    aluno.setFrequencia(100);

    System.out.println(aluno.calcularMedia());
    System.out.println(aluno.verificarAprovacao());

  }
}
