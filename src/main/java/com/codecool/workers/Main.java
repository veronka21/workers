package com.codecool.workers;

import com.codecool.workers.workers.Electrician;
import com.codecool.workers.workers.GasFitter;
import com.codecool.workers.workers.Plumber;

public class Main {
    public static void main(String[] args) {
        Plumber jani = new Plumber("Jani", 500000, Experience.EXPERT);
        Electrician geza = new Electrician("Géza", 400000, Experience.MEDIUM);
        GasFitter lolo = new GasFitter("Lölö", 300000, Experience.BEGINNER);
        MaintenanceCompany Strabag = new MaintenanceCompany();
        Strabag.hireWorker(jani);
        Strabag.hireWorker(geza);
        Strabag.hireWorker(lolo);
        System.out.println(Strabag.countProfit(3));
    }
}
