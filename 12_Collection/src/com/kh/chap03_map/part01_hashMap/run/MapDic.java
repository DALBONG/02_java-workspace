package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Scanner;

public class MapDic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		while(true) {
			System.out.print("찾고싶은 단어는?");
			String word = sc.nextLine();
			
			if(word.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			String kor = dic.get(word);
			if(kor == null) {
				System.out.println(word + "는 없는 단어야!");
			}else {
				System.out.println(kor);
			}
			
		}

	}

	
	
	
	
}
