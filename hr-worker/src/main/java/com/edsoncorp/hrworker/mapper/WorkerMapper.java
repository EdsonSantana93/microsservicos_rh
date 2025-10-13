package com.edsoncorp.hrworker.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.edsoncorp.hrworker.model.dto.WorkerResponseDTO;
import com.edsoncorp.hrworker.model.entities.Worker;

@Mapper(componentModel = "spring")
public interface WorkerMapper {
	WorkerMapper INSTANCE = Mappers.getMapper(WorkerMapper.class);
	
	List<WorkerResponseDTO> toListWorkerResponseDTO(List<Worker> all);
	
	WorkerResponseDTO toWorkerDTO(Worker worker);
}
