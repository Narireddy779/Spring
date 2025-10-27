package com.project.RepositoryImpl;

import org.springframework.stereotype.Repository;

import com.project.Repository.RepositoryLayer;
@Repository
public class RepositoryImpl implements RepositoryLayer {

	public RepositoryImpl() {
		System.out.println("RepositoryImpl Bean is created.");
	}

	@Override
	public String acceptPayment(double amount) {

		return String.format("payment is done via debitcard and amount recived is %s", amount);
	}

}
