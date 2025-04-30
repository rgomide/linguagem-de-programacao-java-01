package br.edu.ifgoiano.heranca.exercicio01;

public class Main {
  public static void main(String[] args) {
    Moto moto = new Moto("Honda", "CG", 2000, 125);
    Carro carro = new Carro("Volkswagen", "Gol", 2002, 2);

    System.out.println(moto); // moto.toString()
    System.out.println(carro); // carro.toString()

  }
}
