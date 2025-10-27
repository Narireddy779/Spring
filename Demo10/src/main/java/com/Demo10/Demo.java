package com.Demo10;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Demo10.project.ServiceLayer;

@SpringBootApplication
public class Demo implements CommandLineRunner {
	@Autowired
	private ServiceLayer service;
	@Autowired
	private ServiceLayer service1;

	public static void main(String[] args) {
		SpringApplication.run(Demo.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Before modifying the Amount..");
			System.out.println("Service Method: " + service.paymentProcess());
			System.out.println("Service Method1: " + service1.paymentProcess());
			System.out.println("Enter the user amount: ");
			double inputAmount = s.nextDouble();
			System.out.println("After modifying the Amount...");
			service.setAmount(inputAmount);
			System.out.println("Service Method: " + service.paymentProcess());
			System.out.println("Service Method1: " + service1.paymentProcess());
		}
	}
}
