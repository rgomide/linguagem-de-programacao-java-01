# Polimorfismo

O polimorfismo é um dos pilares da Programação Orientada a Objetos (POO) que permite que objetos de diferentes classes sejam tratados de maneira uniforme através de uma referência comum. Em Java, o polimorfismo permite que um objeto possa ser referenciado por uma variável de um tipo mais genérico.

## Conceito Básico

Polimorfismo significa "muitas formas" e ocorre quando temos muitas classes que estão relacionadas entre si por herança. Em Java, o polimorfismo permite que um objeto possa ser tratado como um objeto de sua própria classe ou como um objeto de qualquer uma de suas superclasses.

## Exemplo Prático

Vamos criar um exemplo simples usando formas geométricas:

```java
// Classe base
public class Forma {
    protected String nome;
    
    public Forma(String nome) {
        this.nome = nome;
    }
    
    public void desenhar() {
        System.out.println("Desenhando uma forma genérica");
    }
}

// Classe derivada
public class Circulo extends Forma {
    private double raio;
    
    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }
    
    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo com raio " + raio);

        System.out.println("      .-\"\"\"-.      ");
        System.out.println("    .'       '.    ");
        System.out.println("   /           \\   ");
        System.out.println("  |             |  ");
        System.out.println("   \\           /   ");
        System.out.println("    '.       .'    ");
        System.out.println("      '-...-'      ");
    }
}

// Classe derivada
public class Retangulo extends Forma {
    private double largura;
    private double altura;
    
    public Retangulo(String nome, double largura, double altura) {
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    public void desenhar() {
        System.out.println("Desenhando um retângulo com largura " + largura + " e altura " + altura);
        System.out.println("+-----------------+");
        System.out.println("|                 |");
        System.out.println("|                 |");
        System.out.println("|                 |");
        System.out.println("+-----------------+");
    }
}
```

## Uso do Polimorfismo

```java
public class Main {
    public static void main(String[] args) {
        // Criando objetos
        Forma forma1 = new Circulo("Círculo", 5.0);
        Forma forma2 = new Retangulo("Retângulo", 4.0, 6.0);
        
        // Usando polimorfismo
        forma1.desenhar(); // Chama o método da classe Circulo
        forma2.desenhar(); // Chama o método da classe Retangulo
    }
}
```

## Características do Polimorfismo

1. **Sobrescrita de Métodos (Override)**: 
   - Permite que uma classe derivada forneça uma implementação específica de um método que já existe na classe base
   - Usa a anotação `@Override` para garantir que o método está realmente sobrescrevendo um método da superclasse

2. **Ligação Dinâmica (Dynamic Binding)**:
   - O Java determina em tempo de execução qual método chamar com base no tipo real do objeto
   - Isso permite que o mesmo código se comporte de maneira diferente dependendo do tipo do objeto

3. **Upcasting**:
   - É possível referenciar um objeto de uma classe derivada usando uma variável do tipo da classe base
   - Exemplo: `Forma forma = new Circulo("Círculo", 5.0);`

## Vantagens do Polimorfismo

1. Código mais flexível e extensível
2. Reutilização de código
3. Manutenção mais fácil
4. Código mais limpo e organizado

## Boas Práticas

1. Sempre use a anotação `@Override` ao sobrescrever métodos
2. Mantenha a assinatura do método consistente com a classe base
3. Use nomes descritivos para os métodos
4. Documente adequadamente os métodos sobrescritos

## Exemplo de Aplicação

```java
public class Desenhador {
    public void desenharForma(Forma forma) {
        forma.desenhar();
    }
}

public class Main {
    public static void main(String[] args) {
        Desenhador desenhador = new Desenhador();
        
        // Criando diferentes formas
        Forma circulo = new Circulo("Círculo", 5.0);
        Forma retangulo = new Retangulo("Retângulo", 4.0, 6.0);
        
        // Usando o mesmo método para diferentes tipos de formas
        desenhador.desenharForma(circulo);
        desenhador.desenharForma(retangulo);
    }
}
```

Neste exemplo, o método `desenharForma` do `Desenhador` pode trabalhar com qualquer tipo de `Forma`, demonstrando o poder do polimorfismo em criar código flexível e reutilizável.

## Exercícios

### Exercício 1
Crie uma classe `Animal` com um método `fazerSom()`. Em seguida, crie duas subclasses: `Cachorro` e `Gato`, cada uma com seu próprio método `fazerSom()`. Demonstre o polimorfismo usando um array de `Animal` que contém instâncias de `Cachorro` e `Gato`.

Represente o som do animal a partir de uma onomatopeia.


