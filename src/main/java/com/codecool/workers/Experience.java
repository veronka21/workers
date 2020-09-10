package com.codecool.workers;

public enum Experience {
	BEGINNER(0.4, 50000),
	MEDIUM(0.3, 35000),
	EXPERT(0.2, 25000);

	private double percentage;
	private double toolExpanse;

	Experience(double percentage, double toolExpanse) {
		this.percentage = percentage;
		this.toolExpanse = toolExpanse;
	}

	public double getPercentage() {
		return percentage;
	}

	public double getToolExpanse() {
		return toolExpanse;
	}
}