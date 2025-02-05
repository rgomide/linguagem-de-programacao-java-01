# Arrays em Java

## Definição

Um array é uma estrutura de dados que armazena uma coleção ordenada de elementos do mesmo tipo. Em Java, arrays são objetos e têm tamanho fixo após sua criação.

## Declaração e Inicialização

Existem várias formas de declarar e inicializar um array em Java:

```java
// Declaração com tamanho fixo
int[] numeros = new int[10];  // Cria um array com 10 posições inicializadas com 0

// Declaração com valores iniciais
String[] cores = {"vermelho", "azul", "verde"};  // Array com 3 elementos

// Declaração e inicialização em etapas separadas
double[] precos;             // Declara a referência do array
precos = new double[5];      // Cria o array com 5 posições
```

## Características Importantes

- Arrays em Java são indexados a partir do valor `0`
- O tamanho do array é imutável após sua criação
- Cada elemento do array possui um valor padrão:
  - números: `0`
  - boolean: `false`
  - objetos: `null`

## Manipulação de Arrays

### Acesso aos elementos

O acesso aos elementos de um array é feito através de um índice, que é um número inteiro que representa a posição do elemento no array. A posição inicia do valor `0` até o tamanho do array menos `1`.

```java
int[] numeros = {10, 20, 30, 40, 50};

// Acessando elementos
int primeiro = numeros[0];    // Retorna 10
int ultimo = numeros[4];      // Retorna 50

// Modificando elementos
numeros[2] = 35;             // Altera o valor na posição 2 para 35
```

### Propriedades e Métodos Úteis

Existem vários métodos úteis para manipular arrays em Java. Alguns dos mais comuns são:

```java
import java.util.Arrays;

// ...

int[] numeros = {1, 2, 3, 4, 5};

// Obtendo o tamanho do array
int tamanho = numeros.length;    // Retorna 5

// Copiando arrays
int[] copia = Arrays.copyOf(numeros, numeros.length);

// Ordenando arrays
Arrays.sort(numeros);            // Ordena o array em ordem crescente

// Preenchendo arrays
Arrays.fill(numeros, 0);         // Preenche todo o array com 0
```

### Iterando sobre Arrays

A iteração sobre os elementos de um array pode ser feita de duas formas:

```java
int[] numeros = {10, 20, 30, 40, 50};

// Usando for tradicional
for (int i = 0; i < numeros.length; i++) {
    System.out.println("Posição " + i + ": " + numeros[i]);
}

// Usando for-each (mais moderno e legível)
for (int numero : numeros) {
    System.out.println(numero);
}
```

## Arrays Multidimensionais

Arrays multidimensionais são arrays que contêm outros arrays. Em Java, eles são frequentemente usados para representar matrizes.

```java
// Declaração de matriz 3x3
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Criando matriz com dimensões específicas
int[][] matriz2 = new int[3][4];  // Matriz 3x4

// Acessando elementos
int valor = matriz[1][2];  // Acessa linha 1, coluna 2
```

### Iterando sobre Arrays Multidimensionais

Para iterar sobre arrays multidimensionais, podemos usar dois loops `for` aninhados. Em que o primeiro loop percorre as linhas e o segundo loop percorre as colunas.

```java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Usando for tradicional
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();  // Nova linha após cada linha da matriz
}

// Usando for-each
for (int[] linha : matriz) {
    for (int elemento : linha) {
        System.out.print(elemento + " ");
    }
    System.out.println();
}
```

## Exercícios

### Exercício 1
Crie um array de inteiros com 10 elementos e preencha-o com números aleatórios entre 1 e 100. Em seguida, imprima:
- Todos os elementos
- A soma de todos os elementos

Utilize o comando `(int) (Math.random() * 100)` para gerar números aleatórios de 0 a 99.

### Exercício 2
Crie um array de inteiros com 10 elementos e desenvolva métodos para:
- Encontrar o maior valor
- Encontrar o menor valor
- Calcular a média dos valores
- Contar quantos números pares existem no array

### Exercício 3
Crie uma matriz 3x3 e desenvolva um programa que:
- Preencha a matriz com valores fornecidos pelo usuário
- Calcule e mostre a soma de cada linha
- Determine se a matriz é simétrica

### Exercício 4
Crie um programa que simule um jogo da velha usando uma matriz 3x3. O programa deve:
- Permitir que dois jogadores façam suas jogadas alternadamente
- Verificar se houve vencedor após cada jogada
- Identificar empate
- Mostrar o tabuleiro após cada jogada