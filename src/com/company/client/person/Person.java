package com.company.client.person;

public abstract class Person {
    private String name;
    private String document;

    public Person(String name, String document) {
        this.name = name;
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public String getName() {
        return name;
    }
}
