package com.kh.chap01_list.MVC2.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.chap01_list.MVC2.controller.MusicController2;
import com.kh.chap01_list.MVC2.model.vo.Music2;

public class MusicMenu2 {
	
	private Scanner sc = new Scanner(System.in);
	private MusicController2 mc = new MusicController2();
	
	// 0.메인 화면 구성
	public void mainMenu() {
		
		while(true) {
			System.out.println("\n=== Wellcome! 밤사 ===");
			System.out.println("1. 곡 전체 조회");
			System.out.println("2. 새로운 곡 추가");
			System.out.println("3. 특정 곡 삭제");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.println(">> 메뉴 선택!");
			
			int menu = 0;
			try {
				menu = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("숫자를 입력하여라");
			}
			sc.nextLine(); // nextInt했으니 nextLine으로 개행.
			
			
			switch(menu) {
				case 1 : fullListMusic();
					break;
				case 2 : incertMusic();
					break;
				case 3 : deleteMusic();
					break; 
				case 4 : searchMusic();
					break;
				case 5 : updateMusic();
					break;
				case 0 :
					System.out.println("프로그램 종료했음, BBye!");
					return; // 종료하였으니, return으로 while문에서 빠져나오기.
				default : //메뉴에 없는 것 선택시 실행할 구문
					System.out.println("숫자를 입력하라!");
			}
		}
	}
	
	//==================================================================
	// 1. 곡 전체 조회 메뉴
	/**
	 * 1. 전체 곡 조회
	 */
	public void fullListMusic() {
		System.out.println("\n⎝ᑒ⎠⎝ᑒ⎠ 전체 곡 리스트 ⎝ᑒ⎠⎝ᑒ⎠");
		ArrayList<Music2> list = mc.fullListMusic();
		
		if(list.isEmpty()) {
			System.out.println("현재 존재하는 곡이 없다☹︎");
		}else {
			for(Music2 m: list) {
				System.out.println(m);
			}
		}
	}
	//====================================================================
	// 2. 곡 추가 메뉴
	/**
	 * 2. 곡 추가
	 */
	public void incertMusic() {
		System.out.println("\n⎝⍥⎠⎝⍥⎠ 새로운 곡 추가 ⎝⍥⎠⎝⍥⎠");
		System.out.println("곡 명 : ");
		String title = sc.nextLine();
		
		System.out.println("아티스트 명 : ");
		String artist = sc.nextLine();
		
		mc.incertMusic(title, artist);
		System.out.println("곡 추가 성공! ㋡");
	}
	
	
	//====================================================================
	// 3. 곡 삭제 메뉴
	public void deleteMusic() {
		System.out.println("\n⎝⍢⎠⎝⍢⎠ 삭제할 곡 ⎝⍢⎠⎝⍢⎠");
		System.out.print("삭제할 곡 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		if(result == 1) { //컨트롤러에서 반환값이 1일때(삭제했을 때)
			System.out.println("삭제 성공! ㋡");
		}else {
			System.out.println("삭제 할 곡이 없어! ☹︎");
		}
	}
	
	
	//====================================================================
	// 4. 곡 검색 메뉴
	public void searchMusic() {
		// 1) 간단히!
		
		System.out.println("\n✌︎ -᷅ ̫̈-᷄ ✌︎ 검색할 곡 키워드 ✌︎ -᷅ ̫̈-᷄ ✌︎");
		String keyword = sc.nextLine();
		
		ArrayList<Music2> searchList = mc.searchMusic(keyword);
		System.out.println(searchList);
	}
	
	//====================================================================
	// 5. 곡 수정 메뉴
	public void updateMusic() {
		System.out.println("\n ⎝㋡⎠⎝㋡⎠ 특정 곡 수정 ⎝㋡⎠⎝㋡⎠");
		System.out.println("수정 곡 명 : ");
		String title = sc.nextLine();
		
		System.out.println("수정 내용 (곡 명) : ");
		String upTitle = sc.nextLine();
		
		System.out.println("수정 내용 (아티스트 명) : ");
		String upArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, upTitle, upArtist);
		if(result > 0) { // result값이 0보다 높으면 (사실상 1밖에 없음) 수정 성공 반환값 == 1
			System.out.println("수정 성공! ⎝㋡⎠");
		}else {
			System.out.println("수정 할 곡 못찾았음 ☹︎");
		}
		
		
	}
	
	
	
	
}
