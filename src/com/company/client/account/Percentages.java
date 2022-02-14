package com.company.client.account;

import java.math.BigDecimal;

public enum Percentages {
    CHECKING(BigDecimal.ZERO),
    SAVINGS(BigDecimal.valueOf(0.01)),
    INVESTNATURAL(BigDecimal.valueOf(0.03)),
    INVESTLEGAL(BigDecimal.valueOf(0.05));

    private final BigDecimal val;

    private Percentages(BigDecimal val){
        this.val = val;
    }

    public BigDecimal getVal() {
        return val;
    }
}
