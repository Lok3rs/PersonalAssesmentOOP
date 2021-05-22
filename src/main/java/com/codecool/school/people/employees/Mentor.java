package com.codecool.school.people.employees;

import com.codecool.school.people.enums.Language;
import com.codecool.school.people.enums.Module;

import java.util.List;

public class Mentor extends BaseEmployee {

    private final List<Language> languagesKnown;
    private Module currentModuleTeaching;

    public Mentor(String name, int phoneNumber, int birthDate, int salary, List<Language> languagesKnown) {
        super(name, phoneNumber, birthDate, salary);
        this.languagesKnown = languagesKnown;
    }

    public void addKnownLanguage(Language language){
        this.languagesKnown.add(language);
    }

    public void assignToModule(Module module){
        if (languagesKnown.stream().anyMatch(language -> language == module.getRequiredLanguage())){
            currentModuleTeaching = module;
        } else {
            throw new UnsupportedOperationException("This mentor cannot be assigned to that module, he doesn't know required language");
        }
    }

    public Module getCurrentModuleTeaching(){
        return this.currentModuleTeaching;
    }

    public List<Language> getLanguagesKnown() {
        return languagesKnown;
    }


}
