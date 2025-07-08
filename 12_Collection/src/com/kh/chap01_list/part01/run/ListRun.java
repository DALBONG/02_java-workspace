package com.kh.chap01_list.part01.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01.model.vo.Music;

public class ListRun {

	/*
	 Collection이란?
	  : 자료 구조 개념이 내장되어 있는 클래스로, JAVA에서 제공하는 "자료구조"를 담당하는 "프레임워크".
	  
	  - 자료 구조 : '방대한 데이터'를 보다 효율적으로 관리(데이터 조회, 정렬, 추가, 수정, 삭제 등..)할 수 있도록 도와주는 개념.
	  - 프레임워크 : 이미 만들어져있는 '틀' -> 가져다 쓰면 됨.
	  
	  (컬렉션이 나오기 전)
	   1. 배열의 단점
	     1) 크기 지정을 해야 함. 한번 지정된 크기를 변경할 수 없음.
	        (새로운 값을 추가하고자 한다면 새로운 크기의 배열을 만들고 기존것 복사하는 코드를 직접 기술)
	     2) 배열 중간 위치에 추가한다거나 삭제하는 경우 매번 땡겨주는 복잡한 알고리즘을 직접 기술.
	     3) 한 공간에 한 타입의 데이터만 저장 가능.
	    
	   2. 컬렉션의 장접
	     1) 크기지정 해줄 필요 없음. 지정했다 하더라도, 더 많은 데이터가 들어오면 알아서 사이즈 늘려줌
	        (크기의 제약이 없음.)
	     2) 중간의 값을 추가/ 삭제 하는 경우 값을 땡겨주는 작업을 기술할 필요 X
	        (메서드 호출만으로 알아서 내부적으로 진행 됨)
	     3) 한 공간에 여러 타입의 데이터 저장 가능.
	     
	   * 방대한 데이터들은 단지 보관, 조회만 할 경우 배열을 많이 사용.
	     방대한 데이터들을 보관, 추가, 삭제 등.. 빈번할 경우 컬렉션 많이 사용
	     
	*/
	
	
	public static void main(String[] args) {
		 
		ArrayList list = new ArrayList(3); // 크기지정 할수도 있고 안할 수도 있음. 안하면, 기본크기 10
		System.out.println(list); // [] 비어있음
		 
		// E -> Element : 리스트에 담길 데이터(요소)
		
		// 1. add(E e) : 리스트 공간 끝에 전달될 데이터를 추가시켜주는 메소드
		
			// List는 index 개념이 존재함.
		list.add(new Music("Attention", "뉴진수")); //0번 인덱스
		list.add(new Music("새삥", "지코")); //1번 인덱스
		list.add(new Music("죽일놈", "다듀")); //2번 인덱스
		list.add("가보자고");// -> 추가한 것. 3번 인덱스
	
		// 지정된 크기보다 더 넣어도 오류 X  -> 장점 1 : 크기 제약 없음
		// 다양한 타입 데이터 담을 수 있음   -> 장점 3 : 여러타입 보관 가능
		
		System.out.println(list); // list : 순서유지되어 담김 (0번 인덱스부터)
		
		
		// 2. add(int index, E e) : 직접 인덱스를 지정해서 해당 인덱스 위치에 데이터 추가하는 메소드
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		
		// 중간 위치에 데이터 추가시 복잡한 알고리즘 구현 X  -> 장점 2
		System.out.println(list);
		
		
		// 3. remove(int index) : 해당 인덱스 위치의 데이터 삭제
		list.remove(1);
		System.out.println(list);
		
		
		// 4. set(int index, E e) : 해당 인덱스 위치의 데이터를 새로 전달된 요소(e)로 수정
		list.set(0, new Music("눈의 꽃", "박효신"));
		System.out.println(list);
		
		// **5. size() : 해당 리스트의 사이즈를 반환하는 메소드 (몇개의 데이터가 담겨있는지)
		System.out.println(list.size());
		
		// 6. get(int index) : 해당 인덱스 위치의 객체를 반환
		Music m = (Music)list.get(0); //형변환
		//Music s = (Music)list.get(3);
		
		System.out.println(m);
		System.out.println(((Music)list.get(1)).getTitle());
		
		// 7.subList(int index1, int index2) : 리스트형 반환 -> 추출후 새로운 List로 반환 (substring과 비슷한 개념)
		List sub = list.subList(0, 3);
		System.out.println(sub);
		
		
		// 8. addAlle(Collection c) : 컬렉션을 통째로 뒤에 추가해주는 메소드.
		list.addAll(sub);
		System.out.println(list);
		
		
		// 9. isEmpty() : (booleand형 반환) 컬렉션이 비어있는지 아닌지 묻는 메소드.
		System.out.println(list.isEmpty());
		
		
		// 10. clear() : list안의 내용을 싹 비워주는 메소드
		//list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		
		//반복문을 돌려 순차적으로 출력
		System.out.println("========================================================");
		
			//1. 단순 for문
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=========================================================");
			//2. 향상된 for문
		for(Object ob : list) { 
			System.out.println(ob);
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
