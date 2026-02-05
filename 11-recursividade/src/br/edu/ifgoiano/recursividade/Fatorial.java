package br.edu.ifgoiano.recursividade;

/**
 * Exemplo de recursividade: cálculo do fatorial
 * 
 * O fatorial de n (n!) é o produto de todos os números inteiros
 * positivos menores ou iguais a n.
 * 
 * Definição:
 * - 0! = 1
 * - n! = n × (n-1)! para n > 0
 */
public class Fatorial {
    
    /**
     * Calcula o fatorial de um número usando recursividade
     * 
     * @param n número inteiro não negativo
     * @return fatorial de n
     * @throws IllegalArgumentException se n for negativo
     */
    public static int fatorial(int n) {
        // Validação de entrada
        if (n < 0) {
            throw new IllegalArgumentException("Número deve ser não negativo");
        }
        
        // Caso Base: 0! = 1 e 1! = 1
        if (n <= 1) {
            return 1;
        }
        
        // Caso Recursivo: n! = n × (n-1)!
        return n * fatorial(n - 1);
    }
    
    /**
     * Versão com rastreamento para entender melhor a execução
     * Mostra cada chamada recursiva e seu resultado
     */
    public static int fatorialComRastreamento(int n, int nivel) {
        String indentacao = "  ".repeat(nivel);
        System.out.println(indentacao + "Chamando fatorial(" + n + ")");
        
        if (n <= 1) {
            System.out.println(indentacao + "Caso base atingido! Retornando 1");
            return 1;
        }
        
        int resultado = n * fatorialComRastreamento(n - 1, nivel + 1);
        System.out.println(indentacao + "fatorial(" + n + ") = " + n + " × " + (resultado / n) + " = " + resultado);
        return resultado;
    }
    
    /**
     * Versão iterativa para comparação
     */
    public static int fatorialIterativo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número deve ser não negativo");
        }
        
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Cálculo de Fatorial ===");
        System.out.println();
        
        // Testes básicos
        System.out.println("5! = " + fatorial(5)); // 120
        System.out.println("3! = " + fatorial(3)); // 6
        System.out.println("0! = " + fatorial(0)); // 1
        System.out.println("1! = " + fatorial(1)); // 1
        System.out.println();
        
        // Comparação entre recursivo e iterativo
        System.out.println("=== Comparação Recursivo vs Iterativo ===");
        int numero = 6;
        System.out.println(numero + "! (recursivo) = " + fatorial(numero));
        System.out.println(numero + "! (iterativo) = " + fatorialIterativo(numero));
        System.out.println();
        
        // Rastreamento detalhado
        System.out.println("=== Rastreamento de fatorial(4) ===");
        fatorialComRastreamento(4, 0);
    }
}
