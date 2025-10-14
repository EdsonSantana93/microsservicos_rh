package com.edsoncorp.hrworker.service;

import java.util.List;

import com.edsoncorp.hrworker.model.dto.WorkerResponseDTO;

public interface IWorkerService {
	public List<WorkerResponseDTO> findAll();
	
	public WorkerResponseDTO findById(Long id);
}
