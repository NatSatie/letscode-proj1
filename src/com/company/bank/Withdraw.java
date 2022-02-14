package com.company.bank;

import com.company.client.Client;
import com.company.client.person.LegalPerson;
import com.company.client.person.NaturalPerson;

import java.math.BigDecimal;

public final class Withdraw {
    public static void action(Client user, AccountType accountType, BigDecimal value) {
        System.out.println("-------- Saque --------");
        value = CalculateTax.action(user, value);
        switch (accountType){
            case CHECKING:
                user.getChecking().subtractBalance(value);
                break;
            case SAVINGS:
                user.getSavings().subtractBalance(value);
                break;
            case INVEST:
                user.getInvest().subtractBalance(value);
                break;
        }
        return;
    }
}
