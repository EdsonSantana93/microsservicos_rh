package com.edsoncorp.hrworker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edsoncorp.hrworker.mapper.WorkerMapper;
import com.edsoncorp.hrworker.model.dto.WorkerResponseDTO;
import com.edsoncorp.hrworker.model.entities.Worker;
import com.edsoncorp.hrworker.repository.WorkerRepository;

@Service
public class WorkerServiceImpl implements IWorkerService{
	
	@Autowired
	private WorkerRepository repository;
	
	private final WorkerMapper workerMapper = WorkerMapper.INSTANCE;
	
	@Override
	public List<WorkerResponseDTO> findAll() {
		List<Worker> workers = repository.findAll();
		return workerMapper.toListWorkerResponseDTO(workers);
	}

	@Override
	public WorkerResponseDTO findById(Long id) {
		Worker worker = repository.findById(id).get();
		return workerMapper.toWorkerDTO(worker);
	}
	
}
