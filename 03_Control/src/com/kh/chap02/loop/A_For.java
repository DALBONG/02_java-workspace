package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	public void method1() {
		/*
		 반복문
		 	[for문]
		 	for(초기식; 조건식; 증감식){  -> 반복횟수 결정
		 		반복적으로 실행시키고자 하는 구문
		 	}
		 	  --> for문 안에 초기,조건,증감식 생략 가능하긴 함
		 	   		for(;;) == 무한 반복
		 	 	- 초기식 : 수행시, 딱 "한 번만" 실행 
		 	 		(반복문 안에서 사용될 변수 선언 및 초기화하는 구문)
		 	 	- 조건식 : 반복문이 수행될 조건을 작성
		 	 		(조건식이 true일 경우 실행, false가 될 경우 반복 멈추고 빠져나옴)
		 	 		(초기식에 제시된 변수를 가지고 조건식을 작성)
		 	 	- 증감식 : 반복문을 제어하는 변수 값을 증/감 시키는 구문.
		 	 		(초기식에 제시된 변수를 가지고 증/감 연산자 사용)
		*/
		for (int i=1; i<=20; i++) {
			System.out.println("안녕 달봉아"+i);
		}
		for (int i=1; i<=9; i+=2) {
			System.out.println("달봉아!"+i);
		}
	}
	
	
	public void method2() {
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
	}
		
	public void method3() {
		for(int i=5; i>=1; i--) {
			System.out.print(i + "");
		}
	}
	
	
	
	public void method4() {
		/*
		for(int i=1; i<10; i+=2) {
			System.out.println(i + " ");
		}
		*/
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 1) {
				System.out.println(i + " ");
			}
		}
		
	}
	
	
	
	public void method5() {
				// 1~10 까지 
		for(int i=0; i<=9; i++) {
			System.out.print(i + 1 + " ");
		}
	}
	
	
	
	public void method6() {
			//1~10까지의 총 합계
		/*
		  int sum = 0;
		  sum += 1 >> sum = sum + 1
		  sum += 2 
		  ...
		  sum 변수에 누적 합산 규칙 발견!
		  	단, 누적해서 더하고자 하는 값이 1씩 증가
		*/
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;  //누적 합 공식 
		}
		System.out.println("1~10의 합" + sum);
	}
		
	
	
	public  void method7() {
		Scanner sc = new Scanner(System.in);
			//사용자에게 값 입력 받아서, 받은 수까지의 합계
		
		System.out.println("숫자 줘 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.println("합 :" + sum);

	}
	
	
	public void method8() {
			//1~랜덤값 (1~10)의 총 합계
			// 자바에서 제공하는 클래스 Math 
			/*
			 java.Lang.Math 클래스에서 제공하는 
			 random()메소드를 호출해서 매번 다른 랜덤값 얻음.
			  - Math.random(); 0.0 ~ 0.999999 사이 랜덤값 발생 (0.0 <= 1.0)
			*/
		
		/*
		int random = Math.random(); 
		  Double 형으로 int는 불가 
		
		int random = Math.random() *10;
			>> 0.0 ~ 9.99999
		int random = Math.random() *10 + 1;
			>> 1.0 ~ 10.9999
		*/
		
		int random = (int)(Math.random()* 1000 + 1);
		    // >> 1 ~ 10
		System.out.println("1~1000사이의 랜덤 값:" + random);
		
		int sum = 0;
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		
		System.out.println("1부터" + random + "까지의 합계 : " + sum);
	}
	
	
	
	public void method9() {
		String str = "Hello";
			/*각 인덱스별 문자를 뽑아 출력 
			  H -> str.charAt(0)
			*/
		for(int i=0; i<=4; i++) {
			System.out.print(str.charAt(i));
		}
	}
	
	
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력해 :");
		String str = sc.nextLine();
		
		System.out.println("문자열의 길이:" + str.length());
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}
	
	
	public void method11() {
			// 9.9단 출력
			/*
			   2*1=2, 2*2=4,...2*9=18
			*/
		for(int i=1; i<10; i++) {
			System.out.printf("%d x %d = %d\n", 99, i, 99*i);
		}
	}
	
	
	public void method12() {
		// 2~9까지의 랜덤 수 발생
		int dan = (int)(Math.random() * 998 + 2);
		System.out.println("=== " + dan + "단 ===");
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}
	}
	
	
	
	public void method13() {
		
		for(int j=1; j<=3; j++) {
			for(int i=1; i<=5; i++) {
				System.out.print(i + " ");
			}
		System.out.println();
		}
	}
	
	
	public void method14() {
			//2~9단까지 싹 출력
		for(int dan=2; dan<=9; dan++) {
			for(int fn=1; fn<=9; fn++) {
				System.out.printf("%d x %d = %d\n" + dan, fn, dan*fn);
			}
		}
	}
	
	
	
	
	

}
