package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class InheritRun {

	public static void main(String[] args) {

		Car c = new Car("벤틀리", 12.5, "세단", 4);
		Ship s = new Ship("낚싯배", 3, "어선", 3);
		Airplane a = new Airplane("종이비행기", 0.01, "제트기", 4, 3);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
System.out.println("====================================================================");		
			
		/*
		 상속의 장점
		  - 보다 적은 양의 코드로 새로운 클래스 작성 가능.
		  - 코드를 공통적으로 관리하기에 코드의 추가나 변경에 용이(유지보수, 생산성 up)
		  
		 특징
		  - 클래스간의 상속에 있어서, 다중 상속 불가(단일 상속만 가능)
		  - 부모 클래스에 정의되어있는 protected 필드는 자식 클래스에서 직접 접근 가능.
		  - 자식 객체는 부모 클래스에 있는 메소드를 마치 내것처럼 호출 가능.
		  	 + 부모클래스가 가지고 있는 메소드가 맘에 안들면, 자식 클래스에서 오버라이딩(재정의) 가능.
		**- 명시되어 있지는 않지만, 모든 클래스(만든,제공클래스)는 Object클래스의 후손. 
		    -> 즉, Object클래스의 메소드를 마음대로 호출, 오버라이딩 가능.
		*/	
		System.out.println(c.hashCode());
		System.out.println(c.equals(s));
		System.out.println(c.toString()); /*.toString : 숨어있음. 즉, c만 찍어도 똑같음*/
		
		System.out.println(s);
		System.out.println(a);
		

	
	}
	
	
	
	
	
	
	
	
	
}
