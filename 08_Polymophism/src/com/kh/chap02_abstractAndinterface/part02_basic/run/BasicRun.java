package com.kh.chap02_abstractAndinterface.part02_basic.run;

import com.kh.chap02_abstractAndinterface.part02_basic.model.vo.Baby;
import com.kh.chap02_abstractAndinterface.part02_basic.model.vo.Basic;
import com.kh.chap02_abstractAndinterface.part02_basic.model.vo.Mother;
import com.kh.chap02_abstractAndinterface.part02_basic.model.vo.Person;

public class BasicRun {

	public static void main(String[] args) {

		// 부모 : Person
		// 자식 : Mother, Baby
		
		/*
		Person mom = new Mother("김마더", 50, 70, "출산");
		Person bab = new Baby("김아기", 3.3, 70);
		
		System.out.println(mom);
		System.out.println(bab);
		
		mom.eat(); //몸무게 +10, 건강도-10
		bab.eat(); // 몸무게 +3, 건강도+1
		
		mom.sleep(); //건강도 +20
		bab.sleep(); //건강도 +3
		
		System.out.println("==== 다음날 ====");
		System.out.println(mom);
		System.out.println(bab);
		*/
		
		//Basic b = new Basic(); --> 레퍼런스 변수로는 사용가능하나, 객체 생성은 불가
		Basic mom = new Mother("김마더", 50, 70, "출산");
		Basic bab = new Baby ("기마기", 3.5, 70);
		
		System.out.println(mom);
		System.out.println(bab);
		
		mom.eat();
		bab.eat();
		
		mom.sleep();
		bab.sleep();
		
		System.out.println("===다음날===");
		System.out.println(mom);
		System.out.println(bab);
		
		/*
		 클래스에서 클래스를 상속받을 때.
		    : 클래스 extends 클래스명 표기(단일상속만 가능)
		 클래스에서 인터페이스를 구현할 때.
		    : 클래스 implements 인터페이스명 (인터페이스1, 인터페이스2.. 다중상속 가능)
		 인터페이스에서 인터페이스를 상속 
		    : 인터페이스 extends 인터페이스1, 인터페이스2... 
		    
		                |   추상 클래스   |    인터페이스    
		    ============================================
		       상속 갯수 	|    단일 상속	   |	다중 상속
  			--------------------------------------------
  			    키워드    |   extends    |  implements
  			--------------------------------------------
  			   추상메소드  |    추상메소드   |     묵시적으로 
  			  표현법/ 개수 |    0개 이상    | abstract(생략가능)
  			--------------------------------------------
  			일반 메소드 여부|      O       |       O
  			---------------------------------------------
  			일반 필드 여부  |      O       | X : 상수필드만 가질 수 있음
  			
  			
  			extends 일반 클래스 ---> extends 추상 클래스 ---> implements 인터페이스
  			   일반클래스 --> 인터페이스로 갈 수록 강제성이 짙어짐(규약이 세짐)
		 */  
		
		
	}

}
