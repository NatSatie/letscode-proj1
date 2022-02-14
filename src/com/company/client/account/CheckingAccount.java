package com.company.client.account;

import java.math.BigDecimal;

public class CheckingAccount extends Account {
    public CheckingAccount(){
        super(Percentages.CHECKING.getVal());
    }

    public CheckingAccount(BigDecimal earningPercentage){
        super(earningPercentage);
    }
}
