package com.kh.chap02_abstractAndinterface.part02_basic.model.vo;

public interface Basic {
	
	//추상 클래스 : 일반필드 + 일반메소드 [+ 추상메소드]
	//인터페이스 : only 상수필드 + 추상메소드
	
	//private int num;  -> 불가
	
	//인터페이스에서 필드는 무조건 상수필드.
	
	public static final int NUM = 10;
	 //-> 인터페이스에선 public static final 생략 가능
	
	//인터페이스에서 메소드는 무조건 추상메소드.
	public abstract void eat();
	public abstract void sleep();
	 //->> 인터페이스에선 public abstract void 생략 가능
	
	
	
	
}
