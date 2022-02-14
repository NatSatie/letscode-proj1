package com.company.client;

import com.company.client.account.CheckingAccount;
import com.company.client.account.InvestAccount;
import com.company.client.account.SavingsAccount;
import com.company.client.person.Person;

import java.util.ArrayList;

public class Client {
    private Person person;
    private CheckingAccount checking;
    private SavingsAccount savings;
    private InvestAccount invest;

    public Client(Person person){
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public CheckingAccount getChecking() {
        return checking;
    }

    public SavingsAccount getSavings() {
        return savings;
    }

    public InvestAccount getInvest() {
        return invest;
    }

    public void setChecking(CheckingAccount checking) {
        this.checking = checking;
    }

    public void setSavings(SavingsAccount savings) {
        this.savings = savings;
    }

    public void setInvest(InvestAccount invest) {
        this.invest = invest;
    }
}
