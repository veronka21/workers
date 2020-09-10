package com.codecool.workers.workers;

import com.codecool.workers.Experience;

public class Plumber extends Worker {

    private static final int MAX_WORKDAY = 23;
    public static final int PERCENT_CHANCE_OF_GETTING_A_JOB = 80;

    public Plumber(String name, double dailyFee, Experience levelOfExperience) {
        super(name, dailyFee, levelOfExperience);
        maxWorkday = MAX_WORKDAY;
        percentChanceOfGettingAJob = PERCENT_CHANCE_OF_GETTING_A_JOB;
    }
}