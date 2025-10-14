package com.edsoncorp.hrworker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edsoncorp.hrworker.model.dto.WorkerResponseDTO;
import com.edsoncorp.hrworker.service.IWorkerService;

@RestController()
@RequestMapping(value = "/workers")
public class WorkerController {
	@Autowired
	private IWorkerService service;
	
	
	@GetMapping()
	public ResponseEntity<List<WorkerResponseDTO>> findAll(){
		List<WorkerResponseDTO> response = service.findAll();
		return ResponseEntity.ok().body(response);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<WorkerResponseDTO> findById(@PathVariable Long id) {
		WorkerResponseDTO response = service.findById(id);
		return ResponseEntity.ok().body(response);
	}
}
