package com.edsoncorp.hrworker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edsoncorp.hrworker.entities.Worker;
import com.edsoncorp.hrworker.repository.WorkerRepository;

@Service
public class WorkerServiceImpl implements IWorkerService{
	
	@Autowired
	private WorkerRepository repository;
	
	@Override
	public List<Worker> findAll() {
		List<Worker> workers = repository.findAll();
		return workers;
	}

	@Override
	public Worker findById(Long id) {
		Worker worker = repository.findById(id).get();
		return worker;
	}
	
}
