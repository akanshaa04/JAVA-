package com.user;

import java.util.List;
import java.util.Random;

public class Customer {

	Random ran = new Random();
	private double UIN;
	private String customerName;
	private String address;
    private List<Book> borrowed;
    
	public Customer(double uIN, String customerName, String address, List<Book> borrowed) {
		super();
		UIN = uIN;
		this.customerName = customerName;
		this.address = address;
		this.borrowed = borrowed;
	}

	public double getUIN() {
		return UIN;
	}

	public void setUIN() {
		UIN = Math.random();
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
