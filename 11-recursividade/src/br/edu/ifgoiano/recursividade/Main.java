package br.edu.ifgoiano.recursividade;

/**
 * Classe principal para demonstrar conceitos de recursividade
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("╔═══════════════════════════════════════════════════════╗");
        System.out.println("║     Exemplos de Recursividade em Java                 ║");
        System.out.println("╚═══════════════════════════════════════════════════════╝");
        System.out.println();
        
        // Demonstração do fatorial
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("EXEMPLO 1: Cálculo do Fatorial");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Fatorial de 5: " + Fatorial.fatorial(5));
        System.out.println("Fatorial de 3: " + Fatorial.fatorial(3));
        System.out.println("Fatorial de 0: " + Fatorial.fatorial(0));
        System.out.println();
        
        // Demonstração com rastreamento
        System.out.println("Rastreamento detalhado do cálculo de 4!:");
        Fatorial.fatorialComRastreamento(4, 0);
        System.out.println();
        
        // Outros exemplos
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("EXEMPLO 2: Sequência de Fibonacci");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.print("Primeiros 10 números: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(ExemplosRecursivos.fibonacci(i) + " ");
        }
        System.out.println("\n");
        
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("EXEMPLO 3: Soma de Dígitos");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        int numero = 12345;
        System.out.println("Soma dos dígitos de " + numero + ": " + 
                          ExemplosRecursivos.somaDigitos(numero));
        System.out.println();
        
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("EXEMPLO 4: Verificar Palíndromo");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        String[] palavras = {"ovo", "arara", "java", "radar"};
        for (String palavra : palavras) {
            boolean resultado = ExemplosRecursivos.ehPalindromo(palavra);
            System.out.println("'" + palavra + "' é palíndromo? " + resultado);
        }
        System.out.println();
        
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Para mais exemplos, execute: ExemplosRecursivos.main()");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
}
