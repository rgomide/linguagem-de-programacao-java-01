package br.edu.ifgoiano.construtores.exercicio05;

public class Aluno {
  private String matricula;
  private String nome;
  private Disciplina[] disciplinas;
  private double[] notas;
  private double frequencia;

  public Aluno(String matricula, String nome) {
    this.matricula = matricula;
    this.nome = nome;

    this.disciplinas = new Disciplina[0];
    this.notas = new double[0];
  }

  public void adicionarDisciplina(Disciplina disciplina) {
    // expande o array de disciplinas em uma nova posicao
    Disciplina[] copiaDisciplinas = new Disciplina[this.disciplinas.length + 1];

    for (int i = 0; i < this.disciplinas.length; i++) {
      copiaDisciplinas[i] = this.disciplinas[i];
    }

    copiaDisciplinas[copiaDisciplinas.length - 1] = disciplina;

    this.disciplinas = copiaDisciplinas;

    // expande o array de notas em uma nova posicao
    double[] copiaNotas = new double[this.notas.length + 1];

    for (int i = 0; i < this.notas.length; i++) {
      copiaNotas[i] = this.notas[i];
    }

    copiaNotas[copiaNotas.length - 1] = 0.0;

    this.notas = copiaNotas;

  }

  public void registrarNota(int indiceDisciplina, double nota) {
    this.notas[indiceDisciplina] = nota;
  }

  public void setFrequencia(double frequencia) {
    if (frequencia >= 0 && frequencia <= 100) {
      this.frequencia = frequencia;
    }
  }

  public double calcularMedia() {
    double soma = 0;
    for (double nota : this.notas) {
      soma += nota;
    }
    return soma / this.notas.length;
  }

  public boolean verificarAprovacao() {
    //  retorna true se a média for >= a 7.0 E a frequência >= a 75%
    double media = this.calcularMedia();

    boolean mediaValida = media >= 7.0;
    boolean frequenciaValida = this.frequencia >= 75.0;

    return mediaValida && frequenciaValida;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public String getNome() {
    return nome;
  }

  public Disciplina[] getDisciplinas() {
    return disciplinas;
  }

  public double[] getNotas() {
    return notas;
  }

  public double getFrequencia() {
    return frequencia;
  }

}
