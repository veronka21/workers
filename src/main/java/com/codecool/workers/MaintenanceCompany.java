package com.codecool.workers;

import com.codecool.workers.workers.Electrician;
import com.codecool.workers.workers.Plumber;
import com.codecool.workers.workers.Worker;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MaintenanceCompany {

	private Set<Worker> workers = new HashSet<Worker>();

	/**
	 * 
	 * @param month
	 */
	public double countProfit(int month) {
		double profit = 0;
		for (int i = 0; i < month; i++) {
			for (Worker worker: workers) {
				profit += worker.calculateMonthlyProfitOfWorker();
				if (worker instanceof Plumber || worker instanceof Electrician) {
					profit -= worker.getLevelOfExperience().getToolExpanse();
				}
			}
		}
		return profit;
	}

	/**
	 * 
	 * @param worker
	 */
	public void hireWorker(Worker worker) {
		workers.add(worker);
	}

}