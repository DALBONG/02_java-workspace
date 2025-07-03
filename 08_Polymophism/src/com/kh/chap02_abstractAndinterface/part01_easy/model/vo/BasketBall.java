package com.kh.chap02_abstractAndinterface.part01_easy.model.vo;

public class BasketBall extends Sports {

	//자식클래스에 강제성을 부여하기 위해 추상메소드 사용.
	  //FootBall, BasketBall이 rule이 있으니 rule을 구현하게
	
	//추상메소드가 존재하는 추상클래스를 상속받는 순간, 부모클래스에 있던 추상메소드를 강제로 오버라이딩 해야 함.
	
	@Override
	public void rule() {
		System.out.println("공을 손으로 다뤄야 한다.");
	}
	
	
	
}
