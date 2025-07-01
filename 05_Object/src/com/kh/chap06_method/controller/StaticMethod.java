package com.kh.chap06_method.controller;

public class StaticMethod {
	// 1. 매개변수도 없고 반환값도 없는 메소드.
	public static void method1() {
		System.out.println("매개변수도 없고 반환값도 없는 static 메소드");
	}

	
	// 2. 매개변수는 없고, 반환값은 있는 메소드. 
	public static int method2() {
		System.out.println("매개변수는 없고, 반환값은 있는 static 메소드");
		
		//랜덤값(1~100 사이 총 합계를 리턴에 넣고 출력)
		int random = (int)(Math.random() * 100 + 1);
		int sum = 0;
		for (int i=0; i<=random; i++) {
			sum += i;
		}
		return sum;	
	}
	
	
	// 3. 매개변수는 있고, 반환값이 없는 메소드.
	public static void method3(String name) {
		System.out.println("매개변수가 있고, 반환값이 없는 static 메소드");
		System.out.println(name + "경 name님의 방문 축");
	}
	
	
	// 4. 매개변수, 반환값 둘 다 있는 메소드
	public static boolean method4(String str1, String str2) {
		/*
		if(str1.equals(str2)) {
			return true;
		}else {
			return false;
		}
		*/
		
		return str1.equals(str2);
		
		
	}

}
