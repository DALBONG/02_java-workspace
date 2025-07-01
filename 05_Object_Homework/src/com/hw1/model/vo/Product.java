package com.hw1.model.vo;


public class Product {

	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	//기본 생성자
	public Product() {
	}
	//매개 변수 생성자
	public Product(String productId, int price, double tax) {
		this.productId = productId;
		this.price = price;
		this.tax = tax;
	}
	
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public String information() {
		return "productId:"+productId + " ,productName:"+productName+ " ,productArea:"+productArea+ ", pirce:"+price+ " , tax:"+tax; 
	}
	
	
	
	
	
	
	
}
