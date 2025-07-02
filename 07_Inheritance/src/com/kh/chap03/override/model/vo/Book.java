package com.kh.chap03.override.model.vo;

public class Book /*[extends Object]*/ {

	private String title;
	private String authour; 
	private int price;
	
	public Book() {}
	
	public Book(String title, String authour, int price) {
		this.title = title;
		this.authour = authour;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return authour;
	}
	public void setAuthor(String author) {
		this.authour = author;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return title + "," + authour + "," + price;
	}
	
	/*
	 오버 라이딩 
	  - 자식 클래스가 상속받고 있는 부모 클래스의 메소드를 재정의 하는 것
	  - 부모가 제공하는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미
	  - 자식 객체를 통해 실행시 자식 메소드가 우선권을 가짐
	  
	  [성립조건]
	   - 부모 메소드명과 동일해야 함
	   - 매개변수 개수, 자료형, 순서 동일(매개변수 명은 상관 없음)
	   - 부모 메소드 반환형 동일해야 함
	   - 접근제한자가 부모 메소드의 접근 제한자보다 범위가 같거나 커야 함.
	     => 규약의 개념이 들어가 있음.(너가 재정의 할꺼면, 이정도 규칙은 지켜줘)
	     
	   @Override (어노테이션)
	   - 생략가능하나, 크게 상관 없음
	    !붙이는 이유 
	    ㄴ 부모의 메소드명이나, 매개변수가 수정되었을 경우 알아보기 쉬움.
	    ㄴ 자식 메소드 기술시 오타가 있을경우 알아보기 쉬움.
	    ㄴ 단지, 오버라이딩한 메소드임을 알려주기 위함.
	 */
	
	
	
}
