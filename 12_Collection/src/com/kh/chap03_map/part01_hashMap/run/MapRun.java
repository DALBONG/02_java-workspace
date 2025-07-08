package com.kh.chap03_map.part01_hashMap.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.xml.sax.HandlerBase;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		
		/*
		 계층 구조
		 	List계열, Set계열의 클래스들은 Collection을 구현한 클래스.
		 	  => 객체를 추가하고자 한다면 공통적으로 add라는 메소드 이용.
		 	
		 	Map 계열은 Collection을 구현한 클래스가 아님.
		 	  => 객체를 추가하고자 한다면 put메소드 이용.(이때, key + value 세트로 담아야 함.)
		*/
		
		//1. put(Key, Value) : 컬렉션에 키 밸류를 세트로 추가시켜주는 메소드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸쵸", new Snack("코딱지맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm); //{키=밸류, 키=밸류}
		  //저장되는 순서 유지 안됨, value값이 중복되어도 키값이 중복안되면 잘 저장됨.
		
		hm.put("새우깡", new Snack("매운맛", 700));
		System.out.println(hm); // 동일한 키값으로 다시 추가하는 경우, value값이 씌워짐.
		
		// 2. get(Object key) : V => 컬렉션에서 해당 키값을 가지는 value값을 반환시켜주는 메소드.
		Snack s = (Snack)hm.get("다이제");
		System.out.println(s);

		// 3. size() : 컬렉션에 담겨있는 객체들의 개수 반환
		System.out.println("몇 개? : " + hm.size());
		
		// 4. replace(K, V) => 컬렉션에서 해당 키값을 찾아 다시 전달한 V의 값으로 수정시켜주는 메소드
		hm.replace("포테이토칩", new Snack("너무 짠 맛", 800));
		System.out.println(hm); // -> put은 원래 값을 없애고 새로 넣는 느낌, replace는 그 값만 수정하는 매커니즘
		
		System.out.println("===========================================");
		
		//ArrayList는 안됨
		//ArrayList list = new ArrayList(hm);
		
		//Iterator 반복자 이용
		//Iterator it = hm.Iterator(); -> 호출 안됨, Map계열에는 해당 메소드 없음.
		
			//Map계열 -> Set계열 후 반복문.
		//1. keySet() 이용하는 방법
			// 1) hm에 있는 key만 뽑아서 Set에 담기(키 집합)
		Set keySet = hm.keySet();
		
			// 2) 1번 과정에서 작업한 keySet을 Iterator에 담기
		Iterator itKey = keySet.iterator();
		
			// 3) 반복문 통해서 뽑기
		while(itKey.hasNext()) {
			String key = (String)itKey.next(); //String자료형으로 형변환
			Snack value = (Snack)hm.get(key); 
			System.out.println(key + "=" + value);
		}
		
		
		
		
		
	}

	
	
	
	
	
	
}
