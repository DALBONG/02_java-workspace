package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCopy {
	
	public void method1() {
		int[] origin = {1, 2, 3, 4, 5};
		System.out.println("===== 원본 배열 =====");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		int[] copy = origin;
		System.out.println("===== 복사 배열 =====");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		
		System.out.println();
		
		copy[2] = 99;
		System.out.println("===== 복사배열 값 수정 후");
		System.out.println("===== 원본 배열 =====");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		System.out.println("===== 복사 배열 =====");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		
		System.out.println();
		//카피를 바꿨는데 원본도 왜 바뀌었을까?
		// -> origin과 copy가 같은 곳을 참조하고 있기 때문(즉, 주소값이 같음)
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		// 위에 것은 얕은 복사 (주소값 복사)
	}
	
	
	public void method2() {
		//1. for문을 이용한 깊은 복사
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[5];
			/*
			 copy[0] = origin[0]
			 copy[1] = origin[1]... 
			 */
		for(int i=0; i<copy.length; i++) {
			copy[i] = origin[i];
		}
		System.out.println("===== 원본 배열 =====");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		System.out.println("===== 복사 배열 =====");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		
		System.out.println();
		
		// copy배열 수정
		copy[2] = 99;
		System.out.println("===== 원본 배열 =====");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		System.out.println("===== 복사 배열 =====");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+ " ");
		}
		
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
	}
	
	
	public void method3() {
		// 2. 메소드를 활용한 깊은 복사 
			// System 이라는 클래스에서 제공하는 arraycopy()메소드
		int[] origin = {1,2,3};
		int[] copy = new int[10];
		
			// System.arraycopy(원본 배열명, 복사할 시작 인덱스, 복사본배열형, 복사될 시작 인덱스, 복사 갯수)
		//System.arraycopy(origin, 0, copy, 0, 3);
		//System.arraycopy(origin, 0, copy, 2, 3);
		System.arraycopy(origin, 1, copy, 3, 2);
		for (int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
	}

	
	
	public void method4() {
		//3. Arrays 클래스에서 제공하는 copyOf() 메소드
		int[] origin = {1,2,3,4,5};
		//복사본 배열 = Arrays.copyOf(원본 배열명, 복사할 길이)
		int[] copy = Arrays.copyOf(origin, 10);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
	}
	
		/* [참고]
		  java.lang.Math
		  java.lang.String
		  java.lang.System
		    => java. lang 패키지에 있는 클래스들은 import하지 않아도 사용 가능.
		  java.util.Scanner
		  java.util.Arrays 
		  	=> java.lang이외의 패키지에 있는 클래스들을 쓸땐 무조건 impport해야 함.
		*/
	
	
	
	public void method5() {
		//4. clone() 메소드 이용 : 완전 똑같이 복사 **
		int[] origin = {1,2,3,4,5};
		//복사본 배열 = 원본 배열.clone();
		
		int[] copy = origin.clone();
		for (int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());

	}
	
	
	
	
	
	
}
