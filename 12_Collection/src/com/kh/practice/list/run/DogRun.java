package com.kh.practice.list.run;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.model.vo.Dog;

public class DogRun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Dog> list = new ArrayList<Dog>();
		// 5마리의 강쥐 이름을 입력 받아서 ArrayList에 저장한 후에
		
		for(int i=0; i<4; i++) {
			System.out.println((i+1)+"번째 강쥐 이름 입력 : ");
			String name = sc.nextLine();
			System.out.println("강쥐 나이 입력 : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("강쥐 종 입력 : ");
			String kind = sc.nextLine();
			return ;
		}
		System.out.println(list);
		
		
		
		
		
		// 이들 중 '구' 라는 이름이 포함된 강쥐를 모두 출력하시오.
		
		// * 처음에는 4마리의 강쥐 ArrayList 생성 후 (크기 4짜리)
		
		// 2번 인덱스에 마지막 강쥐를 추후에 추가 할 것!(끼워넣기)
		
		
		// + 구 포함한 이름을 가진 강쥐가 몇마리 인지 출력하시오.
		
		
		
	}

}
