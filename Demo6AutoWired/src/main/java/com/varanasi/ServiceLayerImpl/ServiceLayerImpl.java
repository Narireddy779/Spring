package com.varanasi.ServiceLayerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.varanasi.RepositoryLayer.RepositoryLayer;
import com.varanasi.ServiceLayer.ServiceLayer;

@Service
public class ServiceLayerImpl implements ServiceLayer {
	/*
	 * Property-based Autowired
	 * 
	 * @Autowired private RepositoryLayer repositoryLayer;
	 * 
	 * @Value("30") private int n;
	 */
	private RepositoryLayer repositoryLayer;
	private int n;

	public ServiceLayerImpl() {
		System.out.println("Hi i am ServiceLayerImpl Bean..");
	}
	/*
	 * Constructor-based Autowired
	@Autowired
	public ServiceLayerImpl(RepositoryLayer repositoryLayer, @Value("50") int n) {
		this.n = n;
		this.repositoryLayer = repositoryLayer;
		System.out.println("Hi i am Constructor-based Autowired from ServiceLayerImpl Bean..");
	}
	*/
	/*
	 * Setter-Based Autowired
	 * 
	 * @Autowired public void setRepositoryLayer(RepositoryLayer repositoryLayer) {
	 * this.repositoryLayer = repositoryLayer; }
	 * 
	 * @Value("20") public void setN(int n) { this.n = n; }
	 */

	@Override
	public String fetchDetails() {

		return repositoryLayer.fetchDetails(n);
	}

}
