package br.edu.ifgoiano.heranca.exercicio05;

public class ProdutoEletronico extends Produto {
  // Atributos
  private int voltagem;
  private int garantiaMeses;

  // Construtores
  public ProdutoEletronico() {
    super();
    this.voltagem = 0;
    this.garantiaMeses = 0;
  }

  public ProdutoEletronico(int codigo, String nome, double preco, int voltagem, int garantiaMeses) {
    super(codigo, nome, preco);
    this.voltagem = voltagem;
    this.garantiaMeses = garantiaMeses;
  }

  // Métodos
  public double calcularGarantiaEstendida() {
    return this.getPreco() * 0.1; // 10% sobre o preço do produto
  }

  public void imprimirInformacoes() {
    super.imprimirInformacoes();
    System.out.println("Voltagem: " + this.voltagem);
    System.out.println("Garantia em meses: " + this.garantiaMeses);
  }

  // Getters e Setters
  public int getVoltagem() {
    return voltagem;
  }

  public void setVoltagem(int voltagem) {
    this.voltagem = voltagem;
  }

  public int getGarantiaMeses() {
    return garantiaMeses;
  }

  public void setGarantiaMeses(int garantiaMeses) {
    this.garantiaMeses = garantiaMeses;
  }

}
