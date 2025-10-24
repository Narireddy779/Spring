package com.nari.ServiceLayerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nari.RepositoryLayer.PaymentRepository;
import com.nari.ServiceLayer.PaymentService;

@Service("debitcard")
public class PaymentServiceImpl implements PaymentService {
	private PaymentRepository payment;
	private double amount;

	@Autowired
	PaymentServiceImpl(PaymentRepository payment, @Value("5000") double amount) {
		this.payment = payment;
		this.amount = amount;
		System.out.println("Hi i am Bean from Debit card class");
	}

	@Override
	public String processPayment() {

		return payment.savePayment("Debit Card", amount);
	}

}
