## Singleton (Criacional) 

**Fonte:** https://refactoring.guru/pt-br/design-patterns/singleton

### Sobre o padrão

O padrão Singleton garante que uma classe seja instanciada apenas uma vez durante toda a execução do programa. Em vez de criar um novo objeto toda vez que precisar usá-lo, o código é estruturado para criar essa instância uma única vez e reaproveitá-la em todo o sistema.

### Problema

Ao gerenciar as configurações de um aplicativo, como o tema claro ou escuro, várias telas precisam acessar a mesma informação. Se cada tela instanciar o seu próprio gerenciador, o sistema terá várias configurações independentes rodando juntas. Com isso, se o usuário mudar o tema para escuro em um local, os outros continuarão no tema claro, causando um problema de inconsistência visual.

### Solução

A solução é aplicar o padrão Singleton para bloquear a criação livre de instâncias. Para isso, tornamos o construtor privado e criamos um método único que controla essa criação. Se o gerenciador de configurações não existir, ele cria um. Se já existir, ele apenas devolve o mesmo. Isso garante que todo o aplicativo acesse exatamente o mesmo local para ler e alterar os dados

### Exemplo implementado 

O código implementa a classe ConfigManager, que armazena a variável do tema. Ela possui um construtor privado e o método getInstance, garantindo que a classe gerencie a sua própria e única instância.

Na classe Main, solicitamos o gerenciador pela primeira vez e o console exibe o tema padrão claro. Logo depois, usamos essa mesma variável para mudar o tema para escuro.

Quando chamamos o gerenciador novamente criando uma segunda variável, o console mostra que o tema já é o escuro, provando que os dados foram alterados de forma global. Por fim, o código compara as duas variáveis e confirma que elas apontam para o mesmo objeto na memória.

[Ver código](../../src/singleton/)

**Resultado do exemplo:**

```
Tema da primeira config: claro
Tema da segunda config: escuro
São o mesmo objeto?: true
```
