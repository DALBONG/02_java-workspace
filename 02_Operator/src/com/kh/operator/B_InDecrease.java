package com.kh.operator;

public class B_InDecrease {
		/*
		 증감 연산자 (단항 연산자)
		 ++ : 변수에 담긴 값을 1 증가시켜주는 연산자
		 	++변수, 변수++
		 -- : 변수에 담긴 값을 1 감소시켜주는 연산자
		 	--변수, 변수--
		 	
		 (증감연산자)변수 : 전위 연산 -> 선증감 후처리
		 변수(증감연산자) : 후위 연산 -> 선처리 후증감
		*/
	public void method1() {
		//전위 연산 테스트
		int num1 = 10; 
		System.out.println("전위연산 적용전 num1의 값:" + num1); 
		System.out.println("1회 수행:" + ++num1); // num1 == 10 > 11
		System.out.println("2회 수행:" + ++num1); // num1 == 11 > 12
		System.out.println("3회 수행:" + ++num1); // num1 == 12 > 13
		System.out.println("최종 num1 :" + num1);
		
		//============================================================
		//후위 연산 테스트
		int num2 = 10;
		System.out.println("후위연산 적용전 num2의 값:" + num2);
		System.out.println("1회 수행:" + num2++); //10출력 후, num2가 11로 증가
		System.out.println("2회 수행:" + num2++); //11출력 후, num2가 12로 증가
		System.out.println("3회 수행:" + num2++); //12출력 후, num2가 13으로 증가
		System.out.println("최종 num2의 값:" + num2);
		
	}
	
}
