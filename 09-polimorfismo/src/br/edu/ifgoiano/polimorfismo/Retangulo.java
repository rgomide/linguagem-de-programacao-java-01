package br.edu.ifgoiano.polimorfismo;

public class Retangulo extends Forma {
  private double largura;
  private double altura;

  public Retangulo(String nome, double largura, double altura) {
    super(nome);
    this.largura = largura;
    this.altura = altura;
  }

  @Override
  public void desenhar() {
    System.out.println("Desenhando um retângulo com largura " + largura + " e altura " + altura);

    System.out.println("+-----------------+");
    System.out.println("|                 |");
    System.out.println("|                 |");
    System.out.println("|                 |");
    System.out.println("+-----------------+");
  }
}
