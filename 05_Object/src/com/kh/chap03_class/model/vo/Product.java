package com.kh.chap03_class.model.vo;

public class Product {
	
	/*
	 필드(field)
	 필드 : 멤버변수 : 인스턴스 변수.
	 
	 [표현법]
	 접근제한자 자료형 변수명;
	*/
	
	private String pName;
	private int price;
	private String brand; 
	
	/*
	 생성자 
	 - 객체를 생성하기 위한 일종의 메소드
	 [표현법]
	 접근제한자 클래스명([매개변수1, 매개변수2,...]){
	 }
	 */
	
	//기본 생성자
	public Product() {
	}
	
	
	// 매개변수 생성자
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
		
	}
	
	
	
	/*
	 메소드부
	 - 기능 처리 담당
	 [표현법]
	  접근제한자 반환형 메소드명([매개변수1,...]){
	  
	  }
	*/
	
	public void setPname(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public String information() {
		return "pName :" + pName + ", price : " + price + ", brand : " + brand;
	}

	
	
	
	
}
