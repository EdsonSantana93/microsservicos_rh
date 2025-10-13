package com.edsoncorp.hrworker.model.dto;

public class WorkerDTO {
	private String name;
	private Double dailyIncome;

	public WorkerDTO() {
	}

	public WorkerDTO(String name, Double dailyIncome) {
		this.name = name;
		this.dailyIncome = dailyIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

}
