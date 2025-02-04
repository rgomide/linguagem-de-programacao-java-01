import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Entrada de dados
    System.out.print("Digite sua idade: ");
    Scanner scanner = new Scanner(System.in);
    int idade = scanner.nextInt();
    scanner.close();

    // Saída de dados
    System.out.println("Você tem " + idade + " anos");

    // Coerção
    double numero = 10.98;
    int numeroInteiro = (int) numero;

    System.out.println("Número inteiro: " + numeroInteiro);
  }
}