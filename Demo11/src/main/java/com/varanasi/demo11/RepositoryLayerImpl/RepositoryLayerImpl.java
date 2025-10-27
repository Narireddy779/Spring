package com.varanasi.demo11.RepositoryLayerImpl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.varanasi.demo11.Exception.OwnerNotFoundException;
import com.varanasi.demo11.RepositoryLayer.RepositoryLayer;
@Scope("singleton")
@Repository
public class RepositoryLayerImpl implements RepositoryLayer{
	static final String OWNER_NOT_FOUND = "OwnerId not found";
	public RepositoryLayerImpl() {
		System.out.println("RepositoryLayerImpl Bean is created...");
	}

	@Override
	public String findOwnerId(int id) throws OwnerNotFoundException {
		if(id %2==0) {
			return String.format("OwnerId is : %s", id);
		}else {
			throw new OwnerNotFoundException(OWNER_NOT_FOUND + "= " + id);
		}
	}

}
