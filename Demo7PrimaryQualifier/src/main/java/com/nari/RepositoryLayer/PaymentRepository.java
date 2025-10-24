package com.nari.RepositoryLayer;

public interface PaymentRepository {
	 String savePayment(String cardType, double amount);
}
