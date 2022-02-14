package com.company.client.account;

import java.math.BigDecimal;

public class InvestAccount extends Account {

    public InvestAccount(BigDecimal earningPercentage){
        super(earningPercentage);
    }

    @Override
    public void subtractBalance(BigDecimal value) {
        super.subtractBalance(value);
    }
}
