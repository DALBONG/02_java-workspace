package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
				
		System.out.println("정수 : ");
		int num1 = sc.nextInt();
		
		if(num1 > 0){
			System.out.println("양수다!!");
		}else if(num1 <= 0) {
			System.out.println("양수가 아니다!!!!");
		}
	}
	
	
	public void practice2() {
		
		System.out.println("정수 : ");
		int num2 = sc.nextInt();
		if(num2 > 0) {
			System.out.println("양수로구나!");
		}else if(num2 == 0) {
			System.out.println("0이로군");
		}else if(num2 < 0) {
			System.out.println("음수로군");
		}
	}

	
	public void practice3() {
		
		System.out.println("정수 : ");
		int num3 = sc.nextInt();
		
		if(num3%2 == 0) {
			System.out.println("짝수로구만");
		}else if(num3%2 == 1) {
			System.out.println("홀수로군");
		}
	}
	
	
	public void practice4(){
		
		System.out.println("인원수 : ");
		int num4_1 = sc.nextInt();
		System.out.println("사탕개수 : ");
		int num4_2 = sc.nextInt();
		
		System.out.println("1인당 사탕개수 : " + (num4_2 / num4_1));
		System.out.println("남는 사탕 개수 : " + (num4_2 % num4_1));
	}
	
	
	
	public void practice5() {
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("학년(숫자만) : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.println("반(숫자만) : ");
		int Class = sc.nextInt();
		sc.nextLine();
		System.out.println("번호(숫자만) : ");
		int num5 = sc.nextInt();
		sc.nextLine();
		System.out.println("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("성적(소수점 둘쨰 자리까지) : ");
		double score = sc.nextDouble();
		
		/*
		if(gender == 'm' || gender == 'M') {
			System.out.println("남학생");
			}else if (gender == 'f' || gender == 'F'){
				System.out.println("여학생");
			}else {
				System.out.println("잘못 입력했어!");
			}
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade , Class, num5, name, gender, score);
		*/
		
		//gender 결과값을 담을 변수 생성
		
		if(gender == 'm' || gender == 'M') {
			System.out.println("남학생");
			}else if (gender == 'f' || gender == 'F'){
				System.out.println("여학생");
			}else {
				System.out.println("잘못 입력했어!");
			}
		String genderstr = " "; // 출력될 성별 문자열 

		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade , Class, num5, name, genderstr, score);
		
		
		
		
	}

	
	
	
}
