# Lets Code - Orientação a Objetos

### Enunciado

> Crie uma aplicação que simule uma app bancária. Os clientes podem ser pessoa física ou jurídica, sendo que para PJ existe a cobrança de uma taxa de 0.5% para cada saque ou transferência. Além do produto conta-corrente, os clientes PF podem abrir uma conta-poupança e conta-investimento. Clientes PJ não abrem poupança, mas seus rendimentos em conta-investimento rendem 2% a mais.
> 
> Crie as funcionalidades: abrir conta, sacar, depositar, transferência, investir, consultar saldo.
> 
> Use a classe "Aplicacao" para criar seu método "main" e demonstrar o funcionamento do seu código.
> O projeto pode ser entregue via arquivo zip para o e-mail do professor ou via link de repositório Github.

## Introdução

Esse projeto consiste na criação de um sistema de banco para refinar os conceitos de Herança, Polimorfismo e fundamentos de programação em Java. Porém, para ir mais além na tarefa, tivemos alguns testes para consolidar conceitos SOLID e padrões de projetos.

Esse processo começou a partir do primeiro projeto considerada a versão rascunho [aqui](https://github.com/NatSatie/letscode-modulo1). Nele tem conceitos extras como Handler de eventos, e uma organização inicial para as classes do projeto. Nesta versão, as classes abstratas e estáticas estão bem separadas.

## Lista de tarefas


- [x] Classes de Pessoa fisica e juridica
- [x] Classe abstrata de pessoa
- [x] Criação das classes da conta bancária: conta corrente, conta poupança e conta investimento
- [x] Criação das ações de abrir conta, sacar, depositar, transferir e consultar saldo
- [ ] Adicionar investir para depositar um valor da conta corrente para conta investimento

## Classes extras

- CalculateTax: faz o cálculo das taxas de ações feitas, como transferencia e saque
- LegalUserSavingaccout: previne o usuario de criar uma conta com pessoa juridica
- AccountType como Enum, identifica para quais contas as ações devem ser feitas conforme
- ClientData: uma classe para armazenar os clientes e fazer a busca automática

# Resultados ao rodar a Aplicacao

```
***************** Parte 0 ********************
Inicializacao de contas e criacao
- Cliente com pessoa fisica:   nome: batata      # documento: 1
- Cliente com pessoa juridica: nome: repolho      # documento: 2
- Cliente com pessoa juridica: nome: feira company inc      # documento: 3
- Cliente com pessoa juridica: nome: supermercado inc      # documento: 4
- Cliente com pessoa fisica:   nome: acabate      # documento: 5
* Foi gerada conta corrente para batata *
* Foi gerada conta corrente para repolho *
* Foi gerada conta investimento para repolho *
* Foi gerada conta investimento para feira company inc *
* Foi gerada conta poupanca para acabate *

***************** Parte 1 ********************
Contexto: Senhor Batata abriu sua conta no Banco da Natalia,
ele vai conferir sua conta bancaria, depositar seu dinheiro
e finalmente transferir para a empresa Repolho.

-------- SALDO de batata --------
     Porcentagem de renda: 0.0%
     A conta de esta no valor de R$ 0,00
-------- Deposito --------
     Foram adicionados R$ 10.000,00
-------- SALDO de batata --------
     Porcentagem de renda: 0.0%
     A conta de esta no valor de R$ 10.000,00

***************** Parte 2 ********************
Contexto: A empresa Repolho viu que houve um engano e 
Batata mandou um valor a mais que o necessario, 
ele digitou um numero a mais e nao viu.
a empresa vai transferir o valor a mais

-------- Transferencia de batata -> repolho --------
batata:
     Foram removidos R$ 1.000,00
repolho:
     Foram adicionados R$ 1.000,00
-------- SALDO de batata --------
     Porcentagem de renda: 0.0%
     A conta de esta no valor de R$ 9.000,00
-------- Transferencia de repolho -> batata --------
     O valor de R$ 900,00 teve uma adicao de taxa de R$ 4,50
repolho:
     Foram removidos R$ 904,50
batata:
     Foram adicionados R$ 900,00
-------- SALDO de repolho --------
     Porcentagem de renda: 0.0%
     A conta de esta no valor de R$ 95,50

***************** Parte 3 ********************
Contexto: A empresa Feira company inc precisa fazer um saque 
urgente vindo da conta investimento 

-------- Deposito --------
     Foram adicionados R$ 1.000.000,00
-------- Saque --------
     O valor de R$ 10.000,00 teve uma adicao de taxa de R$ 50,00
     Foram removidos R$ 10.050,00
-------- SALDO de feira company inc --------
     Porcentagem de renda: 5.000%
     A conta de esta no valor de R$ 1.091.947,50

***************** Parte 4 ********************
Contexto: O filho da empresa supermercado quer criar uma conta poupanca 
porem, exigiu ao gerente que criasse da mesma forma, em um ataque de furia 
o filho decidiu criar por conta propria. 
Descomente a linha 77 para ver o erro. 


***************** Parte 4 ********************
Contexto: O acabate decidiu fazer uma conta poupanca para 
garantir uma boa aposentadoria e transferiu todos oseu dinheiro nele 
Ele quer ver o saldo apos os depositos. 

-------- Deposito --------
     Foram adicionados R$ 10.000,00
-------- SALDO de acabate --------
     Porcentagem de renda: 1.000%
     A conta de esta no valor de R$ 10.100,00

```
