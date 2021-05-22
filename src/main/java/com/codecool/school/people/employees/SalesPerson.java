package com.codecool.school.people.employees;

import com.codecool.school.people.students.Student;

import java.util.LinkedList;
import java.util.List;

public class SalesPerson extends BaseEmployee {

    private final List<Student> graduates;

    public SalesPerson(String name, int phoneNumber, int birthDate, int salary) {
        super(name, phoneNumber, birthDate, salary);
        this.graduates = new LinkedList<>();
    }

    public void addGraduated(Student student){
        if (student.isGraduated()) {
            graduates.add(student);
        } else {
            throw new UnsupportedOperationException("This student didn't graduate yet!");
        }
    }

    public List<Student> getGraduates() {
        return graduates;
    }
}
