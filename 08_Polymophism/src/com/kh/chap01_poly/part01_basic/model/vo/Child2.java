package com.kh.chap01_poly.part01_basic.model.vo;

public class Child2 extends Parent{

	private int n;
	
	public Child2() {}
	
	public Child2(int x, int y, int n) {
		super(x,y);
		this.n = n;
	}
	
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public void printChild2() {
		System.out.println("나 둘째 자식이야");
		
	}
	
	@Override
	public void print() {
		System.out.println("나 첫재 자식이야");
	}
	
	
	
	
}
