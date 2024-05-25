# Estruturas de Repetição em Java

Este documento resume o que aprendi sobre as estruturas de repetição (loops) em Java.

\`\`\`java
public class EstruturasRepeticao {
    public static void main(String[] args) {
        // Exemplo de laço for
        for (int i = 0; i < 5; i++) {
            System.out.println("Número: " + i);
        }

        // Exemplo de laço while
        int j = 0;
        while (j < 5) {
            System.out.println("Número (while): " + j);
            j++;
        }

        // Exemplo de laço do-while
        int k = 0;
        do {
            System.out.println("Número (do-while): " + k);
            k++;
        } while (k < 5);
    }
}
\`\`\`

## Tipos de Estruturas de Repetição

Em Java, existem três principais tipos de estruturas de repetição:

1. **Laço `for`**
    ```java
    for (inicialização; condição; incremento/decremento) {
        // bloco de código a ser repetido
    }
    ```

2. **Laço `while`**
    ```java
    while (condição) {
        // bloco de código a ser repetido
    }
    ```

3. **Laço `do-while`**
    ```java
    do {
        // bloco de código a ser repetido
    } while (condição);
    ```

## Exemplo de Código: Laço `do-while` com Incremento de Variáveis

\`\`\`java
public static void main(String[] args) {
    int num = 5, count = 1;
    do {
        num += count;
        System.out.println(num);
        count++;  // Incrementa count a cada iteração
    } while (count <= 3);
}
\`\`\`

Este exemplo imprime os números 6, 8 e 11, devido ao incremento da variável `count`.

## Conclusão

As estruturas de repetição são essenciais para controlar a repetição de blocos de código em Java, proporcionando maior eficiência e organização nos programas.
