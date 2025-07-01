package com.kh.chap01.oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01.oneVSmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//방법1. 기본 생성자로 생성한 후 값 초기화
	/*
	Book bk = new Book();
	bk.setTitle("자바의 정석");
	bk.setAuthour("김달봉");
	bk.setPrice(10000);
	bk.setPublisher("kh출판사");
	*/
	
		
		//방법2. 매개변수 생성자를 통해 객체 생성, 동시에 값 초기화
//	Book bk = new Book("자바의 정석", "김달봉", 10000, "kh출판사");
	
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("도서명:" );
		String title = sc.nextLine();
		
		System.out.print("저자명:");
		String author = sc.nextLine();
		
		System.out.println("가격:");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("출판사:");
		String publisher = sc.nextLine();
		
		Book bk = new Book(title, author, price, publisher);
		
		System.out.println(bk.information());
		*/
		
		
		// 3권
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		for(int i=0; i<3; i++) {
			System.out.println(i+1 + "번째 도서 정보 입력");
			
			System.out.print("도서명:" );
			String title = sc.nextLine();
			
			System.out.print("저자명:");
			String author = sc.nextLine();
			
			System.out.println("가격:");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("출판사:");
			String publisher = sc.nextLine();
			
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			}else if (i == 1){
				bk2 = new Book(title, author, price, publisher);
			}else {
				bk3 = new Book(title, author, price, publisher);
			}
		}
		
		// 전체 도서 정보 출력
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		
		//도서 제목으로 검색하는 서비스
		System.out.print("검색할 책제목:");
		String search = sc.nextLine();
		
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		}
		if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}
		if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
		}
		
	}
}
