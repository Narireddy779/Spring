package com.varanasi.ControllerLayer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varanasi.ServiceLayer.ServiceLayer;
import com.varanasi.SpringConf.SpringConf;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext Context = new AnnotationConfigApplicationContext(SpringConf.class);
		ServiceLayer s = Context.getBean("serviceLayerImpl", ServiceLayer.class);
		System.out.println(s.fetchDetails());
		((AnnotationConfigApplicationContext)Context).close();
	}
}
