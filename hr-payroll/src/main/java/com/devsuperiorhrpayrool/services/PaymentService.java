package com.devsuperiorhrpayrool.services;

import org.springframework.stereotype.Service;

import com.devsuperiorhrpayrool.entities.Payment;

@Service
public class PaymentService  {
	
	
	public  Payment getPayment(long workerId, int days) {
		
		return new Payment("Bon", 1.0, days);
		
	}
	

}
