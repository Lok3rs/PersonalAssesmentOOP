package com.codecool.school.people.factories;

import com.codecool.school.people.employees.Mentor;
import com.codecool.school.people.enums.Language;

import java.util.List;

public class MentorFactory {

    private static MentorFactory instance = null;

    private MentorFactory(){}

    public static MentorFactory getInstance(){
        if (instance == null){
            instance = new MentorFactory();
        }
        return instance;
    }

    public Mentor createMentor(String name, int phoneNumber, int birthDate, int salary, List<Language> languagesKnown){
        return new Mentor(name, phoneNumber, birthDate, salary, languagesKnown);
    }
}
