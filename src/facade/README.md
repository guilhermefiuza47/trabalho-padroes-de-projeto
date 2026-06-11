## Facade (Estrutural)

**Fonte:** https://refactoring.guru/pt-br/design-patterns/facade

### Sobre o padrão

O padrão Facade fornece uma interface simples para evitar que o código fique todo conglomerado na classe Main. Em vez do cliente gerenciar várias partes menores do sistema, o Facade organiza isso internamente e expõe apenas os comandos essenciais que o cliente precisa saber para executar as funcionalidades.

### Problema

Ao desenvolver um software para automatizar um Home Theater, ligar o sistema exige acionar as classes do projetor, do sistema de som e do streaming separadamente e na ordem certa. Se a classe Main tiver que gerenciar todas essas partes soltas sempre que for iniciar um filme, o código ficará gigante, repetitivo e difícil de manter.

### Solução

A solução é criar uma classe intermediária, que no caso chamamos de HomeTheaterFacade. Ela centraliza a comunicação com todos os equipamentos e esconde a lógica de ligar o projetor, o som e o streaming na ordem certa dentro de métodos simples, como comecarFilme(). Dessa forma, a classe Main interage apenas com o Facade, ficando limpa e totalmente isolada da complexidade dos aparelhos.

### Exemplo implementado

O código simula um home theater com três classes independentes: Projetor, SistemaDeSom e ServicoDeStreaming. Cada equipamento possui apenas os seus próprios métodos de ligar e desligar.

A classe HomeTheaterFacade cria a instância desses três equipamentos e oferece dois métodos: comecarFilme(), que liga tudo na ordem certa, e terminarFilme(), que desliga tudo na ordem inversa.

A classe Main instancia apenas o Facade e interage com ele, sendo que o cliente não tem contato direto com nenhum dos subsistemas.

[Ver código](../../src/facade/)

**Resultado do exemplo:**

```
Incializando Home Theater...
Projetor ligado.
Sistema de som ligado.
Streaming ligado.
-------------------------
Encerrando Home Theater...
Streaming desligado.
Sistema de som desligado.
Projetor desligado.
```
