package com.Demo10.projectServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.Demo10.project.ServiceLayer;
import com.Demo10.projectRepository.RepositoryLayer;
@Scope("singleton")
@Service
public class ServiceLayerImpl implements ServiceLayer {
	@Autowired
	private RepositoryLayer rep;
	@Value("2500.369")
	private double amount;

	public ServiceLayerImpl() {
		System.out.println("I am ServiceLayerImpl Bean..");
	}

	@Override
	public String paymentProcess() {
		return rep.acceptAmount(amount);
	}

	@Override
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
