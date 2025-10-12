package com.edsoncorp.hrworker.service;

import java.util.List;

import com.edsoncorp.hrworker.entities.Worker;

public interface IWorkerService {
	public List<Worker> findAll();
	
	public Worker findById(Long id);
}
