package com.codecool.school.people.employees;

import com.codecool.school.people.Person;

public abstract class BaseEmployee extends Person implements Employee {

    protected int salary;

    public BaseEmployee(String name, int phoneNumber, int birthDate, int salary) {
        super(name, phoneNumber, birthDate);
        this.salary = salary;
    }


    @Override
    public int getSalary() {
        return this.salary;
    }
}
