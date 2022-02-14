package com.company;

import com.company.client.Client;
import com.company.client.person.NaturalPerson;
import com.company.manager.CreateClient;

import java.util.ArrayList;

public class ClientsData {
    private ArrayList<Client> data;

    public ClientsData(){
        this.data = new ArrayList<Client>();
    }

    public void add(Client user){
        this.data.add(user);
    }

    public Client getUser(String document){
        return data.stream()
                .filter(cli -> cli.getPerson().getDocument().equals(document))
                .findFirst()
                .orElse(null);
    }
}
