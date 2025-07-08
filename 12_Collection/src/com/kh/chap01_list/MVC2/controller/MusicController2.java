package com.kh.chap01_list.MVC2.controller;

import java.util.ArrayList;

import com.kh.chap01_list.MVC2.model.vo.Music2;

public class MusicController2 {

	private ArrayList<Music2> list = new ArrayList<Music2>();
	
	{ // 초기화 블럭
	list.add(new Music2("한국을 빛낸 100명의 위인들", "애국자"));
	list.add(new Music2("한국을 빚낸 100명의 친일파", "매국노"));
	list.add(new Music2("한국을 빛낼 100명의 인재들", "위인재"));
	} //초기화 진행 후, 
	
	//====================================================================
	// 1. 전체 곡 조회
	public ArrayList<Music2> fullListMusic() {
		return list;
	}

	//====================================================================
	//2. 곡 추가
	public void incertMusic(String title, String artist) {
		list.add(new Music2(title, artist));
	}
	
	//====================================================================
	//3. 특정 곡 삭제
	public int deleteMusic(String title) { // 3) 반환 값은 정수로, 반환타입 수정.(void -> int)
		
		int result = 0;
		 for(int i=0; i<list.size(); i++) { // 1) for문 삭제 조건 작성 
			 if(list.get(i).getTitle().equals(title)) {//리스트에 있는 곡명이 쓴 것과 일치한다면
				 list.remove(i); //삭제
				 result = 1; // 삭제시 1/ 삭제할 곡 못찾을 경우 0
				 break; // 찾고 삭제 후, 반복문 빠져나오기.
			 }
		 }	 // 2) 반환할 값 return
		 return result; //반환값은 result의 값. 
	}
	
	//====================================================================
	//4. 특정 곡 검색
	public ArrayList<Music2> searchMusic(String keword) { // 3) 반환 타입 수정(박스 내 조건에 맞는 list 반환)
		
		// 1) 간단 방법
		ArrayList<Music2> searchList = new ArrayList<Music2>(); // 배열에 담을 곡 리스트를 담을 박스
		for(int i=0; i<list.size(); i++) { // 1) for문 작성
			if(list.get(i).getTitle().contains(keword)) {//리스트 i번째의 타이틀 키워드가 (contains)포함되어 있다면
				searchList.add(list.get(i)); //
			}
		}
		return searchList; // 2)조건 일치 시 반환

	}

	
	//====================================================================
	//5. 특정 곡 수정
	public int updateMusic(String title, String upTitle, String upArtist) {
			//ㄴ> 3) 보낼 결과가 int형이니깐 반환타입 수정해야해
		int result = 0; 
		for(int i=0; i<list.size(); i++) { // 1) 조건문 작성
			if(list.get(i).getTitle().equals(title)) { //쓴 곡 명이 일치하다면,
				list.get(i).setTitle(upTitle); //바꿀 곡 명
				list.get(i).setArtist(upArtist); //바꿀 아티스트 명
				result = 1; // 바꾸고 1값 내뱉을꺼야
				break; //그리고 멈출꺼야.
			}
		}
		return result; // result값 돌려보낼꺼야.
	}
	
	
}
