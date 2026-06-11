## Strategy (Comportamental)

**Fonte:** https://refactoring.guru/pt-br/design-patterns/strategy

### Sobre o padrão

O padrão Strategy permite isolar diferentes maneiras de fazer uma mesma tarefa em classes separadas. Em vez de criar uma classe enorme e cheia de if e else para decidir qual regra usar, o sistema permite que você alterne o comportamento do código durante a execução apenas trocando a classe da estratégia.

### Problema

Ao processar o pagamento de um pedido, precisamos lidar com diferentes opções como PIX, cartão de crédito ou boleto. Sem o Strategy, a classe Pedido teria que usar uma série de if e else para verificar qual forma de pagamento foi escolhida e executar a lógica correta. Isso faz com que a classe fique gigante, difícil de ler e muito complicada de alterar caso você precise adicionar ou remover alguma nova forma de pagamento no futuro.

### Solução

A solução é criar uma interface FormaDePagamento que define o contrato para todas as formas de pagamento. Cada opção, PIX, cartão e boleto, vira uma classe separada que implementa essa interface com sua própria lógica. A classe Pedido recebe a estratégia escolhida e delega o pagamento para ela, sem precisar saber qual é.

### Exemplo implementado

A interface FormaDePagamento define o método realizarPagamento() que todas as estratégias devem implementar. PagamentoPix aprova o pagamento direto, PagamentoBoleto gera o boleto com o valor total e PagamentoCartaoCredito recebe o número de parcelas e calcula o valor de cada uma.

A classe Pedido armazena o produto e o valor, e recebe a estratégia via setFormaDePagamento(). O método pagar() apenas delega para a estratégia atual, sem nenhum if/else. Na classe Main, o mesmo pedido é pago três vezes com estratégias diferentes trocadas em tempo de execução.

[Ver código](../../src/strategy/)

**Resultado do exemplo:**

```
Pedido: Pizza = R$50.0
Pagamento de R$50.0 via PIX aprovado.
--------------------
Pedido: Pizza = R$50.0
Pagamento de R$50.0 no cartão de credito em 2x de R$25.0
--------------------
Pedido: Pizza = R$50.0
Boleto de R$50.0 gerado.
```
