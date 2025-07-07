package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {

	private Scanner sc = new Scanner(System.in); 
	
	/*
	 RuntimeException
	  - 프로그램 실행시 발생되는 예외
	  
	  종류 (RuntimeException의 후손)
	  - IndexOutOfBoundsException : 부적절한 인덱스를 가지고 접근
	  - NullPointerException : 참조변수가 null로 초기화된 상황에서 null에 접근했을 때 발생
	  - ArithmeticException : 나누기 연산시 0으로 나누려할 때 발생
	  - ClasscastException : 허용할 수 없는 형변환 진행시 발생
	  - NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생 
	  
	   => 관련한 예외는 충분히 예측가능한 상황 있음 (예외 자체가 발생이 안되게끔 if문 조건 처리 가능)
	  
	 */
		
	
	public void method1() {
		// ArithmeticException : 나누기 연산시 0으로 나누려할 때 발생
		System.out.println("첫째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("둘째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		// int result = num1/num2; // 사용자가 둘째 정수를 0으로 입력하는 순간 예외 발생, 비정상적 프로그램 종료
		/*
		int result = 0;
		if(num2 != 0) {
			result = num1/num2;
		}  //이는 예외처리 X (예외처리가 나지 않게 막은 것)
		System.out.println("계산결과 : " + result);
		*/
		
		//예외 처리 : 예외가 '발생했을 때' 실행할 내용을 미리 작성
		/*
		 try~catch 방법
		  try{
		  	예외가 발생될 수 있는 구문
		  }catch(발생될 예외 클래스 매개변수){
		  	해당 예외가 발생되었을 경우 실행할 구문.
		  }
		    ->(예외가 발생될 수 있는 구문을 잡아서 실행할 구문 작동)
		*/
		
		try{
			int result = num1 / num2;
			System.out.println("result : " + result);
		}catch(/*자료형 e*/ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
			e.printStackTrace(); //강제로 오류난 이력을 보고자 할 때 실행할 구문
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	
	public void method2() {
		
		//  - IndexOutOfBoundsException : 부적절한 인덱스를 가지고 접근

		
		System.out.println("배열의 크기 : ");
		int size = sc.nextInt();
		
		/* if문으로 예외자체가 발생이 안되도록 먼저 막는 법
		if(size >= 101) {
			int[] arr = new int[size];
			System.out.println("100번 인덱스의 값 : " + arr[100]);
		}
		*/
	
		try{
			int[] arr = new int[size];
			System.out.println("100번 인덱스의 값 : " + arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기를 음수로 제시할 수 없습니다");	
		}//catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("부족절한 인덱스로 접근");
		//} // 다중 캐치 블럭
		 
		System.out.println("프로그램종료");
		
	}
	
	
	
	public void method3() {
		
		System.out.println("배열의 크기 :");
		
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열 크기 음수로 제시 못해!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근했어!");
		}catch(InputMismatchException e) {
			System.out.println("정수로만 해!");
		}
		*/

		
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(InputMismatchException e) {
			System.out.println("정수아님");
		}catch(RuntimeException e) {//다형성 적용되어 부모타입 예외클래스 작성 가능 
			System.out.println("예외 발생했음.. 배열의 크기나, 부적절한 인덱스였던가.. 등..");
		}/*catch(InputMismatchException e) {}*/
		 // 부모 예외 클래스와 자식 예외 클래스를 가지고 catch블럭을 기술하고자 할 때
		   // 자식 예외 클래스가 위에 있어야 함. (부모 클래스가 잡아서 도달하지 않음.unreachable catch block)
		
		
		/*
		 RuntimeException 관련 애들은 UncheckedException으로, 
		 예외처리 구문이 필수는 아님.
		 
		 if문 : 애초에 예외자체가 발생되기 전에 소스코드로 핸들링 하는 것 (예외처리 구문X)
		 try - catch문 : 예외가 발생했을 경우 처리해주는 구문을 작성해두는 것.
		 
		 예측 가능한 상황은 if문 조건 검사로 해결하는게 권장사항
		 부득이 조건문으로 핸들링 안되는 구문은 예외처리 구문으로 작성.
		 */
		
		
		
	}
	
	
	
	
	
}
