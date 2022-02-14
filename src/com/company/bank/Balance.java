package com.company.bank;

import com.company.client.Client;

import java.math.BigDecimal;

public final class Balance {
    public static void action(Client user, AccountType accountType) {
        System.out.println("-------- SALDO de "+ user.getPerson().getName() +" --------");
        switch (accountType){
            case CHECKING:
                user.getChecking().checkBalance();
                break;
            case SAVINGS:
                user.getSavings().checkBalance();
                break;
            case INVEST:
                user.getInvest().checkBalance();
                break;
        } return;
    }
}
