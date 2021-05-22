package com.codecool.school.utils;

import com.codecool.school.people.enums.Module;

public class Constants {

    // I assume that there are 4 sessions for each module, that's why progression increases by 25
    public static int PROGRESSION_PER_EACH_SESSION = 25;
    public static int STARTING_PROGRESSION_FOR_EACH_MODULE = 0;
    public static int PROGRESSION_TO_ADVANCE = 100;
    public static Module FIRST_MODULE = Module.ProgrammingBasic;
    public static Module LAST_MODULE = Module.Advanced;

    public static int MINIMUM_BIRTH_DAY_ACCEPTED = 2003;

}
