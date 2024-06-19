# Modelagem e Diagramação de um Componente iPhone

Este projeto é uma modelagem e diagramação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Contexto

Com base no vídeo de lançamento do iPhone de 2007, foi elaborado um diagrama UML das classes e interfaces que representam as funcionalidades principais do iPhone.

## Funcionalidades a Modelar

### Reprodutor Musical
- Métodos:
  - `tocar()`
  - `pausar()`
  - `selecionarMusica(String musica)`

### Aparelho Telefônico
- Métodos:
  - `ligar(String numero)`
  - `atender()`
  - `iniciarCorreioVoz()`

### Navegador na Internet
- Métodos:
  - `exibirPagina(String url)`
  - `adicionarNovaAba()`
  - `atualizarPagina()`

## Diagrama UML

```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet


### Resumo

- O diagrama UML ilustra as relações entre a classe `iPhone` e as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`.
- A implementação em Java exemplifica como as funcionalidades podem ser representadas em código.