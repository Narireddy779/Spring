package com.varanasi.demo11.ServiceLayer;

import com.varanasi.demo11.Exception.OwnerNotFoundException;

public interface ServiceLayer {
	String findOwnerId() throws OwnerNotFoundException;
	void updateOwnerId(int id);
}
