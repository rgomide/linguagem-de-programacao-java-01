package br.edu.ifgoiano.heranca.exercicio01;

public class Veiculo {

  // Atributos
  private String marca;
  private String modelo;
  private int ano;

  // Construtores
  public Veiculo() {
  }

  public Veiculo(String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }

  // Getters e setters
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

}
