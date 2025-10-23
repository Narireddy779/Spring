package om.varanasi.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import om.varanasi.Config.SpringConfig;
import om.varanasi.service.Owner;
import om.varanasi.serviceImplReal.OwnerServiceImpl;

public class Demo {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Owner o = context.getBean("OwnerService", OwnerServiceImpl.class);
		System.out.println(o.addData());
		((AnnotationConfigApplicationContext) context).close();
	}
}
