package com.codecool.school.people.students;

import com.codecool.school.people.Person;
import com.codecool.school.people.enums.Module;
import com.codecool.school.utils.Constants;

public class Student extends Person {

    private Module currentModule;
    private int progressionOfModule;
    private boolean graduated;


    public Student(String name, int phoneNumber, int birthDate) {
        super(name, phoneNumber, birthDate);
        this.currentModule = Constants.FIRST_MODULE;
        this.progressionOfModule = Constants.STARTING_PROGRESSION_FOR_EACH_MODULE;
        this.graduated = false;
    }

    public void participateInClasses(){
        this.progressionOfModule += Constants.PROGRESSION_PER_EACH_SESSION;
        // chained conditions should be declared as some variable
        if (this.progressionOfModule == Constants.PROGRESSION_TO_ADVANCE && this.currentModule != Constants.LAST_MODULE){
            this.currentModule = currentModule.getNextModule();
            this.progressionOfModule = Constants.STARTING_PROGRESSION_FOR_EACH_MODULE;
        } else if (this.progressionOfModule == Constants.PROGRESSION_TO_ADVANCE){
            this.graduated = true;
        }
    }


    public Module getCurrentModule() {
        return currentModule;
    }


    public boolean isGraduated() {
        return graduated;
    }

}
