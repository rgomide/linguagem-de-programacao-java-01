package br.edu.ifgoiano.heranca.exercicio01;

public class Carro extends Veiculo {
  // Atributos
  private int numPortas;

  // Construtores
  public Carro() {
  }

  public Carro(String marca, String modelo, int ano, int numPortas) {
    super(marca, modelo, ano);
    this.numPortas = numPortas;
  }

  // Métodos auxiliares
  public String toString() {
    return String.format("Carro[marca=%s,modelo=%s,ano=%d,numPortas=%d]",
        this.getMarca(),
        this.getModelo(),
        this.getAno(),
        this.numPortas);
  }

  // Getters e Setters
  public int getNumPortas() {
    return numPortas;
  }

  public void setNumPortas(int numPortas) {
    this.numPortas = numPortas;
  }

}
