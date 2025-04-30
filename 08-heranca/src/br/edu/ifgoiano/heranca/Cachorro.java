package br.edu.ifgoiano.heranca;

public class Cachorro extends Animal {
  private String raca;

  public Cachorro(String nome, int idade, String raca) {
    super(nome, idade); // Chama o construtor da classe pai
    this.raca = raca;
  }

  public void abanarRabo() {
    System.out.println("Cachorro abanando o rabo");
  }

  public String getRaca() {
    return raca;
  }

  public void brincar() {
    System.out.println(getNome() + " está brincando!");
  }

  public void mostrarInfo() {
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade() + " anos");
    System.out.println("Raça: " + getRaca());
  }

  public void dormir() {
    System.out.println(getNome() + " de " + getIdade() + " anos está dormindo");
  }
}
