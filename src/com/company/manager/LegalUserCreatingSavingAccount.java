package com.company.manager;

public class LegalUserCreatingSavingAccount extends Exception{

    public LegalUserCreatingSavingAccount(){
        super("Usuario com cliente fisico nao pode ter uma conta poupanca");
    }
}
