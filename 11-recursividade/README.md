# Recursividade

## Sumário
- [O que é Recursividade?](#o-que-é-recursividade)
- [Componentes de uma Função Recursiva](#componentes-de-uma-função-recursiva)
- [Pilha de Execução (Stack)](#pilha-de-execução-stack)
- [Exemplo: Cálculo do Fatorial](#exemplo-cálculo-do-fatorial)
- [Vantagens e Desvantagens da Recursividade](#vantagens-e-desvantagens-da-recursividade)
- [Quando Usar Recursividade?](#quando-usar-recursividade)
- [Exercícios](#exercícios)
- [Referências](#referências)

## O que é Recursividade?

Recursividade é uma técnica de programação onde uma função chama a si mesma para resolver um problema. É uma alternativa à iteração (loops) e é muito útil quando um problema pode ser dividido em subproblemas menores e similares.

A ideia central da recursividade é: **resolver um problema complexo dividindo-o em problemas menores do mesmo tipo**.

### Analogia do Mundo Real

Imagine que você precisa contar quantas pessoas estão em uma fila. Você pode:
1. Contar diretamente (abordagem iterativa)
2. Perguntar à pessoa à sua frente: "Quantas pessoas estão atrás de você?" e somar 1 (abordagem recursiva)

A segunda abordagem é recursiva porque cada pessoa repete a mesma pergunta até chegar ao final da fila.

## Componentes de uma Função Recursiva

Toda função recursiva precisa ter dois componentes essenciais:

### 1. Caso Base (Condição de Parada)

É a condição que interrompe a recursão. Sem um caso base, a função continuaria chamando a si mesma infinitamente, causando um erro conhecido como **Stack Overflow**.

### 2. Caso Recursivo

É a parte da função que chama a si mesma, mas com um problema menor ou mais próximo do caso base.

```java
public static int exemploRecursivo(int n) {
    // Caso Base: condição que para a recursão
    if (n <= 0) {
        return 0;
    }
    
    // Caso Recursivo: chama a função novamente com valor menor
    return n + exemploRecursivo(n - 1);
}
```

## Pilha de Execução (Stack)

A **pilha de execução** (também chamada de **stack**) é uma estrutura de dados que o Java usa para gerenciar chamadas de métodos. Ela funciona como uma pilha de pratos: o último prato colocado é o primeiro a ser retirado (FIFO - First In, First Out).

### Como Funciona a Pilha de Execução

Quando uma função recursiva é chamada:

1. **Cada chamada** cria um novo **frame** (quadro) na pilha
2. Cada frame armazena:
   - Os parâmetros da função
   - As variáveis locais
   - O ponto de retorno (onde continuar após a função terminar)
3. Quando a função retorna, seu frame é removido da pilha
4. A execução continua no frame anterior

### Exemplo Visual da Pilha

Vamos visualizar o que acontece quando calculamos `fatorial(4)`:

```
Chamada: fatorial(4)
┌─────────────────────┐
│ fatorial(4)         │ ← Frame atual
│ n = 4               │
│ retorna: 4 * ?      │
└─────────────────────┘
         ↓ chama fatorial(3)

Chamada: fatorial(3)
┌─────────────────────┐
│ fatorial(3)         │ ← Frame atual
│ n = 3               │
│ retorna: 3 * ?      │
└─────────────────────┘
┌─────────────────────┐
│ fatorial(4)         │ ← Aguardando resultado
│ n = 4               │
│ retorna: 4 * ?      │
└─────────────────────┘
         ↓ chama fatorial(2)

Chamada: fatorial(2)
┌─────────────────────┐
│ fatorial(2)         │ ← Frame atual
│ n = 2               │
│ retorna: 2 * ?      │
└─────────────────────┘
┌─────────────────────┐
│ fatorial(3)         │ ← Aguardando resultado
│ n = 3               │
│ retorna: 3 * ?      │
└─────────────────────┘
┌─────────────────────┐
│ fatorial(4)         │ ← Aguardando resultado
│ n = 4               │
│ retorna: 4 * ?      │
└─────────────────────┘
         ↓ chama fatorial(1)

Chamada: fatorial(1)
┌─────────────────────┐
│ fatorial(1)         │ ← Frame atual
│ n = 1               │
│ retorna: 1 * ?      │
└─────────────────────┘
┌─────────────────────┐
│ fatorial(2)         │ ← Aguardando resultado
│ n = 2               │
│ retorna: 2 * ?      │
└─────────────────────┘
┌─────────────────────┐
│ fatorial(3)         │ ← Aguardando resultado
│ n = 3               │
│ retorna: 3 * ?      │
└─────────────────────┘
┌─────────────────────┐
│ fatorial(4)         │ ← Aguardando resultado
│ n = 4               │
│ retorna: 4 * ?      │
└─────────────────────┘
         ↓ chama fatorial(0)

Chamada: fatorial(0) - CASO BASE
┌─────────────────────┐
│ fatorial(0)         │ ← Frame atual
│ n = 0               │
│ retorna: 1          │ ← CASO BASE ATINGIDO!
└─────────────────────┘
┌─────────────────────┐
│ fatorial(1)         │ ← Pode calcular: 1 * 1 = 1
│ n = 1               │
│ retorna: 1          │
└─────────────────────┘
┌─────────────────────┐
│ fatorial(2)         │ ← Pode calcular: 2 * 1 = 2
│ n = 2               │
│ retorna: 2          │
└─────────────────────┘
┌─────────────────────┐
│ fatorial(3)         │ ← Pode calcular: 3 * 2 = 6
│ n = 3               │
│ retorna: 6          │
└─────────────────────┘
┌─────────────────────┐
│ fatorial(4)         │ ← Pode calcular: 4 * 6 = 24
│ n = 4               │
│ retorna: 24         │ ← RESULTADO FINAL
└─────────────────────┘
```

### Importante sobre a Pilha

- A pilha tem um tamanho limitado
- Se houver muitas chamadas recursivas, pode ocorrer **StackOverflowError**
- Por isso, é crucial ter um caso base que sempre seja alcançado

## Exemplo: Cálculo do Fatorial

O **fatorial** de um número inteiro positivo `n` (representado por `n!`) é o produto de todos os números inteiros positivos menores ou iguais a `n`.

**Definição matemática:**
- `0! = 1` (por definição)
- `n! = n × (n-1) × (n-2) × ... × 2 × 1` para `n > 0`

**Exemplos:**
- `5! = 5 × 4 × 3 × 2 × 1 = 120`
- `3! = 3 × 2 × 1 = 6`
- `1! = 1`

### Solução Iterativa (com Loop)

```java
public class FatorialIterativo {
    public static int fatorial(int n) {
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
        System.out.println("5! = " + fatorial(5)); // 120
        System.out.println("3! = " + fatorial(3)); // 6
        System.out.println("0! = " + fatorial(0)); // 1
    }
}
```

### Solução Recursiva

A solução recursiva aproveita a definição matemática do fatorial:

```
n! = n × (n-1)!
```

```java
public class FatorialRecursivo {
    public static int fatorial(int n) {
        // Caso Base: 0! = 1 e 1! = 1
        if (n <= 1) {
            return 1;
        }
        
        // Caso Recursivo: n! = n × (n-1)!
        return n * fatorial(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("5! = " + fatorial(5)); // 120
        System.out.println("3! = " + fatorial(3)); // 6
        System.out.println("0! = " + fatorial(0)); // 1
        
        // Vamos rastrear a execução de fatorial(4)
        System.out.println("\nRastreamento de fatorial(4):");
        System.out.println("fatorial(4) = " + fatorialComRastreamento(4, 0));
    }
    
    // Versão com rastreamento para entender melhor
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
}
```

**Saída do rastreamento:**
```
Chamando fatorial(4)
  Chamando fatorial(3)
    Chamando fatorial(2)
      Chamando fatorial(1)
      Caso base atingido! Retornando 1
    fatorial(2) = 2 × 1 = 2
  fatorial(3) = 3 × 2 = 6
fatorial(4) = 4 × 6 = 24
```

## Vantagens e Desvantagens da Recursividade

### Vantagens

1. **Código mais limpo e elegante**: Alguns problemas são naturalmente recursivos e ficam mais fáceis de entender
2. **Menos código**: Soluções recursivas geralmente são mais concisas
3. **Alinhado com a definição matemática**: Muitos problemas matemáticos têm definições recursivas naturais
4. **Divide e conquista**: Facilita a aplicação de estratégias como "dividir para conquistar"

### Desvantagens

1. **Uso de memória**: Cada chamada cria um novo frame na pilha
2. **Risco de Stack Overflow**: Muitas chamadas podem esgotar a pilha
3. **Performance**: Pode ser mais lento que soluções iterativas devido ao overhead das chamadas
4. **Dificuldade de debug**: Pode ser mais difícil depurar devido à pilha de chamadas

## Quando Usar Recursividade?

Use recursividade quando:

- O problema pode ser dividido em subproblemas similares
- A solução recursiva é mais clara e legível
- O número de chamadas recursivas não é muito grande
- A estrutura de dados é recursiva (como árvores)

Evite recursividade quando:

- O problema pode ser resolvido facilmente com loops
- O número de chamadas recursivas pode ser muito grande
- Performance é crítica e a solução iterativa é mais eficiente
- A pilha pode estourar facilmente

## Exercícios

### Exercício 1: Soma de Números

Escreva uma função recursiva que calcule a soma de todos os números inteiros de 1 até `n`.

**Exemplo:**
```java
soma(5) = 1 + 2 + 3 + 4 + 5 = 15
soma(3) = 1 + 2 + 3 = 6
```

**Dica:** O caso base é quando `n <= 0` (retorna 0). O caso recursivo é `n + soma(n-1)`.

### Exercício 2: Contagem Regressiva

Crie uma função recursiva que imprima uma contagem regressiva de `n` até 1, e depois imprima "Fogo!".

**Exemplo:**
```
contagemRegressiva(5)
Saída:
5
4
3
2
1
Fogo!
```

**Dica:** Imprima o número antes de fazer a chamada recursiva.

### Exercício 3: Potência

Implemente uma função recursiva que calcule `base^expoente`.

**Exemplo:**
```java
potencia(2, 3) = 2³ = 8
potencia(5, 2) = 5² = 25
potencia(10, 0) = 10⁰ = 1
```

**Dica:** 
- Caso base: `expoente == 0` retorna 1
- Caso recursivo: `base × potencia(base, expoente - 1)`

### Exercício 4: Números de Fibonacci

A sequência de Fibonacci é definida como:
- `fib(0) = 0`
- `fib(1) = 1`
- `fib(n) = fib(n-1) + fib(n-2)` para `n > 1`

Escreva uma função recursiva para calcular o n-ésimo número de Fibonacci.

**Exemplo:**
```java
fibonacci(0) = 0
fibonacci(1) = 1
fibonacci(2) = 1
fibonacci(3) = 2
fibonacci(4) = 3
fibonacci(5) = 5
fibonacci(6) = 8
```

**Dica:** Você tem dois casos base (n=0 e n=1) e o caso recursivo soma os dois anteriores.

### Exercício 5: Verificar se um Número é Par

Crie uma função recursiva que verifique se um número é par, sem usar o operador `%` (módulo).

**Exemplo:**
```java
ehPar(4) = true
ehPar(5) = false
ehPar(0) = true
```

**Dica:** 
- Caso base: `n == 0` retorna `true`, `n == 1` retorna `false`
- Caso recursivo: `ehPar(n - 2)`

### Exercício 6: Soma de Dígitos

Escreva uma função recursiva que calcule a soma dos dígitos de um número inteiro.

**Exemplo:**
```java
somaDigitos(123) = 1 + 2 + 3 = 6
somaDigitos(4567) = 4 + 5 + 6 + 7 = 22
somaDigitos(9) = 9
```

**Dica:** 
- Caso base: se o número tem apenas um dígito, retorne ele mesmo
- Caso recursivo: último dígito + soma dos dígitos restantes
- Use `n % 10` para pegar o último dígito e `n / 10` para remover o último dígito

### Exercício 7: Inverter uma String

Implemente uma função recursiva que inverta uma string.

**Exemplo:**
```java
inverter("Java") = "avaJ"
inverter("recursivo") = "ovisrucer"
inverter("a") = "a"
```

**Dica:**
- Caso base: string vazia ou com 1 caractere
- Caso recursivo: último caractere + inversão do resto da string

### Exercício 8: Máximo Divisor Comum (MDC)

O MDC de dois números pode ser calculado usando o algoritmo de Euclides:
- Se `b == 0`, então `MDC(a, b) = a`
- Caso contrário, `MDC(a, b) = MDC(b, a % b)`

Implemente uma função recursiva para calcular o MDC.

**Exemplo:**
```java
mdc(48, 18) = 6
mdc(100, 25) = 25
mdc(17, 5) = 1
```

### Exercício 9: Contar Ocorrências de um Caractere

Escreva uma função recursiva que conte quantas vezes um caractere aparece em uma string.

**Exemplo:**
```java
contarCaractere("banana", 'a') = 3
contarCaractere("programacao", 'a') = 3
contarCaractere("java", 'z') = 0
```

**Dica:**
- Caso base: string vazia retorna 0
- Caso recursivo: se o primeiro caractere é igual ao procurado, soma 1 + contar no resto; senão, apenas conta no resto

## Referências

- [Baeldung - Recursion in Java](https://www.baeldung.com/java-recursion)
