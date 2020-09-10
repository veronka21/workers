package com.codecool.workers.workers;

import com.codecool.workers.Experience;

public class GasFitter extends Worker {
    public GasFitter(String name, double dailyFee, Experience levelOfExperience) {
        super(name, dailyFee, levelOfExperience);
        maxWorkday = 23;
        percentChanceOfGettingAJob = 65;
    }
}