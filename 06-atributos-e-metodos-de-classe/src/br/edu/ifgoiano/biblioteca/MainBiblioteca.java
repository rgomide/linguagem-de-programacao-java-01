package br.edu.ifgoiano.biblioteca;

public class MainBiblioteca {
  public static void main(String[] args) {
    Livro livro1 = new Livro("111", "AAA", "aaa", 200);
    Livro livro2 = new Livro("222", "BBB", "aaa", 200);
    Livro livro3 = new Livro("333", "CCC", "aaa", 200);
    Livro livro4 = new Livro("111", "DDD", "aaa", 200);

    Biblioteca biblioteca = new Biblioteca();

    biblioteca.adicionar(livro1);
    biblioteca.adicionar(livro2);
    biblioteca.adicionar(livro3);
    biblioteca.adicionar(livro4);

    System.out.println("Livros da biblioteca:");
    for (Livro livro : biblioteca.getLivros()) {
      System.out.println(livro.getTitulo());
    }

    biblioteca.emprestar(livro2);
    biblioteca.emprestar(livro2);
    biblioteca.emprestar(livro2);

    biblioteca.emprestar(livro3);
    biblioteca.emprestar(livro3);
    biblioteca.emprestar(livro3);
    biblioteca.emprestar(livro3);

    biblioteca.emprestar(livro1);

    System.out.println("Livro mais emprestado:");
    System.out.println(biblioteca.getLivroMaisEmprestado().getTitulo());
  }
}
