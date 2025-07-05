package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public void variableTestP1() {
	
		/*
		
	System.out.println("이름, 성별, 나이, 키를 사용자에게 입력받아 각각의 값을 변수에 담고 출력하세요.");
	
	System.out.println("이름을 입력하세요: ");
	String name = sc.nextLine();
	System.out.println("성별을 입력하세요(남/여)");
	char gender = sc.nextLine().charAt(0);
	System.out.println("나이를 입력하세요: ");
	int age = sc.nextInt();
	System.out.println("키를 입력하세요(cm): ");
	double key = sc.nextDouble();
	
	System.out.printf("키 %.1fcm인 %d살 %c자 %s님 반갑습니다.", key, age, gender, name);
	*/
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 변수에 내용을 담고 출력해보기
		System.out.println("안녕! ㅇㅇ!, 니 성은ㅇ 이고, 키는 ㅇㅇㅇ.ㅇ, 나이는 ㅇㅇ살 이구나? 잘 부탁해! 출력하기");
		String name = "달봉";
		char ch = '김'; //char형은 ' '
		double height = 177.7;
		int age = 32;
		
		System.out.println("안녕! " + name + "!, 니 성은 " + ch + " 이고, 키는 " + height + ", 나이는 " + age + "살 이구나? 잘부탁해!" );
		
		// 2. 내용을 입력받아 출력해보기.
		System.out.println("이름을 입력하세요 : ");
		String name2 = sc.nextLine();
		System.out.println("성을 입력하세요 : ");
		char ch2 = sc.nextLine().charAt(0);
		System.out.println("키를 입력하세요 : ");
		double height2 = sc.nextDouble();
		System.out.println("나이를 입력하세요 : ");
		int age2 = sc.nextInt();
		
		System.out.println("안녕! " + name2 + "!, 니 성은 " + ch2 + " 이고, 키는 " + height2 + ", 나이는 " + age2 + "살 이구나? 잘부탁해!" );

				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
		
	}
	
}
