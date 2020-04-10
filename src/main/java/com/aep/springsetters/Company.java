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
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.beans.factory.annotation.Value; 
import org.springframework.stereotype.Component; 
 
/* 
8. *  This Annotation enable to scan this class 
9. *  Value will decide the ID of create bean. This ID can be used to get the bean of this class 
10. */ 
@Component(value = "company1") 
public class Company {  
	@Autowired 	
        @Value("VGautam") 
	String companyCEO; 
	@Autowired(required = true) 
	// @Qualifier("Address") 
	Address companyAddress; 
 
	public String getCompanyCEO() { 
		return companyCEO; 
	} 
 
	public void setCompanyCEO(String companyCEO) { 
		this.companyCEO = companyCEO; 
	} 

	public Address getCompanyAddress() { 
		return companyAddress; 
	} 

	public void setCompanyAddress(Address companyAddress) { 
		this.companyAddress = companyAddress; 
	} 
	@Override 
	public String toString() { 
		return "Company [companyCEO=" + companyCEO + ", companyAddress=" 
				+ companyAddress + "]"; 
	} 
 
} 

