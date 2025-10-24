package com.project.RepositoryImpl;

import org.springframework.stereotype.Component;

import com.project.Repository.Repository;
@Component
public class RepositoryImpl implements Repository {
	
	public RepositoryImpl() {
		System.out.println("I am form RepositoryImpl Bean");
	}

	@Override
	public String findOwner(int n) {
		return String.format("Hi am From RepositoryImpl Bean %s", n);

	}

}
