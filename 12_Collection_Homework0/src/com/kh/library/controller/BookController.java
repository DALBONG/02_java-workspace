package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager {
	
	@Override
	public void addBook(Book nBook) {
		bookList.add(nBook);
	}

	@Override
	public ArrayList<Book> getAllBook() {
		return bookList;
	}

	@Override
	public Book searchBookBybNo(String bNo) { 
		ArrayList<Book> searchbNo = new ArrayList<Book>();
		for(Book b : bookList) {	 // 순차적 접근할 값을 담을 변수 : 순차적으로 접근할 배열 bookList
			if(b.getbNo().equals(bNo)) {
			return b;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		ArrayList<Book> searchTitle = new ArrayList<Book>();
		for(Book b : bookList) {
			
		}
		
		return null;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> result = new ArrayList<Book>();
		for(Book b : bookList) {
			if(!(b instanceof Magazine)) {
				result.add(b);	
			}
		}
		return result;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> result = new ArrayList<Book>();
		for(Book b : bookList) {
			if(b instanceof Magazine) {
				result.add(b);
			}
		}
		return result;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		return null;
	}

	@Override
	public int getTotalPrice() {
		return 0;
	}

	@Override
	public int getAvgPrice() {
		return 0;
	}

	// 모든 데이터 저장
	private ArrayList<Book> bookList = new ArrayList<Book>();
	
		//Run의 bList를 전달받는 메서드 만들기
		public void setBookList(ArrayList<Book> books) {
			this.bookList = books;
		}
		 
	
	
}
