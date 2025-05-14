package br.edu.ifgoiano.polimorfismo;

public class Main {

  public static void main(String[] args) {
    Circulo circulo = new Circulo("Círculo", 5.0);
    Retangulo retangulo = new Retangulo("Retângulo", 4.0, 6.0);

    circulo.desenhar();
    retangulo.desenhar();
  }
}
