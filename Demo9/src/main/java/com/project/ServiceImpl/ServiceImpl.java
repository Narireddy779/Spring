package com.project.ServiceImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.project.Repository.RepositoryLayer;
import com.project.Service.service;
@Service
public class ServiceImpl implements service {
	private RepositoryLayer rep;
	private double amount;
	
	public ServiceImpl(RepositoryLayer rep, @Value("300.56") double amount) {
		this.amount = amount;
		this.rep = rep;
		System.out.println("ServiceImpl Bean is created");
	}

	@Override
	public String paymentProcess() {
		return rep.acceptPayment(amount);
	}

}
