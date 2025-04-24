package bf.edu.ifgoiano.sobrecarga;

public class Calculadora {
  // Calcula a área de um retângulo
  public double calcularArea(double base, double altura) {
    return base * altura;
  }

  // Calcula a área de um paralelepípedo
  public double calcularArea(double base, double altura, double profundidade) {
    return 2 * (base * altura + base * profundidade + altura * profundidade);
  }

  // Calcula a área de um quadrado
  public double calcularArea(double lado) {
    return 4 * lado;
  }
}