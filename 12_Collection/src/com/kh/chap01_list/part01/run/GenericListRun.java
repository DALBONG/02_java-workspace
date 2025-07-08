package com.kh.chap01_list.part01.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01.model.vo.Music;

public class GenericListRun {

	public static void main(String[] args) {

		ArrayList<Music> list = new ArrayList<Music>();
		
		list.add(new Music("눈의꽃", "박효신")); 
		list.add(new Music("새삥", "지코"));
		//System.out.println(list); // 다른 타입 담기 불가
		
		
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		System.out.println(list);
		
		List<Music> sub = list.subList(0, 2);
		
		list.addAll(sub);
		System.out.println(list);
		
		Music m = list.get(0);
		System.out.println(m);
		System.out.println(list.get(0).getArtist());
		
		
		/*
		 제네릭<>을 사용하는 이유
		  1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있음.
		  2. 컬렉션에 저장된 객체를 꺼내서 사용할 떄 매번 형변환 하는 절차를 없애기 위해.
		  3. 
		 */
		
		
		
	}

}
