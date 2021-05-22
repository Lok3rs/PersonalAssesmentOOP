package com.codecool.school.people.factories;

import com.codecool.school.people.employees.SalesPerson;

public class SalesPeopleFactory {

    private static SalesPeopleFactory instance = null;

    private SalesPeopleFactory(){

    }

    public static SalesPeopleFactory getInstance(){
        if (instance == null){
            instance = new SalesPeopleFactory();
        }
        return instance;
    }

    public SalesPerson createSalesPerson(String name, int phoneNumber, int birthDate, int salary){
        return new SalesPerson(name, phoneNumber, birthDate, salary);
    }
}
