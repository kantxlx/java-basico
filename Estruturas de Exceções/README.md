# Estruturas de Exceções em Java

Este README tem como objetivo apresentar as estruturas de exceções em Java, incluindo exemplos de código para ilustrar cada conceito.

## O que são Exceções?

Exceções são eventos que ocorrem durante a execução de um programa e que interrompem o fluxo normal de execução. Em Java, as exceções são representadas por objetos da classe `Throwable` ou suas subclasses.

## Tipos de Exceções

Existem dois tipos de exceções em Java:

* **Checked Exceptions**: São exceções que devem ser tratadas pelo programador. Exemplos incluem `IOException`, `SQLException`, etc.
* **Unchecked Exceptions**: São exceções que não precisam ser tratadas pelo programador. Exemplos incluem `RuntimeException`, `NullPointerException`, etc.

## Estrutura de Exceções

A estrutura de exceções em Java é composta por três partes:

* **Try**: É o bloco de código que pode gerar uma exceção.
* **Catch**: É o bloco de código que trata a exceção gerada.
* **Finally**: É o bloco de código que é executado independentemente de uma exceção ter sido gerada ou não.



## Exemplo de Código

Aqui está um exemplo de código que demonstra a estrutura de exceções em Java:

```java
public class ExemploExcecoes {
    public static void main(String[] args) {
        try {
            // Código que pode gerar uma exceção
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            // Tratamento da exceção
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Código que é executado independentemente de uma exceção ter sido gerada
            System.out.println("Finalizando o programa");
        }
    }
}
```
Neste exemplo, o código dentro do bloco try pode gerar uma exceção ArithmeticException quando tenta dividir um número por zero. O bloco catch trata a exceção e imprime uma mensagem de erro. O bloco finally é executado independentemente de uma exceção ter sido gerada e imprime uma mensagem de finalização do programa.


### Conclusão

As estruturas de exceções em Java são fundamentais para garantir a robustez e a segurança de um programa. Ao entender como funcionam as exceções em Java, você pode escrever código mais eficiente e seguro.

Espero que este README tenha sido útil! Se tiver alguma dúvida ou precisar de mais informações, não hesite em perguntar.