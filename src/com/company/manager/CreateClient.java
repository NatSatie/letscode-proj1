package com.company.manager;

import com.company.client.Client;
import com.company.client.account.Account;
import com.company.client.person.LegalPerson;
import com.company.client.person.NaturalPerson;
import com.company.client.person.Person;

public final class CreateClient {
    public static Client generateNaturalPerson(String name, String doc){
        System.out.println("- Cliente com pessoa fisica:   nome: " + name + "      # documento: " + doc);
        return new Client(new NaturalPerson(name, doc));
    }

    public static Client generateLegalPerson(String name, String doc){
        System.out.println("- Cliente com pessoa juridica: nome: " + name + "      # documento: " + doc);
        return new Client(new LegalPerson(name, doc));
    }
}
