package com.codecool.school.people.enums;

public enum Module {

    ProgrammingBasic(Language.Python), Web(Language.WebLanguages), OOP(Language.JavaSE), Advanced(Language.JavaEE);

    private final Language language;

    Module(Language language) {
        this.language = language;
    }

    public Language getRequiredLanguage() {
        return this.language;
    }

    public Module getNextModule(){
        int index = this.ordinal();
        int nextIndex = index + 1;
        Module[] modules = Module.values();
        nextIndex %= modules.length;
        return modules[nextIndex];
    }

}
