package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		
		/*
		  for each문(향상된 for문)
		  : 배열 or 컬렉션과 함께 사용 됨 
		  - 배열 or 컬렉션의 0번~마지막 인덱스까지 순차적으로 모두 접근할 목적일 때
		  
		  [표현법]
		  for(순차적으로 접근할 값을 담을 변수 선언 : 순차적으로 접근할 배열명 또는 컬렉션 명){
		  	반복적으로 실행할 코드;
		  }
		*/
		
		for(int value/*자율지정 가능*/:arr) { // value=arr[0] -> value=arr[1] -> value=arr[2]
			System.out.println(value);
		}
		
		
		// 칸 생성
		Phone[] phones = new Phone[3]; 
		// 객체 생성
		phones[0] = new Phone("폴더폰", "LG", 290000, "1"); 
		phones[1] = new Phone("판다폰", "삼성", 543000, "s24");
		phones[2] = new Phone("아이폰", "애플", 899000, "18pro");
		// 
		phones[1].setSeries("s18엣지");
		int total = 0;
		for(Phone p : phones){ //p=phones[0] -> [1] -> [2] 
			total += p.getPrice();
			System.out.println(p.information());
		}
		System.out.println("총합계 :" + total);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구매하고자 하는 핸드폰 :");
		String buy = sc.nextLine();
		
		for(Phone p : phones) {
			if(p.getName().equals(buy)) {
				System.out.println("가격:" + p.getPrice());
			}
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
