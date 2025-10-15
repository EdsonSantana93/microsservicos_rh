package com.edsoncorp.hr_payroll.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.edsoncorp.hr_payroll.model.entities.Payment;
import com.edsoncorp.hr_payroll.model.entities.Worker;

@Service
public class PaymentServiceImpl implements IPayment {
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Payment getPayment(Long workerId, Integer days) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", String.valueOf(workerId));
		String uri = workerHost.concat("/workers/{id}");
		
		Worker worker = restTemplate.getForObject(uri, Worker.class, uriVariables);
		Payment payment = new Payment(worker.getName(), worker.getDailyIncome(), days);
		return payment;
	}

}
