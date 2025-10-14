package com.edsoncorp.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edsoncorp.hrworker.model.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
