package com.nari.ServiceLayerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.nari.RepositoryLayer.PaymentRepository;
import com.nari.ServiceLayer.PaymentService;

@Service("creditcard")
public class PaymentServiceImpl2 implements PaymentService {
	private PaymentRepository payment;
	private double amount1;

	@Autowired
	PaymentServiceImpl2(@Qualifier("specialcase") PaymentRepository payment, @Value("80000") double amount) {
		this.payment = payment;
		this.amount1 = amount;
		System.out.println("Hi i am Bean from Credit card class");
	}

	@Override
	public String processPayment() {

		return payment.savePayment("Credit Card", amount1);
	}

}
