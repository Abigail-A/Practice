/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aep.springsetters;

/**
 *
 * @author s303027
 */
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aep.springsetters.Company;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();

		/*
		 * Below line will scan the given package for Components. It will be
		 * refreshed then to get bean from the same.
		 */
		annotationContext.scan("com.aep.springsetters");
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
