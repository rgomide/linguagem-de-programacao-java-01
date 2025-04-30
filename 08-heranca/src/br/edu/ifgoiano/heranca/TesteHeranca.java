package br.edu.ifgoiano.heranca;

public class TesteHeranca {
  public static void main(String[] args) {
    Cachorro rex = new Cachorro("Rex", 3, "Labrador");

    System.out.println("Nome: " + rex.getNome()); // Método herdado
    System.out.println("Idade: " + rex.getIdade()); // Método herdado
    System.out.println("Raça: " + rex.getRaca()); // Método próprio

    rex.abanarRabo(); // Método próprio
  }
}