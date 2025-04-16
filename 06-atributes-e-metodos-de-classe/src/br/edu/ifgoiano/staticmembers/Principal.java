package br.edu.ifgoiano.staticmembers;

public class Principal {
  public static void main(String[] args) {
    Produto p1 = new Produto("Produto 1", 10.0);
    Produto p2 = new Produto("Produto 2", 20.0);

    System.out.println("Total de produtos: " + Produto.getTotalProdutos());
    System.out.println("Valor total do estoque: " + Produto.getValorTotalEstoque());
  }
}
