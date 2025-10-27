package com.varanasi.demo11.ServiceLayerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.varanasi.demo11.Exception.OwnerNotFoundException;
import com.varanasi.demo11.RepositoryLayer.RepositoryLayer;
import com.varanasi.demo11.ServiceLayer.ServiceLayer;

@Scope("singleton")
@Service
public class ServiceLayerImpl implements ServiceLayer {
	@Autowired
	private RepositoryLayer rep;
	@Value("5600")
	private int Ownerid;

	public ServiceLayerImpl() {
		System.out.println("ServiceLayerImpl Bean is created...");
	}

	@Override
	public String findOwnerId() throws OwnerNotFoundException {
		return rep.findOwnerId(Ownerid);
	}

	@Override
	public void updateOwnerId(int id) {
		this.Ownerid = id;

	}

}
