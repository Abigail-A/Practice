package com.aep.springconstructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aep.springconstructor.Address;
import com.aep.springconstructor.Company;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();

		/*
		 * Below line will scan the given package for Components. It will be
		 * refreshed then to get bean from the same.
		 */
		annotationContext.scan("com.aep.springconstructor");
		annotationContext.refresh();

		/*
		 * Here Class name is used to get the object of Address class
		 */
		Address address = annotationContext.getBean(Address.class);

		/*
		 * Here ID name is used to get the Object of Company Class
		 */
		Company company = (Company) annotationContext.getBean("company1");

		System.out.println("Address Object :::::" + address.toString());

		System.out.println("Company Object :::::" + company.toString());

	}

}
