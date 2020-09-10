package com.codecool.workers;

import java.util.Random;

public class Util {
	private static Random RANDOM = new Random();

	/**
	 * 
	 * @param percentChanceOfEvent
	 */
	public static boolean isEventHappening(int percentChanceOfEvent) {

		return RANDOM.nextInt(100) < percentChanceOfEvent;
	}
}