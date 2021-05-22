package com.codecool;

import com.codecool.school.School;
import com.codecool.school.people.employees.Mentor;
import com.codecool.school.people.enums.Language;
import com.codecool.school.people.enums.Module;
import com.codecool.school.people.factories.MentorFactory;
import com.codecool.school.people.factories.SalesPeopleFactory;
import com.codecool.school.people.factories.StudentsFactory;

import java.util.Arrays;
import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
        School school = School.getInstance();
        MentorFactory mentorFactory = MentorFactory.getInstance();
        StudentsFactory studentsFactory = StudentsFactory.getInstance();
        SalesPeopleFactory salesPeopleFactory = SalesPeopleFactory.getInstance();

        school.addStudent(
                studentsFactory.createStudent("John", 76255626, 1998)
        );
        school.addStudent(
                studentsFactory.createStudent("Tom", 133322, 1992)
        );
//        school.addStudent(
//                studentsFactory.createStudent("Kate", 76255626, 2008)
//        );

        Mentor Lukasz = mentorFactory.createMentor("Lukasz", 781271827, 1990, 15000, Arrays.asList(Language.JavaEE, Language.JavaSE));

        school.hireMentor(Lukasz);

        school.assignMentorToModule(Lukasz, Module.Advanced);
//        school.assignMentorToModule(Lukasz, Modules.Web);

        IntStream.range(0, 5).forEach(i -> school.makeClasses());

        System.out.println(school.getStudentsFromGivenModule(Module.Web));
    }
}
