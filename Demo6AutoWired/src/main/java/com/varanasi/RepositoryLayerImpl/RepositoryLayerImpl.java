package com.varanasi.RepositoryLayerImpl;

import org.springframework.stereotype.Repository;

import com.varanasi.RepositoryLayer.RepositoryLayer;
@Repository
public class RepositoryLayerImpl implements RepositoryLayer{
	
	public RepositoryLayerImpl() {
		System.out.println("Hi i am Bean from RepositoryLayerImpl!...");
	}

	@Override
	public String fetchDetails(int n) {
		return String.format("Hi am fetchDetails method from RepositoryLayerImpl %s", n);
	}

}
