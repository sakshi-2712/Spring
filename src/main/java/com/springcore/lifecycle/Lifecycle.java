package com.springcore.lifecycle;

public class Lifecycle {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting property");
		this.price = price;
	}

	public Lifecycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Lifecycle [price=" + price + "]";
	}
	public void init()
	{
		System.out.println("Inside Init Method");
	}
	public void destroy()
	{
		System.out.println("Inside Destroy method");
	}
	

}
