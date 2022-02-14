package com.company.bank;

import com.company.client.Client;

import java.math.BigDecimal;

public final class Transfer {
    public static void action(Client user, AccountType userAccountType,
                              Client receiver, AccountType receiverAccountType, BigDecimal value) {
        System.out.println("-------- Transferencia de "+ user.getPerson().getName() + " -> "
                + receiver.getPerson().getName()+ " --------");
        BigDecimal valueWithTaxes = CalculateTax.action(user, value);
        System.out.println(user.getPerson().getName()+ ":");
        switch (userAccountType){
            case CHECKING:
                user.getChecking().subtractBalance(valueWithTaxes);
                break;
            case SAVINGS:
                user.getSavings().subtractBalance(valueWithTaxes);
                break;
            case INVEST:
                user.getInvest().subtractBalance(valueWithTaxes);
                break;
        }
        System.out.println(receiver.getPerson().getName()+ ":");
        switch (receiverAccountType){
            case CHECKING:
                receiver.getChecking().addBalance(value);
                break;
            case SAVINGS:
                receiver.getSavings().addBalance(value);
                break;
            case INVEST:
                receiver.getInvest().addBalance(value);
                break;
        }
        return;
    }

}
