package com.company;

import com.company.bank.*;
import com.company.client.Client;
import com.company.manager.CreateAccount;
import com.company.manager.CreateClient;
import com.company.manager.LegalUserCreatingSavingAccount;

import java.math.BigDecimal;

public class Aplicacao {

    private static ClientsData generateClients(ClientsData data){
        data.add(CreateClient.generateNaturalPerson("batata", "1"));
        data.add(CreateClient.generateLegalPerson("repolho", "2"));
        data.add(CreateClient.generateLegalPerson("feira company inc", "3"));
        data.add(CreateClient.generateLegalPerson("supermercado inc", "4"));
        data.add(CreateClient.generateNaturalPerson("acabate", "5"));
        return data;
    }

    private static ClientsData createMultipleAccounts(ClientsData data) throws LegalUserCreatingSavingAccount {
        CreateAccount.generateCheckingAccount(data.getUser("1"));
        CreateAccount.generateCheckingAccount(data.getUser("2"));
        CreateAccount.generateInvestAccount(data.getUser("2"));
        CreateAccount.generateInvestAccount(data.getUser("3"));
        CreateAccount.generateSavingsAccount(data.getUser("5"));
        return data;
    }

    public static void main(String[] args) throws LegalUserCreatingSavingAccount {
        System.out.println(
                "***************** Parte 0 ********************\r\n" +
                "Inicializacao de contas e criacao");
        ClientsData data = new ClientsData();
        data = generateClients(data);
        data = createMultipleAccounts(data);

        System.out.println(
                "\r\n***************** Parte 1 ********************\r\n" +
                "Contexto: Senhor Batata abriu sua conta no Banco da Natalia,\r\n"+
                "ele vai conferir sua conta bancaria, depositar seu dinheiro\r\n" +
                "e finalmente transferir para a empresa Repolho.\r\n");
        Client user = data.getUser("1");
        Balance.action(user, AccountType.CHECKING);
        Deposit.action(user, AccountType.CHECKING, BigDecimal.valueOf(10000));
        Balance.action(user, AccountType.CHECKING);

        System.out.println(
                "\r\n***************** Parte 2 ********************\r\n" +
                "Contexto: A empresa Repolho viu que houve um engano e \r\n"+
                "Batata mandou um valor a mais que o necessario, \r\n" +
                "ele digitou um numero a mais e nao viu.\r\n"+
                "a empresa vai transferir o valor a mais\r\n");
        Client receiver = data.getUser("2");
        Transfer.action(user, AccountType.CHECKING, receiver, AccountType.CHECKING, BigDecimal.valueOf(1000));
        Balance.action(user, AccountType.CHECKING);
        Transfer.action(receiver, AccountType.CHECKING, user, AccountType.CHECKING, BigDecimal.valueOf(900));
        Balance.action(receiver, AccountType.CHECKING);

        System.out.println(
                "\r\n***************** Parte 3 ********************\r\n" +
                        "Contexto: A empresa Feira company inc precisa fazer um saque \r\n"+
                        "urgente vindo da conta investimento \r\n");
        user = data.getUser("3");
        Deposit.action(user, AccountType.INVEST, BigDecimal.valueOf(1000000));
        Withdraw.action(user, AccountType.INVEST, BigDecimal.valueOf(10000));
        Balance.action(user, AccountType.INVEST);

        System.out.println(
                "\r\n***************** Parte 4 ********************\r\n" +
                        "Contexto: O filho da empresa supermercado quer criar uma conta poupanca \r\n" +
                        "porem, exigiu ao gerente que criasse da mesma forma, em um ataque de furia \r\n" +
                        "o filho decidiu criar por conta propria. \r\n"+
                        "Descomente a linha 77 para ver o erro. \r\n");
        user = data.getUser("4");
        // CreateAccount.generateSavingsAccount(user);

        System.out.println(
                "\r\n***************** Parte 4 ********************\r\n" +
                        "Contexto: O acabate decidiu fazer uma conta poupanca para \r\n" +
                        "garantir uma boa aposentadoria e transferiu todos oseu dinheiro nele \r\n" +
                        "Ele quer ver o saldo apos os depositos. \r\n");
        user = data.getUser("5");
        Deposit.action(user, AccountType.SAVINGS, BigDecimal.valueOf(10000));
        Balance.action(user, AccountType.SAVINGS);
    }
}
