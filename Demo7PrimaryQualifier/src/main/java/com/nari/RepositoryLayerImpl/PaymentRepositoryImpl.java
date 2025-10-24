package com.nari.RepositoryLayerImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.nari.RepositoryLayer.PaymentRepository;
@Repository
@Primary
public class PaymentRepositoryImpl implements PaymentRepository {

	public PaymentRepositoryImpl() {
		System.out.println("Hi i am from PaymentRepositoryImpl Bean");
	}

	@Override
	public String savePayment(String cardType, double amount) {
		return String.format("Accept payment type of %s and ruppes of %s and \n i am from Primary one", cardType, amount);
	}

}
