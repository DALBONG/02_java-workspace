package com.kh.chap01.oneVSmany.run;

import com.kh.chap01.oneVSmany.model.vo.Book;

import com.kh.chap01.oneVSmany.model.vo.Book;

import java.util.Scanner;


public class ObjectArrayRun {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Book[] books = new Book[3];
		
		for(int i=0; i<books.length; i++) {
			System.out.println(i+1 + "번쨰 도서 정보 입력");
		
		System.out.print("도서명:" );
		String title = sc.nextLine();
		
		System.out.print("저자명:");
		String author = sc.nextLine();
		
		System.out.println("가격:");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("출판사:");
		String publisher = sc.nextLine();
		
		books[i] = new Book(title, author, price, publisher);
		}
		
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].information());
		}
		
		//도서 제목으로 검색하는 서비스
		System.out.println("검색 책 제목:");
		String search = sc.nextLine();
		
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
			}
		}
		

	}

}
