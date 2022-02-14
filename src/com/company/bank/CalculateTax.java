package com.company.bank;

import com.company.client.Client;
import com.company.client.person.LegalPerson;
import com.company.client.person.NaturalPerson;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public final class CalculateTax {
    public static BigDecimal action(Client user, BigDecimal value){
        NumberFormat realFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        if (user.getPerson() instanceof LegalPerson){
            BigDecimal tax = value.multiply(BigDecimal.valueOf(0.005));
            System.out.println("     O valor de " + realFormat.format(value) + " teve uma adicao de taxa de " + realFormat.format(tax));
            return value.add(tax);
        } return value;
    }
}
