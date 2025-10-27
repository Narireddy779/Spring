package com.varanasi.demo11;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.varanasi.demo11.ServiceLayer.ServiceLayer;

@SpringBootApplication
public class Demo11Application implements CommandLineRunner {
	@Autowired
	private ServiceLayer service;
	private static final Logger LOGGER = LoggerFactory.getLogger(Demo11Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Demo11Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try (Scanner s = new Scanner(System.in)) {
			LOGGER.info(service.findOwnerId());
			System.out.println("Enter the OwnerId: ");
			int id = s.nextInt();
			service.updateOwnerId(id);
			LOGGER.info("Updated" + service.findOwnerId());
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}

	}

}
