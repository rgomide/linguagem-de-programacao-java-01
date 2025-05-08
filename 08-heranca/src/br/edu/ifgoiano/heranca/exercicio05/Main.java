package br.edu.ifgoiano.heranca.exercicio05;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
  public static void main(String[] args) {
    System.out.println("====== Classe Produto ======");

    Produto produto = new Produto(1, "Produto 1", 10.0);
    produto.imprimirInformacoes();

    System.out.println("\n====== Classe ProdutoAlimenticio ======");

    Date dataValidade = new GregorianCalendar(2025, 1, 1).getTime();
    ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio(2, "Produto 2", 20.0, dataValidade);
    produtoAlimenticio.imprimirInformacoes();
    System.out.println("Vencimento do produto alimentício: " + produtoAlimenticio.verificarVencimento());
    System.out.println("Produto 2 vence: " + produtoAlimenticio.verificarVencimento());

    System.out.println("\n====== Classe ProdutoEletronico ======");

    ProdutoEletronico produtoEletronico = new ProdutoEletronico(3, "Produto 3", 30.0, 220, 12);
    produtoEletronico.imprimirInformacoes();
    System.out.println("Garantia estendida do produto eletrônico: " + produtoEletronico.calcularGarantiaEstendida());

    System.out.println("\n====== Classe Livro ======");

    Livro livro = new Livro(4, "Livro 1", 40.0, "Autor 1", "Editora 1", 100);
    livro.imprimirInformacoes();
    System.out.println("Frete do livro: " + livro.calcularFrete());

  }
}
