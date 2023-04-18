package com.springcore.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public A(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "A [address=" + address + "]";
	}
	

}
