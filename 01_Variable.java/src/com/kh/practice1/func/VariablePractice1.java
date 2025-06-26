package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public void variableTestP1() {
		
	Scanner sc = new Scanner(System.in);
		
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
	

	
	
	
		
	}
	
}
