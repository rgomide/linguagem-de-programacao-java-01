package br.edu.ifgoiano.staticmembers;

public class Principal {
  public static void main(String[] args) {
    Produto p1 = new Produto("Produto 1", 10.0);
    Produto p2 = new Produto("Produto 2", 20.0);
    Produto p3 = new Produto("Produto 2", 15.0);

    System.out.println("Total de produtos: " + Produto.getTotalProdutos());
    System.out.println("Valor total do estoque: " +
        Produto.getValorTotalEstoque());

    p2.aplicarDesconto(10);

    System.out.println("Após aplicar 10% de desconto para o produto 2");

    System.out.println("Total de produtos: " + Produto.getTotalProdutos());
    System.out.println("Valor total do estoque: " +
        Produto.getValorTotalEstoque());
  }
}
