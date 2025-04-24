package br.edu.ifgoiano.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {
  private String isbn;
  private String titulo;
  private String autor;
  private int paginas;
  private String statusEmprestimo;
  private List<String> emprestimos;

  public Livro(String isbn, String titulo, String autor, int paginas) {
    this.autor = autor;
    this.titulo = titulo;
    this.isbn = isbn;
    this.paginas = paginas;
    this.emprestimos = new ArrayList<String>();
  }

  public void mostrarHistoricoEmprestimos() {
    for (String emprestimo : this.emprestimos) {
      System.out.println(emprestimo);
    }
  }

  public String getIsbn() {
    return isbn;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getPaginas() {
    return paginas;
  }

  public void setPaginas(int paginas) {
    this.paginas = paginas;
  }

  public String getStatusEmprestimo() {
    return statusEmprestimo;
  }

  public void setStatusEmprestimo(String statusEmprestimo) {
    this.statusEmprestimo = statusEmprestimo;
  }

  public List<String> getEmprestimos() {
    return emprestimos;
  }

  public void setEmprestimos(List<String> emprestimos) {
    this.emprestimos = emprestimos;
  }

}
