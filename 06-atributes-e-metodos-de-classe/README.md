# Atributos e Métodos de Classe (static) em Java

## Sumário
- [Introdução](#introdução)
- [O que são Atributos e Métodos Estáticos?](#o-que-são-atributos-e-métodos-estáticos)
- [Atributos Estáticos](#atributos-estáticos)
- [Métodos Estáticos](#métodos-estáticos)
- [Quando Usar Static?](#quando-usar-static)
- [Exemplo Prático](#exemplo-prático)
- [Boas Práticas](#boas-práticas)
- [Exercícios](#exercícios)
- [Referências](#referências)

## Introdução

Nesta seção, vamos explorar um conceito especial em Java: os atributos e métodos estáticos (static). Diferente dos atributos e métodos comuns que vimos anteriormente, os membros estáticos pertencem à classe como um todo, e não a objetos individuais. Vamos entender como e quando usar esses recursos!

## O que são Atributos e Métodos Estáticos?

Atributos e métodos estáticos são membros de uma classe que:
- Pertencem à classe, não aos objetos
- São compartilhados por todas as instâncias da classe
- Podem ser acessados sem criar um objeto
- São declarados usando a palavra-chave `static`

## Atributos Estáticos

Um atributo estático é uma variável que é compartilhada por todos os objetos de uma classe. Quando um objeto modifica um atributo estático, a mudança é refletida em todos os outros objetos.

### Exemplo:
```java
public class ContaBancaria {
    // Atributo de instância - cada conta tem seu próprio saldo
    private double saldo;
    
    // Atributo estático - todas as contas compartilham o mesmo total
    private static int totalContas = 0;
    
    public ContaBancaria() {
        totalContas++; // Incrementa o contador quando uma nova conta é criada
    }
    
    public static int getTotalContas() {
        return totalContas;
    }
}
```

## Métodos Estáticos

Métodos estáticos são funções que podem ser chamadas sem criar um objeto da classe. Eles são úteis para operações que não dependem do estado de um objeto específico.

### Exemplo:
```java
public class Calculadora {
    // Método estático - pode ser chamado sem criar um objeto
    public static double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }
    
    // Método de instância - precisa de um objeto para funcionar
    public double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }
}

// Uso dos métodos
public class Main {
    public static void main(String[] args) {
        // Chamando método estático - não precisa de objeto
        double areaCirculo = Calculadora.calcularAreaCirculo(5.0);
        
        // Chamando método de instância - precisa de objeto
        Calculadora calc = new Calculadora();
        double areaRetangulo = calc.calcularAreaRetangulo(4.0, 6.0);
    }
}
```

## Quando Usar Static?

Use atributos e métodos estáticos quando:
1. O valor (atributo) ou comportamento (método) é compartilhado por todos os objetos
2. A operação não depende do estado de um objeto específico
3. Você precisa de um contador ou acumulador para a classe
4. A operação é utilitária e não precisa de estado

### Exemplos comuns:
- Contadores de objetos
- Constantes (combinado com `final`)
- Métodos utilitários (como `Math.sqrt()`)
- Fábricas de objetos

## Exemplo Prático

Vamos criar uma classe `Produto` que demonstra o uso de membros estáticos:

```java
public class Produto {
    // Atributos de instância
    private String nome;
    private double preco;
    
    // Atributos estáticos
    private static int totalProdutos = 0;
    private static double valorTotalEstoque = 0.0;
    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        totalProdutos++;
        valorTotalEstoque += preco;
    }
    
    // Métodos de instância
    public void aplicarDesconto(double percentual) {
        double desconto = preco * (percentual/100);
        valorTotalEstoque -= desconto;
        preco -= desconto;
    }
    
    // Métodos estáticos
    public static int getTotalProdutos() {
        return totalProdutos;
    }
    
    public static double getValorTotalEstoque() {
        return valorTotalEstoque;
    }
}
```

## Boas Práticas

1. Use `static` com moderação - apenas quando realmente necessário
2. Evite usar atributos estáticos para armazenar estado que deveria ser de instância
3. Métodos estáticos devem ser independentes do estado da instância
4. Use `final` com `static` para constantes
5. Documente bem o propósito dos membros estáticos

## Exercícios

1. Crie uma classe `Contador` com:
   - Atributo estático: `totalInstancias`
   - Método estático: `getTotalInstancias()`
   - Incremente o contador no construtor

2. Implemente uma classe `Matematica` com:
   - Métodos estáticos: `calcularFatorial(int n)`, `calcularPotencia(int base, int expoente)`
   - Constante estática: `PI` com valor 3.14159

3. Desenvolva uma classe `Funcionario` com:
   - Atributos estáticos: `totalFuncionarios`, `salarioTotal`
   - Método estático: `calcularMediaSalarial()`
   - Atualize os totais no construtor

6. Implemente uma classe `GeradorId` com:
   - Atributo estático: `proximoId`
   - Método estático: `gerarNovoId()`
   - Garanta que cada ID seja único

## Referências
- [Understanding Class Members](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html)