package com.nari.ControllerLayer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nari.ServiceLayer.PaymentService;

@Configuration
@ComponentScan("com.nari")
public class PaymentControllerClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PaymentControllerClass.class);
		PaymentService ps = context.getBean("creditcard", PaymentService.class);
		System.out.println(ps.processPayment());
		((AnnotationConfigApplicationContext)context).close();
	}
}
