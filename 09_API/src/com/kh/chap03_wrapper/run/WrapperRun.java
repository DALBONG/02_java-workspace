package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
		/*
		 Wrapper 클래스 
		  : 기본 자료형을 객체로 포장할 수 있는 클래스.
		  
		  기본 자료형   <---> Wrapper클래스 
		   - boolean        Boolean
		   - char  			Character*
		   - byte 			Byte
		   - short 			Short
		   - int 			Integer*
		   - long 			Long
		   - float 			Float
		   - double			Double 
		   
		   -> 기본자료형을 객체로 취급해야 하는 경우
		     - 메소드를 호출해야 할 때
		     - 메소드의 매개변수로 기본자료형이 아닌 객체 타입만 요구 될 때
		     - 다형성을 적용시킬 때
		*/
		
		//기본자료형 -> Wrapper클래스 (Boxing 포장하는 작업)
		int num1 = 10;//(리터럴 값 10)
		int num2 = 15;
		System.out.println(num1 == num2); //값이 다른 false
		
		// 1. 객체 생성 구문을 통한 방법
		Integer i1 = new Integer (num1);
		Integer i2 = new Integer (num2); 
		System.out.println(i1 == i2); // 주소값이 다른 false
		
		// 객체화 시키면 메소드 호출 가능
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); 
			//두 값을 비교하여 앞쪽이 크면 1, 뒷쪽이 크면 -1반환 같으면 0 반환
		
		// 2.객체 생성은 하지 않고 바로 대입 (AutoBoxing)
		Integer i3 = num1; // 자동으로 박싱
		System.out.println(i3);
		
		// 객체생성을 통해 반드시 변환해야 하는 경우.
		  // 문자열 -> Integer 타입으로 
		//Integer i4 = "123";   -> AutoBoxing 불가.
		Integer i4 = new Integer("123");
		System.out.println(i4);
		
		//unBoxing : Wrapper클래스를 기본 자료형으로. 
		//1. 해당 Wrapper 클래스에서 제공하는 메소드를 통해 바꿈.
		int num3 = i3.intValue();//Wrapper클래스마다 value가 있음.
		int num4 = i4.intValue();
		
		//2. 메소드를 사용하지 않고 바로 대입 (AutoUnBoxing)
		int num5 = i1;
		System.out.println(num5);
		
		// 언박싱, 오토 언박싱 목적 : 
			// 웹 개발을 할 때 값을 입력하면 무조건 문자열로 날라옴.
		System.out.println("=====================================");
		
		String age = "19";
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // 문자열 10 + 문자열 15.3 = 문자열 1015.3
		//1. String -> 기본 자료형
		  // "15.3" -> 15.3
		int i = Integer.parseInt(str1); //parsInt : 문자열을 int형으로
		double d = Double.parseDouble(str2);
		System.out.println(i + d);
		
		
		
		
		
	}

}
