package com.springcore.ref;

public class ref {
	private int x;
	private ref1 ob;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public ref1 getOb() {
		return ob;
	}
	public void setOb(ref1 ob) {
		this.ob = ob;
	}
	public ref() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ref [x=" + x + ", ob=" + ob + "]";
	}


}
