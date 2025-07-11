package com.kh.chap02_abstractAndinterface.part01_easy.run;

import com.kh.chap02_abstractAndinterface.part01_easy.model.vo.BasketBall;
import com.kh.chap02_abstractAndinterface.part01_easy.model.vo.FootBall;
import com.kh.chap02_abstractAndinterface.part01_easy.model.vo.Sports;

public class EasyRun {

	public static void main(String[] args) {

		//Sports s = new Sports(); -> 추상클래스로는 객체 생성 불가 (미완성이기에)
									 // 객체생성이 안될 뿐, 레퍼런스로는 사용 가능.
		Sports s = new BasketBall();
		Sports[] arr = new Sports[2];
		
		arr[0] = new BasketBall();
		arr[1] = new FootBall();
		
		//단순 for문
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		
		//for each문
		for(Sports sp :arr) { // sp = arr[0] -> sp = arr[1]...
			sp.rule();
		}
		/*
		1. 동적 바인딩 : 컴파일 시점에선 정적바인딩으로 현재 레퍼런스 자료형 클래스에 있는 메소드를 가리킴.
			런타임시점 (실행시점)에서는 동적바인딩으로 각각의 자식 클래스에 오버라이딩 된 메소드가 있을 경우 실행.
		*/
		
		/*
		2. 추상 메소드 
		  - 미완성된 메소드로 몸통부가 구현되어있지 않음. 
		  
		3. 추상 클래스
		  - 미완성된 클래스
		  - 일반 필드 + 일반 메소드 [+추상 메소드] 
		  => 추상 메소드를 가진 클래스는 반드시 추상클래스로 명시해야 함.
		  
		  추상메소드가 굳이 없어도 추상클래스로 만들 수 있음(abstract)
		   * 사용 시기 
		    > 개념적 : 클래스가 아직 미완성된 클래스임을 부여할 목적
		    > 프로그래밍적 : 객체 생성이 불가하게끔 하고자 할 때
		   * 사용 이유
		    : 부모클래스에서 추상메소드가 존재할 경우 자식클래스에선 강제로 오버라이딩 해서
		      동일한 패턴의 메소드를 가지게 됨 
		    
		    -> 각 자식 클래스마다 실행시킬 내용은 다르나, 동일한 형태의 메소드를 구현했으면 할 때.
		    
		 */
		
	}

}
