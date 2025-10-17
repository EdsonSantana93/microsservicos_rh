package com.edsoncorp.hr_payroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edsoncorp.hr_payroll.feignclients.WorkerFeignCliente;
import com.edsoncorp.hr_payroll.model.entities.Payment;
import com.edsoncorp.hr_payroll.model.entities.Worker;

@Service
public class PaymentServiceImpl implements IPayment {
	
	@Autowired
	private WorkerFeignCliente workerFeignCliente;
	
	
	@Override
	public Payment getPayment(Long workerId, Integer days) {
		Worker worker = workerFeignCliente.findById(workerId).getBody();
		Payment payment = new Payment(worker.getName(), worker.getDailyIncome(), days);
		return payment;
	}

}
