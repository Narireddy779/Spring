package com.Demo10.projectRepositoryImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.Demo10.projectRepository.RepositoryLayer;
@Scope("prototype")
@Repository
public class RepositoryLayerImpl implements RepositoryLayer {
	public RepositoryLayerImpl() {
		System.out.println("RepositoryLayerImpl Bean is created...");
	}

	@Override
	public String acceptAmount(double amount) {
		return String.format("Payment is done via DebitCard and amount is %s", amount);
	}

}
