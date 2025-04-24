package br.edu.ifgoiano.staticmembers;

public class Calculadora {

  public static final double PI = 3.14;

  public static int calcularPotencia(int base, int expoente) {
    int acum = 1;
    for (int n = 0; n < expoente; n++) {
      acum *= base;
    }
    return acum;
  }

  public static int calcularFatorial(int n) {
    int acum = 1;
    for (int i = 1; i <= n; i++) {
      acum *= i;
    }
    return acum;
  }

  public static double calcularAreaRetangulo(double base, double altura) {
    return base * altura;
  }

  public static double calcularPerimetroCircunferencia(double raio) {
    return 2 * PI * raio;
  }

  public static double calcularAreaCircunferencia(double raio) {
    return PI * raio * raio;
  }
}
