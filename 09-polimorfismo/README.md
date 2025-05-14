# Polimorfismo

## Sumário

- [Introdução](#introdução)
- [Conceito Básico](#conceito-básico)
- [Exemplo Prático](#exemplo-prático)
- [Uso do Polimorfismo](#uso-do-polimorfismo)
- [Características do Polimorfismo](#características-do-polimorfismo)
- [Vantagens do Polimorfismo](#vantagens-do-polimorfismo)
- [Métodos e classes final](#métodos-e-classes-final)
- [Boas Práticas](#boas-práticas)
- [Exemplo de Aplicação](#exemplo-de-aplicação)
- [Exercícios](#exercícios)
- [Referências](#referências)
## Introdução

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

## Métodos e classes final

Métodos e classes podem ser declarados como `final` para indicar que eles não podem ser sobrescritos ou herdados, respectivamente.

Exemplo:

```java
public final class Animal {
    public final void fazerSom() {
        System.out.println("Animal fazendo som");
    }
}
```

O método `fazerSom` da classe `Animal` não pode ser sobrescrito pelas classes que herdam de `Animal`.

A mesma coisa serve para classes, que não podem ser herdadas.

```java
public final class Animal {
    // ...
}
```

A classe `Animal` não pode ser herdada.

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

### Exercício 2: Sistema de Pagamentos
Crie um sistema de processamento de pagamentos que demonstre polimorfismo. O sistema deve suportar diferentes tipos de pagamento (Cartão de Crédito, Boleto e PIX).

Estrutura das classes:
```java
public class Pagamento {
    protected double valor;
    protected String data;
    
    public Pagamento(double valor, String data) {
        this.valor = valor;
        this.data = data;
    }
    
    public void processar() {
        System.out.println("Processando pagamento genérico");
    }
    
    public void gerarComprovante() {
        System.out.println("Gerando comprovante genérico");
    }
}

public class PagamentoCartao extends Pagamento {
    private String numeroCartao;
    private String bandeira;
    
    // Implementar construtor e métodos específicos
}

public class PagamentoBoleto extends Pagamento {
    private String codigoBarras;
    private String dataVencimento;
    
    // Implementar construtor e métodos específicos
}

public class PagamentoPIX extends Pagamento {
    private String chavePIX;
    private String tipoChave;
    
    // Implementar construtor e métodos específicos
}
```

Requisitos:
1. Cada tipo de pagamento deve ter sua própria implementação do método `processar()`
2. Cada tipo de pagamento deve ter sua própria implementação do método `gerarComprovante()`
3. Crie uma classe `ProcessadorPagamentos` que aceita qualquer tipo de pagamento
4. Demonstre o uso do polimorfismo processando diferentes tipos de pagamento

### Exercício 3: Sistema de Notificações
Implemente um sistema de notificações que suporta diferentes canais de envio (Email, SMS e Push).

Estrutura das classes:
```java
public class Notificacao {
    protected String destinatario;
    protected String mensagem;
    protected String dataEnvio;
    
    public Notificacao(String destinatario, String mensagem, String dataEnvio) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.dataEnvio = dataEnvio;
    }
    
    public void enviar() {
        System.out.println("Enviando notificação genérica");
    }
    
    public void validar() {
        System.out.println("Validando notificação genérica");
    }
}

public class NotificacaoEmail extends Notificacao {
    private String assunto;
    private String[] copias;
    
    // Implementar construtor e métodos específicos
}

public class NotificacaoSMS extends Notificacao {
    private String numeroTelefone;
    private boolean confirmacaoLeitura;
    
    // Implementar construtor e métodos específicos
}

public class NotificacaoPush extends Notificacao {
    private String dispositivo;
    private String prioridade;
    
    // Implementar construtor e métodos específicos
}
```

Requisitos:
1. Cada tipo de notificação deve ter sua própria implementação do método `enviar()`
2. Cada tipo de notificação deve ter sua própria implementação do método `validar()`
3. Crie uma classe `GerenciadorNotificacoes` que pode enviar qualquer tipo de notificação
4. Implemente um método que envia notificações em lote usando polimorfismo

### Exercício 4: Sistema de Relatórios
Crie um sistema de geração de relatórios que suporta diferentes formatos (PDF, HTML e CSV).

Estrutura das classes:
```java
public class Relatorio {
    protected String titulo;
    protected String[] dados;
    protected String dataGeracao;
    
    public Relatorio(String titulo, String[] dados, String dataGeracao) {
        this.titulo = titulo;
        this.dados = dados;
        this.dataGeracao = dataGeracao;
    }
    
    public void gerar() {
        System.out.println("Gerando relatório genérico");
    }
    
    public void validarDados() {
        System.out.println("Validando dados do relatório genérico");
    }
}

public class RelatorioPDF extends Relatorio {
    private String estilo;
    private boolean incluirSumario;
    
    // Implementar construtor e métodos específicos
}

public class RelatorioHTML extends Relatorio {
    private String tema;
    private boolean responsivo;
    
    // Implementar construtor e métodos específicos
}

public class RelatorioCSV extends Relatorio {
    private String delimitador;
    private boolean incluirCabecalho;
    
    // Implementar construtor e métodos específicos
}
```

Requisitos:
1. Cada tipo de relatório deve ter sua própria implementação do método `gerar()`
2. Cada tipo de relatório deve ter sua própria implementação do método `validarDados()`
3. Crie uma classe `GeradorRelatorios` que pode gerar qualquer tipo de relatório
4. Implemente um método que gera múltiplos relatórios em diferentes formatos usando polimorfismo

## Referências

- [Polymorphism](https://docs.oracle.com/javase/tutorial/java/IandI/polymorphism.html)
- [Writing Final Classes and Methods](https://docs.oracle.com/javase/tutorial/java/IandI/final.html)