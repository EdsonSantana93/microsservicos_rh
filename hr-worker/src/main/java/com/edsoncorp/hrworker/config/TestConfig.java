package com.edsoncorp.hrworker.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.edsoncorp.hrworker.model.entities.Worker;
import com.edsoncorp.hrworker.repository.WorkerRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private WorkerRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Worker worker1 = new Worker(null, "Bob", 200.0);
		Worker worker2 = new Worker(null, "Maria", 300.0);
		Worker worker3 = new Worker(null, "Alex", 250.0);

		repository.saveAll(Arrays.asList(worker1, worker2, worker3));

	}

}
