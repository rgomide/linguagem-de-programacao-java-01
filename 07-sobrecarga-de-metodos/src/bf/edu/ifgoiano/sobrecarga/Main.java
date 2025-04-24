package bf.edu.ifgoiano.sobrecarga;

public class Main {
  public static void main(String[] args) {
    Calculadora calc = new Calculadora();

    System.out.println(calc.calcularArea(5, 3)); // 15.0
    System.out.println(calc.calcularArea(5, 3, 2)); // 62.0
    System.out.println(calc.calcularArea(5)); // 20.0
  }
}
