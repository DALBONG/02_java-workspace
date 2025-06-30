package com.kh.variable;

import java.util.Scanner;

public class D_casting {

	/*
	 *형변환 : 값의 자료형을 바꾸는 것 
	  	-> 컴퓨터에서의 값 처리 규칙
	  1. 대입 연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이여야 함.
	  	--> 같은 자료형에 해당하는 값만 대입 가능 (int = 달봉아 이 형식은 맞지X)
	  	--> 즉, 다른 자료형의 값을 대입하고자 한다면 형변환이 필수적.
	  		  	
	  2. 같은 자료형 끼리만 연산이 가능
	   	값+값 => 계산 결과도 같은 자료형으로 나옴.
	   	
	   *형변환 종류
	    1. 자동 형변환 : 자동으로 형변환이 이루어져 형변환 할필요 X
	    2. 강제(명시적) 형변환 : 자동 형변환 X 우리가 해야 함.
	   
	    [표현법]
	    자료형 변수명 = (자료형)값;
	    *boolean은 형변환 불가.
	*/
	
	public void autoCasting() {
		// 자동 형변환 : 값의 범위가 작은 자료형과 큰 자료형간의 연산시 
		// 자동으로 범위가 작은 자료형을 큰 자료형으로 변환후 처리
		
		// 1. int(4byte) => double(8byte)
		int i1 = 12;
		double d1 = /*[(double)]*/ i1;
		System.out.println("d1:" + d1);
		
		int i2 = 12;
		double d2 = 3.4;
		double result = i2 + d2;
		
		System.out.println("result:" + result);
		
		// 2. int(4byte) => long(8byte)
		int i3 = 1000;
		long l3 = (long)i3;
		
		// 3. float(4byte) => double(8byte)
		float f4 = 1.0f;
		double d4 = f4;
		
		//------특이 케이스------------------------------------------
		// 4. long(8byte) => float (4byte)
		// float이 실수형이기 때문에 long보다 표현 가능한 수의 범위가 넓기에 가능.
		
		long l5 = 74655447895L;
		float f5 = l5; 
		
		// 5. char(2byte) <=> int(4byte)
		int num = 'C';
		System.out.println("num:" + num);
		
		char ch = 254;
		System.out.println("ch:" + ch);
		/*
		 각 문자들마다 고유한 숫자가 지정되어 있기 때문에
		 쌍방으로 형변환 가능
		 캐릭터 변수는 음수값 저장 불가, 
		 범위는 0~65535 값의 범위
		*/
		
		// 6. byte간의 연산
		byte b1 = 1;
		byte b2 = 10;
		
		// byte b3 = b1 + b2; --> byte는 연산결과가 int형으로 저장되어 연산 불가
	
	}
	
	public void forceCasting() {
		// 강제 형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것
		
		
			//double => float
		double d1 = 4.0;
		float f1 = (float)d1; // 강제 형변환을 해주지 않으면 오류남
		
			//double => int
		int iNum = 10;
		double dNum = 5.89;
			//int iSum = iNum + dNum;
			// 방법 1 : 연산 결과를 int형으로 강제 변환
		int iSum1 = (int)(iNum + dNum);
		System.out.println("iSum1:" + iSum1);
			// 방법 2 : double형 값만 int형으로 강제 형변환
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2:" + iSum2);
		
	}
	
	public void calScore() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어:");
		double kor = sc.nextDouble();
		
		System.out.print("영어:");
		double eng = sc.nextDouble();
		
		System.out.print("수학:");
		double math = sc.nextDouble();
		
		System.out.println("총점:" + (int)(kor + eng + math));
		System.out.println("평균:" + (int)((kor + eng + math)/3));
		
	}
	
	
	public void method2(){
		int a = 10;
		int b = ++a; //11
		
		System.out.printf("a : %d, b: %d\n", a, b);
		
		int c = 10;
		int d = c++;
		System.out.printf("c : %d, d:%d\n", c, d);
		//===========================================================
		
		int num = 20;
		System.out.println("현재num :" + num);
		System.out.println("++num :" + ++num);
		System.out.println("num++ :" + num++);
		System.out.println("--num : " + --num);
		System.out.println("num-- : " + num--);
		System.out.println("최종num:" + num);
		
	}
	
	public void method3() {
		int num1 = 20;
		int result = ++num1 *3;
		System.out.printf("num1: %d, result1:%d\n", num1, result);
		
		int num2 = 20;
		int result2 = num2++ *3;
		System.out.printf("num2: %d, result2:%d\n", num2, result2);
		
	}
	
	
	
	
}
