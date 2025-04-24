# Sobrecarga de Métodos

## Sumário

- [Introdução](#introdução)
- [Características da Sobrecarga de Métodos](#características-da-sobrecarga-de-métodos)
- [Exemplo de Sobrecarga](#exemplo-de-sobrecarga)
- [Vantagens da Sobrecarga](#vantagens-da-sobrecarga)
- [Regras Importantes](#regras-importantes)
- [Exemplo de Uso](#exemplo-de-uso)
- [Considerações Finais](#considerações-finais)
- [Exercícios](#exercícios)
- [Referências](#referências)

## Introdução

A sobrecarga de métodos (method overloading) é um recurso da linguagem Java que permite criar múltiplos métodos com o mesmo nome, mas com diferentes parâmetros. Isso torna o código mais flexível e legível, permitindo que um mesmo nome de método execute diferentes comportamentos dependendo dos parâmetros fornecidos.

## Características da Sobrecarga de Métodos

1. **Mesmo Nome**: Os métodos devem ter o mesmo nome
2. **Diferentes Parâmetros**: Devem diferir em:
   - Número de parâmetros
   - Tipo dos parâmetros
   - Ordem dos parâmetros
3. **Mesma Classe**: Os métodos devem estar na mesma classe
4. **Tipo de Retorno**: O tipo de retorno pode ser o mesmo ou diferente

## Exemplo de Sobrecarga

```java
public class Calculadora {
    // Calcula a área de um retângulo
    public double calcularArea(double base, double altura) {
        return base * altura;
    }
    
    // Calcula a área de um paralelepípedo
    public double calcularArea(double base, double altura, double profundidade) {
        return 2 * (base * altura + base * profundidade + altura * profundidade);
    }
    
    // Calcula a área de um quadrado
    public double calcularArea(double lado) {
        return 4 * lado;
    }
}
```

## Vantagens da Sobrecarga

1. **Legibilidade**: Código mais limpo e fácil de entender
2. **Flexibilidade**: Permite diferentes formas de chamar o mesmo método
3. **Manutenção**: Facilita a manutenção do código
4. **Reutilização**: Promove a reutilização de nomes de métodos

## Regras Importantes

- A sobrecarga não pode ser feita apenas mudando o tipo de retorno
- A sobrecarga não pode ser feita apenas mudando o modificador de acesso
- A sobrecarga não pode ser feita apenas mudando o modificador final/static

## Exemplo de Uso

```java
public class Main {
  public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    
    // Calcula a área de um retângulo
    System.out.println(calc.calcularArea(5, 3)); // 15.0
    
    // Calcula a área de um paralelepípedo
    System.out.println(calc.calcularArea(5, 3, 2)); // 62.0
    
    // Calcula a área de um quadrado
    System.out.println(calc.calcularArea(5)); // 20.0
  }
}
```

## Considerações Finais

A sobrecarga de métodos é uma técnica poderosa que deve ser usada com cuidado. É importante:
- Manter a consistência no comportamento dos métodos sobrecarregados
- Evitar criar muitas sobrecargas que possam confundir outros desenvolvedores
- Documentar adequadamente cada versão do método
- Usar nomes de parâmetros descritivos para facilitar a compreensão

## Exercícios

1. Crie uma classe `Calculadora` com métodos sobrecarregados para realizar operações matemáticas básicas:
   - `somar`: deve ter versões para 2, 3 e 4 números inteiros
   - `subtrair`: deve ter versões para 2 números inteiros e 2 números decimais
   - `multiplicar`: deve ter versões para 2 números inteiros e 2 números decimais
   - `dividir`: deve ter versões para 2 números inteiros e 2 números decimais

2. Crie uma classe `GerenciadorTexto` com métodos sobrecarregados para:
   - Concatenar 2, 3 ou 4 strings
   - Repetir uma string N vezes (onde N pode ser int ou double)

3. Crie uma classe `SistemaNotas` com métodos sobrecarregados para:
   - Calcular a média de 2, 3 ou 4 notas
   - Verificar se um aluno foi aprovado (métodos que aceitam diferentes tipos de parâmetros)

4. Crie uma classe `BancoDados` com métodos sobrecarregados para:
   - Inserir registros (com diferentes combinações de campos)
   - Buscar registros (por diferentes critérios)
   - Atualizar registros (com diferentes conjuntos de dados)
   - Excluir registros (por diferentes identificadores)

Para cada exercício:
- Implemente a classe com os métodos sobrecarregados
- Crie uma classe de teste (Main) para demonstrar o uso de cada método
- Documente cada método com comentários explicando seu propósito
- Certifique-se de que os métodos mantenham consistência em seu comportamento

## Referências
- [Defining Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)