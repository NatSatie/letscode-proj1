package com.company.bank;

import com.company.client.Client;

import java.math.BigDecimal;

public final class Deposit {
    public static void action(Client user, AccountType accountType, BigDecimal value) {
        System.out.println("-------- Deposito --------");
        switch (accountType){
            case CHECKING:
                user.getChecking().addBalance(value);
                break;
            case SAVINGS:
                user.getSavings().addBalance(value);
                break;
            case INVEST:
                user.getInvest().addBalance(value);
                break;
        }
        return;
    }
}