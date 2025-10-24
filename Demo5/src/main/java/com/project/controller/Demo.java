package com.project.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.Repository.Repository;
import com.project.SpringConf.SpringConfig;
import com.project.service.ServiceLayer;
import com.project.serviceImpl.ServiceLayerImpl;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		ServiceLayer s = context.getBean("serviceLayerImpl", ServiceLayer.class);
		Repository r = context.getBean("repositoryImpl", Repository.class);
		((ServiceLayerImpl)s).setM(20);
		((ServiceLayerImpl)s).setRepository(r);
		
		System.out.println(s.findOwner());
		((AnnotationConfigApplicationContext)context).close();
	}
}
