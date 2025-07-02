package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
		
		/*
		 Desktop
		brand pCode pName price allinone 
		 */
		
		Desktop d = new Desktop("삼성","d-01","짱데스크탑",1400000,true);
		Tv t = new Tv("엘지","T-01","얇티",3400000,85);
		SmartPhone s = new SmartPhone("애플" , "s-01" , "아이폰" , 1400000 , "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		/*
		 3개의 클래스의 공통적 필드와 메소드들이 존재함 
		 중복된 코드들을 따로 "부모 클래스"로 한번만 정의해두면, 중복코드 줄일 수 있음.
		  => 수정/유지보수 요청이 들어왔을 경우 일일히 찾아서 수정할 필요 없이, 
		     한번만 정의해둔 부모 클래스만 수정하면 전체적으로 반영 됨.
		     
		 1. 세 클래스가 공통적으로 가지고 있는 것
		  - brand, pCode, pName, price 필드.
		  - setter / getter
		  - information() 메소드
		  => Product 클래스에 미리 정의.
		*/
		
		
	}

}
