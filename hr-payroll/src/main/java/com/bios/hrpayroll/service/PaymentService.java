package com.bios.hrpayroll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bios.hrpayroll.entities.Payment;
import com.bios.hrpayroll.entities.Worker;
import com.bios.hrpayroll.feingclients.WorkerFeingClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeingClient workerFeingClient;

	public Payment getPayment(long workerId, int days) {
		Worker worker = workerFeingClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
