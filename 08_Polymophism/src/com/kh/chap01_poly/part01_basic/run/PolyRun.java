package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		// = 기준으로 왼쪽 오른쪽의 타입이 같아야 함.
		
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent();
		// p1 레퍼런스로 parent에만 접근 가능.
		
		System.out.println("2. 자식 타입 레퍼런스로 자식객체를 다루는 경우");
		Child1 c1 = new Child1(); //c1 객체 생성
		c1.printChild1();
		c1.printParent(); // 상속이 아니면 이 개념은 불가, 자동 형변환 해준 것.(child1 -> parent ) 
		   // ㄴ> ((parent)c1).printParent();
		   // c1 레퍼런스로 Child1, Parent 둘다 접근 가능
		
		System.out.println("3. 부모 타입 레퍼런스로 자식 객체를 다루는 경우(다형성)");
		Parent p2 = /*[(Parent)]*/new Child1(); //왼쪽 오른쪽이 자료형이 다른데 에러가 안뜸 : 자동 형변환 된 것.
		p2.printParent();
		((Child1)p2).printChild1(); // 강제 형변환을 하면 호출은 가능!
		 	/* p2레퍼런스로 지금 당장은 Parent에만 접근 가능 하지만,
		 	 Child1에 접근하고자 한다면 강제 형변환을 통해 접근 */
		
		/*
		 상속 구조의 클래스들 간의 형변환
		 1. UpCasting
		 	자식타입 -> 부모타입 자동 형변환
		 	
		 	자식.부모메소드();
		 	부모=(부모)자식객체();
		 	
		 2. DownCasting
		 	부모타입 -> 자식타입 강제 형변환
			((자식)부모).자식메소드();
			
		 	-> 상속구조가 아니면 안됨 
		 */
		
		
		//다형성 정의
		  //- 부모타입에서 파생된 여러 타입의 자식 객체들을 부모클래스 하나로 다룰 수 있음.

		
		//다형성 목적 : 다형성 적용 전
		//객체 4개를 관리하기 위해 객체 배열을 2개 만듦.
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,4);
		arr1[1] = new Child1(2,4,5);

		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(2,1,6);
		arr2[1] = new Child2(7,7,2);
		//-========================================
		
		//다형성 적용 후
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1,2,4);
		arr[1] = new Child1(2,4,5);
		arr[2] = new Child2(2,1,6);
		arr[3] = new Child2(7,7,2);
		// 하나의 부모타입으로 여러 자식 객체를 받을 수 있음. (편리, 코드길이 감소 )
		
		System.out.println("=============================================");
		arr[0].printParent();
		((Child1)arr[0]).printChild1(); //
		
		((Child1)arr[1]).printChild1();
		//((Child1)arr[1]).printChild2();
		//((Child1)arr[2]).printChild1();
		((Child2)arr[2]).printChild2();
		
		
		System.out.println("==============반복문으로 출력====================");
			// instanceof 연산자 : 연산 결과를 true, false로 반환
		  	// 현재 레퍼런스가 실질적으로 어떤 클래스 타입을 참조하는지 확인할 때 사용
		for(int i=0; i<arr.length; i++) { 
			if(arr[i] instanceof Child1) {
				((Child1)arr[i]).printChild1();
			}else {
				((Child2)arr[i]).printChild2();
			}
		}
		
		System.out.println("======================================================");
		Parent pp = new Child1();
		pp.print();
		 /*
		  동적 바인딩 : 프로그램이 실행되기 전에는, 컴파일 되면서 정적 바인딩.(레퍼런스 타입의 메소드를 가리킴)
		  			단, 실질적으로 참조하는 자식 클래스의 해당 메소드가 오버라이딩 되어있다면
		  			프로그램 실행시 동적으로 그 자식 클래스의 오버라이딩 된 메소드를 찾아서 실행.
		  */
		
		for(int i=0; i<arr.length; i++) {
			arr[i].print();
		}
		
		
		
	}

}
