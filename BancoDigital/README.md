# Banco Digital

Este projeto utiliza Lombok para reduzir a verbosidade do código Java. Lombok é uma biblioteca que automatiza a geração de métodos padrão como getters, setters, construtores, entre outros.

## Funcionalidades do Lombok Utilizadas

- **Getters e Setters**: Anotação `@Getter` e `@Setter` para gerar automaticamente métodos getters e setters para os campos da classe.
  
- **Construtores**: Anotação `@NoArgsConstructor`, `@AllArgsConstructor` e `@RequiredArgsConstructor` para gerar construtores padrão, com todos os argumentos e apenas para campos marcados como `final`.

- **ToString**: Anotação `@ToString` para gerar automaticamente o método `toString()` para exibir informações detalhadas do objeto.

- **EqualsAndHashCode**: Anotação `@EqualsAndHashCode` para gerar métodos `equals()` e `hashCode()` baseados nos campos da classe.

- **Data**: Anotação `@Data` combina as funcionalidades de `@Getter`, `@Setter`, `@ToString`, `@EqualsAndHashCode` e `@RequiredArgsConstructor` em uma única anotação conveniente.

## Exemplo de Uso

```java
import lombok.Data;

@Data
public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
}
´´´
Neste exemplo, a anotação `@Data` substitui a necessidade de escrever manualmente métodos getters, setters, `toString()`, `equals()` e `hashCode()` para a classe `Cliente`.

## Configuração do Projeto
Certifique-se de que a extensão Lombok está instalada no seu IDE (como VS Code) e configurada corretamente para reconhecer anotações Lombok. Isso normalmente envolve adicionar um plugin Lombok ao seu ambiente de desenvolvimento.

## Documentação Adicional
Para mais detalhes sobre o uso do Lombok, consulte a documentação oficial do Lombok.

## Desenvolvido por
Cauã Assunção
