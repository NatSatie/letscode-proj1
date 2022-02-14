package com.company.client.account;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Account {
    private BigDecimal balance;
    private BigDecimal earningPercentage;
    private NumberFormat realFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    public Account(BigDecimal earningPercentage){
        this.balance = BigDecimal.ZERO;
        this.earningPercentage = earningPercentage;
    }

    public BigDecimal getBalance() {
        System.out.println(this.toString());
        return balance;
    }

    public void checkBalance() {
        System.out.println(this.toString());
    }

    public BigDecimal getEarningPercentage() {
        return earningPercentage;
    }

    public void setEarningPercentage(BigDecimal earningPercentage) {
        this.earningPercentage = earningPercentage;
    }

    private void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void calculateEarnings(){
        BigDecimal earns = this.balance.multiply(BigDecimal.ONE.add(earningPercentage));
        if (earns.compareTo(BigDecimal.ZERO) == 1){
            this.setBalance(earns);
        }
    }

    public void addBalance(BigDecimal value){
        System.out.println("     Foram adicionados " + this.realFormat.format(value));
        this.setBalance(this.balance.add(value));
        this.calculateEarnings();
    }

    public void subtractBalance(BigDecimal value){
        System.out.println("     Foram removidos " + this.realFormat.format(value));
        this.setBalance(this.balance.subtract(value));
        this.calculateEarnings();
    }

    @Override
    public String toString(){
        return "     Porcentagem de renda: " +  earningPercentage.multiply(BigDecimal.valueOf(100.0)) + "%\r\n"
                + "     A conta de esta no valor de " +  this.realFormat.format(this.balance);
    }
}
