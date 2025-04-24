package br.edu.ifgoiano.biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
  private List<Livro> livros;

  public Biblioteca() {
    this.livros = new ArrayList<Livro>();
  }

  public void adicionar(Livro livro) {
    for (Livro livroBiblioteca : this.livros) {
      if (livroBiblioteca.getIsbn().equals(livro.getIsbn())) {
        return;
      }
    }
    this.livros.add(livro);
  }

  public void emprestar(Livro livro) {
    for (Livro livroBiblioteca : this.livros) {
      if (livroBiblioteca.getIsbn().equals(livro.getIsbn())) {
        livroBiblioteca.setStatusEmprestimo("emprestado");
        livroBiblioteca.getEmprestimos().add(new Date().toString());
      }
    }
  }

  public Livro getLivroMaisEmprestado() {
    int maior = Integer.MIN_VALUE;
    int indice = -1;

    int cont = 0;
    for (Livro livro : this.livros) {
      if (livro.getEmprestimos().size() > maior) {
        maior = livro.getEmprestimos().size();
        indice = cont;
      }
      cont++;
    }

    return this.livros.get(indice);
  }

  public List<Livro> getLivros() {
    return livros;
  }

  

}
