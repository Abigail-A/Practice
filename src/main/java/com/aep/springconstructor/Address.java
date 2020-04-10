package com.aep.springconstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Autowired
	public Address(@Value("Flat No") String flatNo,@Value("2B") String bldgNo, @Value("Street No") String streetNo,
			@Value("City") String city,@Value("123456") int pincode) {
		super();
		this.flatNo = flatNo;
		this.bldgNo = bldgNo;
		this.streetNo = streetNo;
		this.city = city;
		this.pincode = pincode;
	}

	public String flatNo;

	public String bldgNo;

	public String streetNo;

	public String city;

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
	 * No-Argument Constructor or No-Argument Static factory method is required
	 * to make setter injection work. In case none of them exist(No arg
	 * Constructor/Static method) "No default constructor found;" error will be
	 * thrown
	 */
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