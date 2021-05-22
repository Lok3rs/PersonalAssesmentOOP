package com.codecool.school;

import com.codecool.school.people.employees.Mentor;
import com.codecool.school.people.enums.Module;
import com.codecool.school.people.students.Student;
import com.codecool.school.utils.Constants;

import java.util.*;
import java.util.stream.Collectors;

public class School {

    private static School instance = null;
    private static List<Mentor> mentors;
    private static List<Student> students;
    private static List<Student> graduates;

    private School() {
        mentors = new LinkedList<>();
        students = new LinkedList<>();
        graduates = new LinkedList<>();
    }

    public static School getInstance() {
        if (instance == null) {
            instance = new School();
        }
        return instance;
    }

    public List<Student> getStudentsFromGivenModule(Module module) {
        return students.stream()
                .filter(student -> student.getCurrentModule() == module)
                .collect(Collectors.toList());
    }

    public void makeClasses() {
        students.forEach(student -> {
            student.participateInClasses();
            if (student.isGraduated()) {
                graduates.add(student);
                students.remove(student);
            }
        });
    }

    public void hireMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void fireMentor(Mentor mentor) {
        mentors.remove(mentor);
    }

    public void addStudent(Student student) {
        if (isStudentAccepted(student)) students.add(student);
        else {
            throw new IllegalArgumentException("Sorry, we can't teach such a young person here.");
        }
    }

    public void expelStudent(Student student) {
        students.remove(student);
    }

    public void assignMentorToModule(Mentor mentor, Module module) {
        if (!mentors.contains(mentor)) {
            throw new UnsupportedOperationException("You can't assign mentor who is not hired");
        }
        mentor.assignToModule(module);
    }

    private boolean isStudentAccepted(Student student) {
        return student.getBirthDate() < Constants.MINIMUM_BIRTH_DAY_ACCEPTED;
    }

    public static List<Mentor> getMentors() {
        return mentors;
    }

    public static List<Student> getStudents() {
        return students;
    }

    public static List<Student> getGraduates() {
        return graduates;
    }
}
