package com.kh.chap01_math.run;

public class MathRun {

	public static void main(String[] args) {
		// Math : java.lang.Math(+ String, object) 패키지에 있는 메소드 (import하지 않아도 사용 가능)
		
		
		//상수필드
		System.out.println("파이 :" +Math.PI);
		
		//절대값 알고싶을 때 : abs();
		int num1 = -10;
		System.out.println("절대값 : " +Math.abs(num1));
		
		//올림 : ceil 
		double num2 = 4.349; //5
		double num3 = -10.5934; //
		
		System.out.println("올림 : "+Math.ceil(num2));
		System.out.println("올림 : "+Math.ceil(num3));
		
		//버림 : floor
		System.out.println("내림 :"+Math.floor(num2));
		
		//반올림 : round
		System.out.println("반올림: " +Math.round(num2));
		
		//제곱근(루트) : sqrt
		System.out.println("4의 제곱근 : "+Math.sqrt(num2));
		
		//제곱 : pow
		System.out.println("2의 10제곱 : " +Math.pow(2, 10));
		
		/*
		 Math 특징 
		  - 모든 필드가 상수필드고, 모든 메소드가 static 메소드
		  - 생성자도 private로 생성불가.
		  - 한번만 메모리 영역에 올려, 재사용 (싱글톤 패턴)
		  
		 */

	}

}
