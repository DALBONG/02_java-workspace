package com.kh.array;

import java.util.Scanner;

public class A_Array {
		/*
		 변수 : 하나의 공간에 하나의 값만 담을 수 있음.
		 배열 : 하나의 공간에 여러개의 값을 담을 수 있는 개념.
		 	('같은 자료형의 값'으로만 담을 수 있음)
		 	배열의 각 인덱스 자리에 실제 값이 담김.
		*/
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
			/*
			 1. 배열의 선언 
			  	- 자료형 배열명[ ];
			  	- 자료형[ ] 배열명;
			*/
		int a; // 변수 선언
//		int arr[];
		//int[] arr; 
		
			/*
			 2. 배열 할당 (크기 지정)
			 	배열명 = new 자료형[배열의 크기];
			*/
		//arr = new int[5];
			
			
		//선언과 할당 동시에 하기
		int[] arr = new int[5];
		
			/*
			 3. 값 대입
			 	배열명[인덱스] = 값;
			*/
		/*
		arr[0] = 0;
		arr[1] = 1; 
		arr[2] = 2; 
		arr[3] = 3;
		arr[4] = 4;
		*/
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr); //arr이라는 박스의 "주소값"이 담겨있음
	}
	
	
	public void method2() {
		int[] iArr = new int[5];
		System.out.println(iArr);
		
		double[] dArr = new double[3];
		System.out.println(dArr);
				/*
				 실제 리터럴값을 곧바로 담을 수 있는 변수는 일반변수. 
				 주소값을 담고 있는 변수는 참조변수(레퍼런스 변수)라고 함.
				*/
	}
	
	
	
	public void method3() {
		int[] iArr = new int[3];  //0~2번 인덱스 
		double[] dArr = new double[4];  //0~3번 인덱스

		for(int i=0; i<4; i++) {
			System.out.println(dArr[i]);
		}
			/*
			 인덱스에 값 초기화를 하지 않아도 값들이 담겨있음. 
			 new를 붙였을 경우 heap 공간에 담기는데, 
			 heap 공간에는 절대 빈공간이 있을 수 없어서
			 공간이 만들어질 때 JVM이 기본적으로 초기화 진행.
			*/
	}
	
	
	public void method4() {
		int[] arr = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = i+1;
		}
		for(int i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr);
		  	//[I@626b2d4a	: [배열의 자료형 + @ + 주소값 16진수]
		System.out.println(arr.hashCode()); 
			// 주소값을 10진수로
		System.out.println(arr.length); 
			// 배열의 길이
	}
	
	
	
	public void method5() {
		//배열을 쓰면서 볼 수 있는 오류 
		//int[] arr; 크기지정(할당)을 까먹은 경우
		int[] arr = null; // 아무것도 참조하고 있지 않음.
		
		//System.out.println(arr);
		// null을 가지고 메소드를 호출하거나, 특정 어딘가에 접근하고자 한다면 항상 오류 발생
		//System.out.println(arr.hashCode());	-NullPointerException
		
		//System.out.println(arr.length);
		//System.out.println(arr[0]);
	}
		
	
	public void method6() {
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		// arr[5] = 5;
		// ㄴ ArrayIndexOutOfBoundsException 배열 범위 벗어남
		// 배열에 부적절한 인덱스 제시시 에러.
			
			/*
			 배열의 단점
			 - 한번 지정한 배열의 크기는 절대 변경 불가.
			 	배열 크기 변경하고자 한다면 다시 만들어야 함.
			*/
		arr = new int[7]; // 이렇게 해서 다시 만들어줘야 함.
				/*
			 	연결이 끊어진 기존 배열은 heap영역에 떠다닐 것.
			 		(참조 되어있지 않으므로) 필요없는 존재.
			 	이는 일정 시간이 지나면 가지비 컬렉터(GC)가 알아서 지워줌.(JAVA 자동 메모리 관리) 
				*/
		// 배열 강제로 삭제시키고자 한다면?
		arr = null; // 아무것도 참조 X 
		System.out.println(arr);
	}
	
	
	
	public void method7() {
			// 배열 선언, 할당, 초기화 동시에.
		//표현법1
		int[] arr1 = new int[] {1,2,3,4};
		//표현법2
		int[] arr2 = {1,2,3,4};
		
		System.out.println(arr1 == arr2);
			// 변수에 담긴 주소값을 비교하기에 false
	}
	
	
	
	public void method8() {
		//1. 크기 10인 정수 배열
		int[] arr = new int[10];
		
		//2. 반복문 활용 값 대입 1~100사이 발생되는 랜덤값.
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() *100+1);
		}
		
		//3. 반복문 활용하여 출력 (arr[x] : xx)
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}

	}
	
	
	
	public void method9() {
		System.out.print("배열의 길이 : " );
		int size = sc.nextInt();
		String[] arr = new String[size];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("좋아하는 과일 입력: ");
			arr[i] = sc.nextLine();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] :" + arr[i]);
		}
	}
	
	
	
	public void method10() {
		// 1. 사용자에게 문자열 입력
		System.out.println("문자열 입력:");
		String str = sc.nextLine();
		
		//+5.
		System.out.println("찾고자 하는 문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 2. 캐릭터char 배열 만들기
		char[] arr = new char[str.length()];
		// 3. 반복문 활용 값 대입.
				/*
				 arr[0] = str.charAt[0]
				 arr[1] = str.charAt[1]...
				*/
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		// +6.
		int count = 0;
		// 4. 출력 arr[i] : k
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] :" + arr[i]);
			// +7.
			if(arr[i] == ch) {
				count++;
			}
		}
		// +8.
		System.out.println("찾은 문자 개수 : " + count);
	}
	
	
	
	
	public void method11() {
		// 1. 사용자에게 배열 길이 입력 받고, 해당 크기 만큼의 정수 배열 만들기.
		// 2. 반복문 활용, 0~마지막 인덱스까지 매번 1~100사이의 랜덤값 발생시켜 대입
		// 3. 반복문을 통해 출력 + 해당 인덱스에 담긴 짝수 값들의 총합 출력
		System.out.println("배열 길이 입력 : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("해당 배열의 짝수의 합 : " + sum);
		
		
	
		
		
	}
}
