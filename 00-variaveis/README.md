# Variáveis, comandos de atribuição e expressões

## Sumário

- [Introdução](#introdução)
- [Tipos de dados](#tipos-de-dados)
  - [Tipos primitivos](#tipos-primitivos)
  - [Declaração de variáveis](#declaração-de-variáveis)
  - [Convenções de nomenclatura](#convenções-de-nomenclatura)
  - [Constantes](#constantes)
  - [Coerção de tipos](#coerção-de-tipos)
- [Expressões e operadores](#expressões-e-operadores)
  - [Operadores aritméticos](#operadores-aritméticos)
  - [Operadores de atribuição](#operadores-de-atribuição)
  - [Operadores de incremento e decremento](#operadores-de-incremento-e-decremento)
  - [Operadores de comparação](#operadores-de-comparação)
  - [Operadores lógicos](#operadores-lógicos)
  - [Operadores de String](#operadores-de-string)
- [Comandos de entrada e saída](#comandos-de-entrada-e-saída)
  - [Entrada de dados](#entrada-de-dados)
  - [Saída de dados](#saída-de-dados)
- [Exercícios](#exercícios)

## Introdução

Uma variável é um espaço na memória do computador que armazena um valor. Em Java, todas as variáveis precisam ser declaradas com um tipo específico antes de serem utilizadas.

## Tipos de dados

### Tipos primitivos

1. **byte**: números inteiros (-128 até 127)
```java
byte idade = 25;
```

2. **short**: números inteiros (-32.768 até 32.767)
```java
short quantidade = 1000;
```

3. **int**: números inteiros (-2³¹ até 2³¹-1)
```java
int populacao = 1000000;
```

4. **long**: números inteiros longos (-2⁶³ até 2⁶³-1)
```java
long populacaoMundial = 7800000000L;
```

5. **float**: números decimais (precisão de 6-7 dígitos)
```java
float altura = 1.75f;
```

6. **double**: números decimais (precisão de 15-16 dígitos)
```java
double pi = 3.14159265359;
```

7. **boolean**: valores lógicos (true ou false)
```java
boolean estaChovendo = true;
```

8. **char**: caractere único
```java
char letra = 'A';
```

### Declaração de Variáveis

Em Java, você pode declarar variáveis de três formas:

1. Declaração simples:
   ```java
   int numero;
   ```

2. Declaração com inicialização:
   ```java
   String nome = "João";
   ```

3. Múltiplas variáveis do mesmo tipo:
   ```java
   int x = 1, y = 2, z = 3;
   ```

### Convenções de Nomenclatura

1. Nomes de variáveis devem começar com uma letra minúscula
2. Use `camelCase` para nomes compostos
3. Evite caracteres especiais e acentos
4. Escolha nomes significativos


#### Exemplos:
```java
String nomeCompleto;
int idadeUsuario;
double salarioMensal;
```


### Constantes

Constantes são variáveis cujo valor não pode ser alterado após sua inicialização. Em Java, usamos a palavra-chave `final`:

```java
final double PI = 3.14159;
final String NOME_EMPRESA = "MinhaEmpresa";
```

### Coerção de tipos

Em Java, é possível converter tipos de dados explicitamente usando operações de cast.

```java
double pi = 3.14159;
int inteiro = (int) pi;
```

## Expressões e operadores

### Operadores aritméticos

Java oferece operadores aritméticos para realizar cálculos matemáticos.

```java
int soma = 10 + 5; // 15
int subtracao = 10 - 5; // 5
int multiplicacao = 10 * 5; // 50
int divisao = 10 / 5; // 2
int resto = 10 % 3; // 1
```

### Operadores de atribuição

Os operadores de atribuição são usados para atribuir valores a variáveis.

```java
int x = 10;

x += 5; // x = x + 5
x -= 3; // x = x - 3
x *= 2; // x = x * 2
x /= 4; // x = x / 4
```

### Operadores de incremento e decremento

Os operadores de incremento e decremento são usados para aumentar ou diminuir o valor de uma variável em 1.

```java
int contador = 0;

// Pós-incremento
contador++; // contador = contador + 1
contador--; // contador = contador - 1

// Pré-incremento
++contador; // contador = contador + 1
--contador; // contador = contador - 1
```

### Operadores de comparação

Os operadores de comparação são usados para comparar valores e retornar um resultado booleano (`true` ou `false`).

```java
int a = 10;
int b = 5;

boolean igual = a == b; // false
boolean diferente = a != b; // true
boolean maior = a > b; // true
boolean menor = a < b; // false
boolean maiorOuIgual = a >= b; // true
boolean menorOuIgual = a <= b; // false
```

### Operadores lógicos

Os operadores lógicos são usados para combinar expressões booleanas e retornar um resultado booleano.

```java
boolean a = true;
boolean b = false;

boolean resultado = a && b; // false (AND)
boolean resultado = a || b; // true (OR)
boolean resultado = !a; // false (NOT)
```

### Operadores de String

Os operadores de String são usados para concatenar strings.

```java
String nome = "João";
String sobrenome = "Silva";
String nomeCompleto = nome + " " + sobrenome; // "João Silva"
```

## Expressões

Expressões são combinações de variáveis, valores literais e operadores que produzem um resultado.

```java
int a = 10;
int b = 5;
int soma = a + b; // 15
```

## Comandos de entrada e saída

### Entrada de dados

Para ler dados do usuário via terminal, usamos a classe `Scanner`:

```java
import java.util.Scanner;

// ...

Scanner scanner = new Scanner(System.in);

int idade = scanner.nextInt();

scanner.close();
```

#### Métodos da classe Scanner

- `nextInt()`: Lê um número inteiro
- `nextDouble()`: Lê um número double
- `nextLine()`: Lê uma linha inteira (string)
- `next()`: Lê uma palavra (string)

### Saída de dados

Para imprimir mensagens no console, usamos o método `System.out.println()`:

```java
System.out.println("Olá, mundo!");
```

## Exercícios

### 1. Cadastro de Produto
Crie um programa que declare variáveis para armazenar as seguintes informações de um produto:
- Nome do produto
- Preço
- Quantidade em estoque
- Código do produto
- Disponível para venda (sim/não)

Em seguida, inicialize essas variáveis com valores apropriados e imprima todas as informações no console.

### 2. Calculadora de Média
Declare três variáveis para armazenar notas de um aluno (nota1, nota2 e nota3). Calcule a média das notas e armazene em uma variável chamada `media`. Em seguida, crie uma variável booleana chamada `aprovado` que será true se a média for maior ou igual a 7.0 e false caso contrário.

### 3. Conversor de Temperatura
Crie um programa que converta uma temperatura de Celsius para Fahrenheit. Declare uma constante chamada FATOR_CONVERSAO com o valor 1.8 e outra constante chamada AJUSTE com o valor 32. Use essas constantes para fazer o cálculo: °F = (°C × FATOR_CONVERSAO) + AJUSTE

### 4. Contador de Caracteres
Declare uma String contendo seu nome completo e crie variáveis para armazenar:
- Quantidade total de caracteres do nome
- Primeira letra do nome
- Última letra do nome

Imprima todas essas informações.

### 5. Operações com Casting
Declare as seguintes variáveis:

```java
double numero1 = 15.7;
double numero2 = 8.3;
```

Realize as seguintes operações:
a) Some os dois números e armazene em uma variável `int`
b) Multiplique os dois números e armazene em uma variável `long`
c) Divida o primeiro pelo segundo e armazene em uma variável `float`
d) Subtraia o segundo do primeiro e armazene em uma variável `int`

Para cada operação, imprima:
- O resultado com o tipo original (double)
- O resultado após a conversão
- Se houve perda de dados na conversão

## Referências

- [Java Documentation](https://docs.oracle.com/javase/tutorial/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/jls/se17/html/index.html)
- [Java API Documentation](https://docs.oracle.com/en/java/javase/17/docs/api/index.html)

