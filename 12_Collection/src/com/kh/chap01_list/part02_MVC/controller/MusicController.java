package com.kh.chap01_list.part02_MVC.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_MVC.model.vo.Music;

// 사용자의 요청을 처리해주는 클래스! 
public class MusicController {
		
	private ArrayList<Music> list = new ArrayList<Music>(); // [] 
	
	{ // 초기화 블럭
	list.add(new Music("어텐션","뉴진수"));
	list.add(new Music("헌삥","큰코"));
	list.add(new Music("칠갑산삥","산할아버지"));
	}
		
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
		
	}
	
	//========================
	//전체 곡 조회
	public ArrayList<Music> selectMusic() {
		return list;
		
	}
	
	//================================================
	
	public int deleteMusic(String title) {
		
		int result = 0; //삭제가 되었는지 안되었는지 알려주기 위한 변수
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i); //타이틀의 곡 명이 맞다면 삭제.
				result = 1; //result == 0(삭제할 곡 못찾음)  || == 1 (성공적으로 삭제)
				break; // 조건 성립하였을 때(찾고 삭제후), 반복문 빠져나옴
			}
		}
		
		return result;

	}

	//==========================================
	
	public ArrayList<Music> searchMusic(String keyword) {
		
		//1. 간단 방법
		
		ArrayList<Music> searchList = new ArrayList<Music>(); //배열에 담은 곡 리스트를 담을 박스.
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) { // 리스트 i 번쨰의 타이틀에 키워드가 (contains)포함되어 있다면
				searchList.add(list.get(i));
			}
		}
		
		return searchList;
	}	
		
		// 2. 심화 버전
		
		public ArrayList<Music> searchMusic(int menu, String keyword) {
			ArrayList<Music> searchList = new ArrayList<Music>();

			if (menu == 1) {
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getTitle().contains(keyword)) {
						searchList.add(list.get(i));
					}
				}
			} else if (menu == 2) {
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getArtist().contains(keyword)) {
						searchList.add(list.get(i));
					}
				}
			}
			
			return searchList;
		
		}
		
	//==============================================================

	public int updateMusic(String title, String upArtist, String upTitle) {
		
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) { // 수정하고자 하는 곡이 내가 쓴 곡과 같다면
				list.get(i).setTitle(upTitle); // 곡명
				list.get(i).setArtist(upArtist); // 가수명 바꿀꺼야
				result = 1;
				break;
			}
		}
		
		return result;
		
	}
		
		
		
		
	
	
	
	
}
