package com.project.serviceImpl;

import org.springframework.stereotype.Service;

import com.project.Repository.Repository;
import com.project.service.ServiceLayer;
@Service
public class ServiceLayerImpl implements ServiceLayer {
	private Repository repository;
	private int m;

	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	public void setM(int m) {
		this.m = m;
	}

	public ServiceLayerImpl() {
		System.out.println("Hi i am deafult constructor ServiceLayerImpl Bean");
	}

	public ServiceLayerImpl(Repository repository, int m) {
		this.m = m;
		this.repository = repository;
		System.out.println("Hi i am ServiceLayerImpl Bean");
	}

	@Override
	public String findOwner() {
		return repository.findOwner(m);
	}

}
