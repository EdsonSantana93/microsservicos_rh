package com.edsoncorp.hr_payroll.service;

import org.springframework.stereotype.Service;

import com.edsoncorp.hr_payroll.model.entities.Payment;

@Service
public class PaymentServiceImpl implements IPayment {

	@Override
	public Payment getPayment(Long workerId, Integer days) {
		Payment payment = new Payment("Bob", 200.0, days);
		return payment;
	}

}
