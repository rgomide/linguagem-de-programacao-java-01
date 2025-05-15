# Classes Object e String

## Sumário
- [Herança da Classe Object](#herança-da-classe-object)
- [Métodos Importantes da Classe Object](#métodos-importantes-da-classe-object)
- [Classe String e Método format()](#classe-string-e-método-format)

## Herança da Classe Object

Em Java, todas as classes herdam implicitamente da classe `Object`. Isso significa que mesmo que você não declare explicitamente uma herança, sua classe já possui todos os métodos definidos na classe `Object`. Isso é conhecido como herança implícita.

```java
// Mesmo sem declarar extends Object, a classe já herda de Object
public class MinhaClasse {
    // ...
}

// É equivalente a:
public class MinhaClasse extends Object {
    // ...
}
```

## Métodos Importantes da Classe Object

### equals()

O método `equals()` é usado para comparar se dois objetos são iguais em termos de conteúdo. Por padrão, ele compara referências (como o operador `==`), mas é comum sobrescrevê-lo para implementar uma comparação personalizada.

```java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        
        Pessoa pessoa = (Pessoa) obj;
        return this.idade == pessoa.idade && 
               Objects.equals(this.nome, pessoa.nome);
    }
}

// Uso:
Pessoa p1 = new Pessoa("João", 25);
Pessoa p2 = new Pessoa("João", 25);

System.out.println(p1.equals(p2)); // true
```

O exemplo acima mostra que o método `equals()` compara os valores dos atributos `nome` e `idade` de cada objeto `Pessoa` para verificar se eles são iguais.

### toString()

O método `toString()` retorna uma representação em string do objeto. É muito útil para debug e logging. Por padrão, retorna o nome da classe seguido do hashcode do objeto.

```java
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{nome='" + this.nome + "', preco=" + this.preco + "}";
    }
}

// Uso:
Produto produto = new Produto("Notebook", 3500.00);
System.out.println(produto); // Imprime: Produto{nome='Notebook', preco=3500.0}
```

## Classe String e Método format()

A classe `String` em Java é imutável e oferece diversos métodos úteis. O método `format()` é particularmente útil para criar strings formatadas, similar ao printf em C. A sintaxe é composta de um template e argumentos.

O template é uma string que contém placeholders para os valores que serão substituídos. Os placeholders são representados por `%` seguido de um especificador de formato. Os argumentos são os valores que serão substituídos nos placeholders. A quantidade de placeholders deve ser igual à quantidade de argumentos.

### Especificadores de Formato Comuns (Placeholders)

- `%s` - String
- `%d` - Inteiro
- `%f` - Número de ponto flutuante
- `%n` - Nova linha
- `%t` - Data/hora
- `%b` - Booleano
- `%x` - Hexadecimal

### Exemplos de String.format()

```java
// Formatação básica
String nome = "Maria";
int idade = 30;
String mensagem = String.format("Nome: %s, Idade: %d", nome, idade); // Os placeholders são %s e %d. Os argumentos são as variáveis nome e idade.
// Resultado: "Nome: Maria, Idade: 30"

// Formatação de números decimais
double preco = 1234.5678;
String precoFormatado = String.format("Preço: R$ %.2f", preco);
// Resultado: "Preço: R$ 1234.57"

// Formatação com múltiplos argumentos
String data = String.format("%02d/%02d/%04d", 5, 3, 2024);
// Resultado: "05/03/2024"

// Alinhamento de texto
String texto = String.format("%-10s | %10s", "Nome", "Valor");
// Resultado: "Nome       |      Valor"

// Formatação de data e hora
String dataHora = String.format("%tF %tT", new Date(), new Date());
// Resultado: "2024-03-05 14:30:45"
```

## Referências

- [Object](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html)
- [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
- [Java String format() Method](https://www.w3schools.com/java/ref_string_format.asp)