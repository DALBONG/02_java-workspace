package com.kh.array;

import java.util.Scanner;

public class C_Practice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		int[] arr = new int[5]; //선언과 동시에 할당. 
		
		System.out.println("5개의 정수를 입력하시오");
		for(int i=0; i<5; i++) {
			System.out.println("정수" + (i + 1) + " : ");
			int num = sc.nextInt();
			sc.nextLine();
			arr[i] = num;
		}
		System.out.println("입력한 정수 출력 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public void practice2() {
		
		int[] arr = {9, 3, 4, 5, 6, 6};
		
		System.out.println(arr);
			
	}
	
	
	public void practice3() {
		
		String[] arr = {"김달봉", "달봉이", "윤해피"};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	public void practice4() {
		
		int[] arr = {5, 10, 7, 3, 8};	
		int sum = 0;
		
		for(int i=0; i<=4; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
	}
	
	
}
