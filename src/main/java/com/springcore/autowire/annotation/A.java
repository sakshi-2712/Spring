package com.springcore.autowire.annotation;

public class A {
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
