package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.Service.service;

// @Configuration + @ComponentScan("com.project")
@SpringBootApplication(scanBasePackages = "com.project")
public class Demo implements CommandLineRunner {
	@Autowired
	private service s;

	public static void main(String[] args) {
		SpringApplication.run(Demo.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(s.paymentProcess());
	}

}
