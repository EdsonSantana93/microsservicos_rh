package com.edsoncorp.hr_payroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edsoncorp.hr_payroll.model.entities.Payment;
import com.edsoncorp.hr_payroll.service.IPayment;

@RestController
@RequestMapping("/payments")
public class PaymentController {
	
	@Autowired
	private IPayment service;
	
	@GetMapping("/{workerId}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @RequestParam("days") Integer days) {
		Payment payment = service.getPayment(workerId, days);
		return ResponseEntity.ok(payment);
	}
}
