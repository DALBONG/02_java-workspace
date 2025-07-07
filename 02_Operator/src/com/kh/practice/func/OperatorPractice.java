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
	
	//=============================================================================

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

	//=============================================================================

	public void practice3() {
		
		System.out.println("정수 : ");
		int num3 = sc.nextInt();
		
		if(num3%2 == 0) {
			System.out.println("짝수로구만");
		}else if(num3%2 == 1) {
			System.out.println("홀수로군");
		}
	}
	
	//=============================================================================

	public void practice4(){
		
		System.out.println("인원수 : ");
		int num4_1 = sc.nextInt();
		System.out.println("사탕개수 : ");
		int num4_2 = sc.nextInt();
		
		System.out.println("1인당 사탕개수 : " + (num4_2 / num4_1));
		System.out.println("남는 사탕 개수 : " + (num4_2 % num4_1));
	}
	
	//=============================================================================

	
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
		String genderstr = " "; // 출력될 성별 문자열 
		if(gender == 'm' || gender == 'M') {
			System.out.println("남학생");
			}else if (gender == 'f' || gender == 'F'){
				System.out.println("여학생");
			}else {
				System.out.println("잘못 입력했어!");
			}

		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade , Class, num5, name, gender, score);
		
	}	
		//=============================================================================
		
	public void practice6() {
			
			
		//3항 연산자 중첩
		System.out.println("나이 : ");
		int num6 = sc.nextInt();
		sc.nextLine();
		
		String result = (num6 > 19) ? "성인" : (num6 < 13) ? "어린이" : "청소년";
		System.out.println(result);
		
			
	}
	
	//===========================================================
	
	public void practice7() {
		
	System.out.println("국어 : ");
	int kor = sc.nextInt();
	sc.nextLine();
	System.out.println("영어 : ");
	int elg = sc.nextInt();
	sc.nextLine();
	System.out.println("수학 : ");
	int mat = sc.nextInt();
	sc.nextLine();
		
	int sum = (kor + elg + mat);
	System.out.println("합계 : " + sum);
	int avr = (sum/3);
	System.out.println(" 평균 : " + avr);
	
	if(avr >= 60 && kor >= 40 && elg >= 40 && mat >= 40) {
		System.out.println("합격");
	}else {
		System.out.println("불합격");
	}
	}
		
	//========================================================
	
	public void practice8() {
		System.out.println("주민번호를 입력하세요(-포함)");
		// String -> char , 비교연산자
	
		char str = sc.nextLine().charAt(7);
		if(str == '1' || str == '3' ) {
			System.out.println("남자");
		}else if(str == '2' || str == '4') {
			System.out.println("여자");
		}else {
			System.out.println("외계인");
		}
		
	}	
	//=======================================================
	public void practice9() {
		
		System.out.println("정수 1 : ");
		int num1 = sc.nextInt();
		System.out.println("정수 2(정수 1보다 큰 수 입력) : ");
		int num2 = sc.nextInt();
		System.out.println("다른 정수 : ");
		int num3 = sc.nextInt();
		
		/*
		if(num1 >= num3) {
			System.out.println("true");
		}else if(num2 < num3) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		*/
		
		boolean isTrue;
		isTrue = num1 >= num3 || num2 < num3;
		System.out.println(isTrue);
	}
	
	//=====================================================
	
	public void practice10() {
		
		System.out.println("입력1 : ");
		int num1 = sc.nextInt();
		System.out.println("입력2 : ");
		int num2 = sc.nextInt();
		System.out.println("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean isTrue;
		isTrue = num1 == num2 && num2 == num3;
		System.out.println(isTrue);
	}	
	//=========================================================
	
	public void practice11() {
		
		System.out.println("A사원의 연봉 : ");
		int pay1 = sc.nextInt();
		double Apay = ((double)pay1+(pay1*0.4));
		sc.nextLine();
		
		System.out.println("B사원의 연봉 : ");
		int pay2 = sc.nextInt();
		double Bpay = ((double)pay2*1);
		sc.nextLine();
		
		System.out.println("C사원의 연봉 : ");
		int pay3 = sc.nextInt();
		double Cpay = ((double)pay3+(pay3*0.15));
		sc.nextLine();
		
		System.out.println("A사원 연봉/연봉+a : " + pay1 + "/"+ Apay);
		if(Apay >= 3000) {
			System.out.println("3000 이상");
		}else {
			System.out.println("3000 미만");
		}
		System.out.println("B사원 연봉/연봉+a : " + pay2 + "/"+ Bpay);
		if(Bpay >= 3000) {
			System.out.println("3000 이상");
		}else {
			System.out.println("3000 미만");
		}
		System.out.println("C사원 연봉/연봉+a : " + pay3 + "/"+ Cpay);
		if(Cpay >= 3000) {
			System.out.println("3000 이상");
		}else {
			System.out.println("3000 미만");
		}
		
		

	
		
		
	}
		
		
		
	
		
	

	
	
	
}
