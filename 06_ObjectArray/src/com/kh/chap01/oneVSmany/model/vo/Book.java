package com.kh.chap01.oneVSmany.model.vo;

public class Book {
	// 도서명, 저자, 가격, 출판사
	private String title;
	private String authour;
	private int price;
	private String publisher;
	
	//기본 생성자
	public Book() { }
	
	//매개변수 생성자
	public Book(String title, String authour, int price, String publisher) {
		this.title = title;
		this.authour = authour;
		this.price = price;
		this.publisher = publisher;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getAuthour() {
		return authour;
	}
	public void setAuthour(String authour) {
		this.authour = authour;
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	
	public String information() {
		return title + " " + authour + " " + price + " " + publisher;
	}
	

}
