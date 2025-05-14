package br.edu.ifgoiano.polimorfismo;

public class Circulo extends Forma {
  private double raio;

  public Circulo(String nome, double raio) {
    super(nome);
    this.raio = raio;
  }

  @Override
  public void desenhar() {
    System.out.println("Desenhando um círculo com raio " + raio);

    System.out.println("      .-\"\"\"-.      ");
    System.out.println("    .'       '.    ");
    System.out.println("   /           \\   ");
    System.out.println("  |             |  ");
    System.out.println("   \\           /   ");
    System.out.println("    '.       .'    ");
    System.out.println("      '-...-'      ");
  }
}
