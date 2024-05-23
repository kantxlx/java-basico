# ContaBanco

Este é um projeto simples desenvolvido como um exercício de aprendizado dos conceitos básicos do Java. O objetivo do projeto é criar um terminal para gerenciar contas bancárias, onde os usuários podem inserir dados relacionados à conta por meio do terminal.
## Sumário
- [Visão Geral](#visão-geral)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Como Executar o Projeto](#como-executar-o-projeto)
- [Explicação do Código](#explicação-do-código)

## Visão Geral
Neste projeto, eu implementei um terminal para gerenciar contas bancárias, onde os usuários podem inserir dados relacionados à conta por meio do terminal. O projeto consiste em uma única classe Java, `ContaTerminal.java`, que é responsável por solicitar os dados da conta ao usuário e exibir uma mensagem de boas-vindas com os dados da conta inseridos.

## Tecnologias Utilizadas
- Linguagem de programação Java
- Ambiente de desenvolvimento integrado (IDE) para Java

## Como Executar o Projeto
1. Clone o repositório do projeto em sua máquina local.
2. Abra o projeto em sua IDE Java preferida.
3. Execute a classe `ContaTerminal.java`.
4. Siga as instruções no terminal para inserir os dados da conta.

## Explicação do Código
A classe `ContaTerminal.java` é a única classe no projeto e é responsável por solicitar os dados da conta ao usuário e exibir uma mensagem de boas-vindas com os dados da conta inseridos.

A classe possui cinco variáveis de instância para armazenar os dados da conta: `numero`, `agencia`, `nomeCliente`, `Sobrenome`, e `saldo`. Essas variáveis são declaradas como `int`, `String`, `String`, `String`, e `double`, respectivamente.

No método `main`, eu crio um objeto `Scanner` para ler a entrada do usuário a partir do terminal. Em seguida, eu solicito ao usuário que insira os dados da conta, um de cada vez, e armazeno esses dados nas variáveis de instância correspondentes.

Por fim, eu exibo uma mensagem de boas-vindas no terminal, formatada com os dados da conta inseridos usando o método `printf`.

Este projeto é um exemplo simples, mas efetivo, de como trabalhar com variáveis, entrada e saída de dados, e formatação de saída em Java.