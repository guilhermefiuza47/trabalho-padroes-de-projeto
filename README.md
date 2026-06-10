# Padrões de Projeto em Java

Atividade da disciplina de Engenharia de Software. Foram implementados três padrões de projeto com base no catálogo do Refactoring Guru, sendo um criacional (Singleton), um estrutural (Facade) e um comportamental (Strategy).

**Utilização de IA:** O Gemini 3.1 Pro foi usado apenas para dar as ideias dos problemas aplicados nos exemplos de cada padrão. O código e a documentação foram feitos manualmente.

## 1. Singleton (Criacional)

**Problema:** Configurações globais precisam ser acessadas por todo o sistema. Se cada classe criar a sua própria instância para gerenciar isso, haverá desperdício de memória e o risco de uma parte do sistema usar um idioma ou tema diferente da outra.

## 2. Facade (Estrutural)

**Problema:** Ligar um home theater exige chamar métodos em várias classes diferentes (Projetor, Som, Streaming). O código cliente (a classe principal) teria que conhecer e orquestrar tudo isso manualmente, gerando um código repetitivo e engessado.

## 3. Strategy (Comportamental)

**Problema:** Um pedido pode ser pago com Pix, Cartão ou Boleto. Colocar tudo isso em if/else dentro da classe Pedido deixa o código confuso e difícil de expandir.

## Referências

* Refactoring.Guru — O Catálogo de Padrões de Projeto: <https://refactoring.guru/pt-br/design-patterns/catalog>