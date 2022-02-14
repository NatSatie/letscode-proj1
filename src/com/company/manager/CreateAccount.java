package com.company.manager;

import com.company.client.Client;
import com.company.client.account.*;
import com.company.client.person.LegalPerson;
import com.company.client.person.NaturalPerson;

import java.math.BigDecimal;

public final class CreateAccount {
    public static void generateCheckingAccount(Client user){
        System.out.println("* Foi gerada conta corrente para "+ user.getPerson().getName() +" *");
        user.setChecking(new CheckingAccount());
    }
    public static void generateSavingsAccount(Client user) throws LegalUserCreatingSavingAccount {
        if (user.getPerson() instanceof NaturalPerson){
            System.out.println("* Foi gerada conta poupanca para "+ user.getPerson().getName() +" *");
            user.setSavings(new SavingsAccount());
        } else {
            throw new LegalUserCreatingSavingAccount();
        }
    }

    public static void generateInvestAccount(Client user){
        if (user.getPerson() instanceof NaturalPerson){
            user.setInvest(new InvestAccount(Percentages.INVESTNATURAL.getVal()));
        } else if (user.getPerson() instanceof LegalPerson){
            user.setInvest(new InvestAccount(Percentages.INVESTLEGAL.getVal()));
        } System.out.println("* Foi gerada conta investimento para "+ user.getPerson().getName() +" *");
    }

}
