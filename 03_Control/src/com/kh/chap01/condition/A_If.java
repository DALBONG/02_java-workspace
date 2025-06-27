package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
	/*
	단독 if문
	 [표현법]
		if(조건식) {.. 실행 코드 }
	 	=> 조건식이 참일경우 { } 블럭 안의 코드 실행
 	   조건식이 거짓일 경우 { } 코드 무시
	*/
	
	System.out.println("정수");
	int num = sc.nextInt();
	
	if(num > 0) {
		System.out.println("양수다");	
	}
	if(num < 0) {
		System.out.println("양수가 아님");
	}
		
	}
	
	public void method2() {
		/*
		 if - else 문
		 [표현법] : if(조건식) { .. 실행 코드1
		 			}else {..실행코드2}
		 			
		조건 식의 결과가 참일경우 실행코드1 실행후 조건문 빠져나옴, 
		 거짓일 경우 실행코드 2실행.
		 */
		
		System.out.print("정수 입력");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수네");
		}else { System.out.println("양수 아니네");
			}
				
	}
	
	public void method3() {
		
		/*
		 [표현식] if(조건식){ 실행코드1
		 		}else if(조건식){실행코드2...
		 		}else if(조건식){실행코드3...
		 		}else {실행코드4...
		 		}   (위의 조건들이 다 false일 경우 실행)
		 */
		
		System.out.println("정수");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수네");
		}else if(num == 0) {
			System.out.println("0이다");
		}else {
			System.out.println("음수다");
		}
		
	}
	
	public void method4() {
			/*
			나이 입력받아 
			13세 이하 : 어린이
			13세 초과 19세 이하 : 청소년
			19세 초과 : 벌어라
			*/
		System.out.println("나이는?");
		int age = sc.nextInt();
		
		String result;
		if(age <= 0) {
			result = "어린이";
			}else if(age < 20) {
				result = "총소년";
			}else {result = "성인";
			}
		System.out.println(result);
		
	}
		
	public void method5() {
			//이름
			// 성별
		 	// ㅇㅇ 님은 남학생입니다.
		
		System.out.print("이름은?");
		String name = sc.nextLine();
		
		System.out.print("성별은?");
		char gender = sc.nextLine().charAt(0);
		
		String result = " "; // 변수를 미리 세팅할때 초기화 하는 습관.
		if(gender == 'M' || gender == 'm'){
			result = "남학생";
			}else if(gender == 'F' || gender == 'f') {
				result = "여학생";
				}else {
					System.out.println("잘못 입력했음");
					return;	//return을 쓰면 호출한 곳(Run파일)으로 돌아가, 다음코드 진행 불가
				}
		
		System.out.println(name + "님은" + result + "입니다");
		
	}
	
	
	public void method6() {
		System.out.println("이름");
		String name = sc.nextLine();

//		/*
//		if(name == "차은우") {
//			System.out.println("차은우님 반갑습니다");
//		}else {
//			System.out.println("차은우님이 아니신가보군요 안녕히 가세요");
//		}
//		*/
//		
//		/*
//		특이 케이스
//		 - 기본 자료형 : boolean, byte, short, int, long, float, double, char.. 
//		 - 참조 자료형 : String
//		   * 기본 자료형들끼리 동등 비교시 ==, != 사용 가능
//		   	 참조 자료형은 동등 비교시 ==, != 사용시 정상 비교 X
//		   	 -> equals() 메소드를 이용해서 비교해야 함.
//		   	 	문자열.equals(문자열)
//		*/
//		
//		
		if(name.equals("김달봉")) {
			System.out.println("김달봉님 반갑습니다");
		}else {
			System.out.println("김달봉님이 아니신가보군요 안녕히 가세요");
		}
	}

		//if문 중첩
	public void method7() {
		System.out.println("정수(양수만) : ");
		int num = sc.nextInt();
		
		if(num > 0) {  //양수일 경우
			if(num % 2 ==0) {  // 양수+짝수
				System.out.println("양수라네");
			}else {  //양수+홀수
				System.out.println("홀수라네");
			}
		}else {  // 양수가 아닐 경우
			System.out.println("양수만 쓰라고, 다시 입력해");
		}
	}
	
	
}
