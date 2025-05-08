package br.edu.ifgoiano.heranca.exercicio05;

public class Livro extends Produto {

  // Atributos
  private String autor;
  private String editora;
  private int numeroPaginas;

  // Construtores
  public Livro() {
    super();
    this.autor = "";
    this.editora = "";
    this.numeroPaginas = 0;
  }

  public Livro(int codigo, String nome, double preco, String autor, String editora, int numeroPaginas) {
    super(codigo, nome, preco);
    this.autor = autor;
    this.editora = editora;
    this.numeroPaginas = numeroPaginas;
  }

  // Métodos
  public double calcularFrete() {
    return this.getNumeroPaginas() * 0.01; // 1% sobre o número de páginas
  }

  public void imprimirInformacoes() {
    super.imprimirInformacoes();
    System.out.println("Autor: " + this.autor);
    System.out.println("Editora: " + this.editora);
    System.out.println("Número de páginas: " + this.numeroPaginas);
  }

  // Getters e Setters
  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getEditora() {
    return editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public int getNumeroPaginas() {
    return numeroPaginas;
  }

  public void setNumeroPaginas(int numeroPaginas) {
    this.numeroPaginas = numeroPaginas;
  }

}
