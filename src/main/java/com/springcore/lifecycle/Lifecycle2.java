package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Lifecycle2 implements InitializingBean ,DisposableBean {
	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Lifecycle2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Lifecycle2 [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//init
		System.out.println("taking pepsi: init");
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Going to put bottle back to shop");
	}
	

}
