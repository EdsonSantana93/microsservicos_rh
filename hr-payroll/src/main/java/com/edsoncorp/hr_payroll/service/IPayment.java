package com.edsoncorp.hr_payroll.service;

import com.edsoncorp.hr_payroll.model.entities.Payment;

public interface IPayment {
	Payment getPayment(Long workerId, Integer days);
}
