package com.codecool.school.people.factories;

import com.codecool.school.people.students.Student;

public class StudentsFactory {

    private static StudentsFactory instance = null;

    private StudentsFactory(){}

    public static StudentsFactory getInstance(){
        if (instance == null){
            instance = new StudentsFactory();
        }
        return instance;
    }

    public Student createStudent(String name, int phoneNumber, int birthDate){
        return new Student(name, phoneNumber, birthDate);
    }
}
