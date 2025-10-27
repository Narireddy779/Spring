package com.varanasi.demo11.RepositoryLayer;

import com.varanasi.demo11.Exception.OwnerNotFoundException;

public interface RepositoryLayer {
	String findOwnerId(int id) throws OwnerNotFoundException;
}
