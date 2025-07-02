package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {

		/*
		 상속의 장점
		  1) 보다 적은 양의 코드로 새로운 클래스 작성 가능. 
		  2) 중복코드를 별도로 관리하여, 코드의 추가나 변경에 용이
		    -> 프로그램의 생산성과 유지보수에 크게 기여 
		*/
		
		//Desktop 객체 생성 brand pCode pName price allInOne
		Desktop d = new Desktop("삼성", "d-01", "짱데스크탑", 1700000, true);
			/*
			 heap영역에 부모영역 4칸이 먼저 생긴 후, 
			 올인원이 옆에 작게 생긴 후, 모두를 묶는 큰 박스 생성. 
			*/
		Tv t = new Tv("엘지", "t-01", "짱얇은티비", 3500000, 85);
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 1300000, "KT");
		
		System.out.println(d.information());
		System.out.println(t.inforamtion());
		System.out.println(s.information());
		
		s.setPrice(8000000); // Product에 있는 메소드 호출
		s.setMobileAgency("SKT"); // smartphone에 있는 메소드 호출
	}
	
		/*
		 상속의 특징
 			- 자식 객체를 가지고 부모클래스에 있는 메소드를 마치 내것처럼 호출 가능
 			- 부모클래스에 있는 메소드를 오버라이딩을 통해 자식 클래스에서 재 정의 가능.
 			 => 오버라이딩을 하는 순간 자식 클래스에 있는 메소드가 우선권 가짐 
 			   클래스간의 상속은 다중 상속 불가 (단일 상속만 가능)
		 */
	

}
