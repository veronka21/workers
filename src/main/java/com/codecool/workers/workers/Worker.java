package com.codecool.workers.workers;

import com.codecool.workers.Experience;
import com.codecool.workers.Util;

public abstract class Worker {

	protected String name;
	protected double dailyFee;
	protected Experience levelOfExperience;
	protected int percentChanceOfGettingAJob;
	protected int maxWorkday;

	public Worker(String name, double dailyFee, Experience levelOfExperience) {
		this.name = name;
		this.dailyFee = dailyFee;
		this.levelOfExperience = levelOfExperience;
	}

	public Experience getLevelOfExperience() {
		return levelOfExperience;
	}

	public boolean getAJob() {
		return Util.isEventHappening(percentChanceOfGettingAJob);
	}

	private int countWorkdaysPerMonth() {
		int counter = 0;
		for (int i = 0; i < maxWorkday; i++) {
			if (getAJob()) counter++;
		}
		return counter;
	}

	public double calculateMonthlyProfitOfWorker() {
		int workdaysPerMonth = countWorkdaysPerMonth();
		return levelOfExperience.getPercentage() * dailyFee * workdaysPerMonth;
	}

}