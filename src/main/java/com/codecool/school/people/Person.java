package com.codecool.school.people;

public abstract class Person {

    protected final String name;
    protected final int phoneNumber;
    protected final int birthDate;

    public Person(String name, int phoneNumber, int birthDate){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getBirthDate() {
        return birthDate;
    }
}
