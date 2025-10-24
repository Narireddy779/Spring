package com.nari.RepositoryLayerImpl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.nari.RepositoryLayer.PaymentRepository;

@Repository
@Qualifier("specialcase")
public class PaymentRepositoryImpl2 implements PaymentRepository {

	public PaymentRepositoryImpl2() {
		System.out.println("Hi i am from PaymentRepositoryImpl2 Bean");
	}

	@Override
	public String savePayment(String cardType, double amount) {
		return String.format("Accept payment type of %s and ruppes of %s \n i am from special one", cardType, amount);
	}

}
