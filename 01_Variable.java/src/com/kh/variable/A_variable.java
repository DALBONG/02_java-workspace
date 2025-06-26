package com.kh.variable;

public class A_variable {
	
	// 시급과 근무시간, 근무 일수를 곱해서 월급 계산해 출력하는 메소드
	public void printVariable() {
	
		System.out.println("=== 변수 사용 전 ===");
		System.out.println("시급:10000원");
		System.out.println("근무시간 : 6시간");
		System.out.println("근무일수 : 8일");
		
		// 월급 = 시급 * 시간 * 일수
		// 차은우 : 0000원
		
		System.out.println("차은우 :" + (10000*6*8) + "원");
		System.out.println("장원영 :" + (10000*6*8) + "원"); // 복붙 : ctrl alt 아래 방향키 
		System.out.println("이제훈 :" + (10000*6*8) + "원"); 
		
		// 변수 사용
		System.out.println("===변수 사용 후 ===");
		int pay = 9450;   // int는 자료형 pay는 변수(자율 지정이나, 의미가 담기게)
		int time = 6;
		int day = 8;
		System.out.println("차은우 :" + (pay*time*day) + "원");
		System.out.println("장원영 :" + (pay*time*day) + "원"); 
		System.out.println("이제훈 :" + (pay*time*day) + "원");
			/*변수를 사용하는 이유 
			  1. 값에 의미를 부여할 목적으로 씀.(가독성 높아지게)
			  2. 단 한번 값을 기록하고 필요할때마다 가져다 쓰는 목적 (재사용성 높아짐)
			  3. 유지 보수를 보다 쉽게 할 수 있음.
			 */
	}
	
	public void declareVariable() {
			/* 변수 선언
			   : 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다
			   	 => 즉, 값을 보관할 상자를 만들겠다.
			 
			 	[표현법] 자료형 변수이름;
			 	자료형 : 변수의 크기 및 모양을 지정해주는 부분.
			 	변수이름 : 변수의 이름을 설정해주는 부분 (자유롭게 하되, 의미 부여)
			 	
			   *변수 선언 시 주의할 점
			 	 1) 변수는 무조건 소문자로 시작
			 	 	단, 낙타봉 표기법을 지킬것. 예약어는 불가)
			 	 2) 같은 영역 안에서는 동일한 변수명 선언 불가. (중복불가)
			 	 3) 해당 영역 안에서 선언한 변수는 그 영역 안에서만 사용 가능
			 	 	--> 다른 메소드에서는 사용 불가
			 */
		
			//--------- 자료형에 대한 개념 ------------
		 	// 1. 논리형 (논리값 = true / false)
				boolean isTrue;
				boolean isFalse = false;
				System.out.println("isFalse의 값 : " + isFalse);
				
				isTrue = 1 + 3 > 1;
				System.out.println("isTrue의 값 : " + isTrue);
				
			// 2. 숫자형
			// 2_1. 정수형 (소수점x)
				byte bNum; // 1byte(-128~127)
				short sNum = 1000; // 2byte
				int	iNum = 10000; // 4byte. 정수형의 기본 자료형
				long lNum = 100000; // 8byte.
				
			// 2_2. 실수형 (소수점o)
				float fNum = 0.0f; // 4byte => 소수점 7자리 까지 표현 가능
				double dNum = 0.5; // 8byte : 소수점 15자리 까지 (실수형의 기본 자료형)
				
			// 3. 문자형
			// 3_1.문자 
				char ch = 'a'; // 2byte : ' '
				
			//3_2. 문자열
				String str = "abc"; //참조형
				
				System.out.println("sNum : " + sNum);
				System.out.println("iNum : " + iNum);
				System.out.println("lNum : " + lNum);
				System.out.println("fNum : " + fNum);
				System.out.println("dNum : " + dNum);
				System.out.println("ch : " + ch);
				System.out.println("str : " + str);
				
			// 상수의 선언
			// [표현법] : final 자료형 상수이름(대문자)
				final int AGE = 10;
				System.out.println("age:"+AGE);
				   // AGE = 15; 상수는 값의 변경이 불가.
				System.out.println("파이:" + Math.PI);
					// 파이 : 대보적인 상수의 예시
				
				
			// 변수 명명규칙
			// 1) 같은 영역 내 중복된 이름 안됨.
//				int number
			// 2) 예약어 안됨
				//int true;x
				//int class; X
				//int static; X
				//int public;  X
			// 3) 숫자 사용 가능하나, 숫자로 시작하는 것은 불가
				//int number1;
				//int num1ber;
				//int 1number; X
			// 4) 특수문자 사용 가능하나 (단, _와 $외에 사용 불가)
				int num_1;
				int _number;
				int number$1;
				//int number*1; 불가
			
			// 권장사항(오류는 아니나, 개발자들간의 규칙)
			 //1) 낙타표기법 (두번째 단어부터 첫글자를 대문자로 작서)
				String username; // 오류는 아니나, 관례상 틀림
				String userTest; 
				String userNameTest;
				
			//2) 한글작성 가능하나, 무조건 영문자로 만들자
				String 이름;
				// int 나이; X -> int age;
				
			/* 
			  ** 정리
			  	- 값(리터럴) : 프로그램에 필요한 명시적인 값
			  	- 변수 : 값을 저장하기 위한
				
				
				
				
			 */
	}	
	
	
	
	
	
}


