package com.codecool.workers.workers;

import com.codecool.workers.Experience;

public class Electrician extends Worker {

    public static final int MAX_WORKDAY = 30;
    public static final int PERCENT_CHANCE_OF_GETTING_A_JOB = 90;

    public Electrician(String name, double dailyFee, Experience levelOfExperience) {
        super(name, dailyFee, levelOfExperience);
        maxWorkday = MAX_WORKDAY;
        percentChanceOfGettingAJob = PERCENT_CHANCE_OF_GETTING_A_JOB;
    }
}