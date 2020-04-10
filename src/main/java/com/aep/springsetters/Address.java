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
 
@Component 
public class Address { 
 
	@Autowired(required=true) 
        @Value("201") 
	public String flatNo; 
 
	@Autowired(required=true) 
	@Value("2") 
	public String bldgNo; 
 
	@Autowired 
	@Value("Street No") 
	public String streetNo; 
 
	@Autowired 
	@Value("Mumbai") 
	public String city;  
	@Autowired 
	@Value("123456") 
	public int pincode; 
 
	public String getStreetNo() { 
		return streetNo; 
	} 
 
	public void setStreetNo(String streetNo) { 
		System.out.println("Setter method is called"); 
		this.streetNo = streetNo; 
	} 
 
	public String getFlatNo() { 
		return flatNo; 
	} 
 
	public void setFlatNo(String flatNo) { 
		this.flatNo = flatNo; 
	} 
 
	public String getBldgNo() { 
		return bldgNo; 
	} 
 
	public void setBldgNo(String bldgNo) { 
		this.bldgNo = bldgNo; 
	} 
 
	public String getCity() { 
		return city; 
	} 
 
	public void setCity(String city) { 
		this.city = city; 
	} 
 
	public int getPincode() { 
		return pincode; 
	} 
 
	public void setPincode(int pincode) { 
		this.pincode = pincode; 
	} 
 
	/* 
72.	 * No-Argument Constructor or No-Argument Static factory method is required 
73.	 * to make setter injection work. In case none of them exist(No arg 
74.	 * Constructor/Static method) "No default constructor found;" error will be 
75.	 * thrown 
76.	 */ 
	private Address() { 
		super(); 
		System.out.println("Invoking No Arg Constructor"); 
	} 
 
	@Override 
	public String toString() { 
		return "Address [flatNo=" + flatNo + ", bldgNo=" + bldgNo 
				+ ", streetNo=" + streetNo + ", city=" + city + ", pincode=" 
				+ pincode + "]"; 
	} 
 
} 

