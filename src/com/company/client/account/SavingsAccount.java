package com.company.client.account;

import java.math.BigDecimal;

public class SavingsAccount extends Account{
    public SavingsAccount(){
        super(Percentages.SAVINGS.getVal());
    }

    public SavingsAccount(BigDecimal earningPercentage){
        super(earningPercentage);
    }
}
