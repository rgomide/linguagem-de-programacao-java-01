package br.edu.ifgoiano.heranca.exercicio01;

public class Moto extends Veiculo {

  // Atributos
  private int cilindradas;

  // Construtores
  public Moto() {

  }

  public Moto(String marca, String modelo, int ano, int cilindradas) {
    super(marca, modelo, ano);
    this.cilindradas = cilindradas;
  }

  // Métodos auxiliares
  public String toString() {
    return String.format("Moto[marca=%s,modelo=%s,ano=%d,cilindradas=%d]",
        this.getMarca(),
        this.getModelo(),
        this.getAno(),
        this.cilindradas);
  }

  // Getters e Setters
  public int getCilindradas() {
    return cilindradas;
  }

  public void setCilindradas(int cilindradas) {
    this.cilindradas = cilindradas;
  }

}
