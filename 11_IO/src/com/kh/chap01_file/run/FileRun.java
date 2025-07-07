package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {

		/*
		 메모리는 휘발성(저장하지 않으면 날라감)
		  : 기록하기 위해 파일이 필요함.
		  
		  file이 만들어지는 과정
		  java.io.File클래스 (예외처리 필수)
		  
		  File f1 = new File(); // 기본생성자 없음.
		*/
		
		try {
			//1. 경로지정을 하지 않았을 경우 현재 project폴더에 파일 생성
			File f1 = new File("test.txt");
			f1.createNewFile(); // 이 메서드까지 실행해야만 실제 파일 생성
			
			//2. 존재하는 폴더에 파일 생성(경로지정)
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
			
			//3. 폴더 먼저 만든 후 파일까지 만들어지게
			File tempFolder = new File("D:\\tempFolder");
			tempFolder.mkdir();
			File f3 = new File("D:\\tempFolder\\test.txt");
			f3.createNewFile();
			
			System.out.println(f1.exists()); //파일이 존재하나? 안하냐? T/F
			System.out.println(new File("ttt.txt").exists());
			
			File Folder = new File("parent");
			Folder.mkdir();
			File f4 = new File("parent\\person.txt");
			f4.createNewFile();
			//File의 각종 메서드
			System.out.println("파일명 : " + f4.getName());
			System.out.println("절대경로 : " + f4.getAbsolutePath());
			System.out.println("파일 용량 : " + f4.length());
			System.out.println("상위 폴더 : " + f4.getParent());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	/*
	 프로그램 상의 데이터를 외부 매체로 출력한다거나 외부 매체로부터 입력 받기.
	  반드시 그 외부 매체와 통하는 통로(Stream)를 만들어야 함.
	 
	 1.특징
	  - (개울), 한 방향으로 흐름 : 단 방향 (입력 출력 동시에 되는 통로는 없음.)
	    입/출력 다발적으로 한다면 입력용 스트림, 출력용 스트림 따로 만들어야 함. 
	  - 선입선출(FIFO) : 먼저 들어간 데이터가 먼저 나옴. // First In First Out = FIFO
	  	시간지연 이라는 문제가 생길 수 있음.
	 
	 2. 구분
	  1) 통로 사이즈 
	   - 바이트 스트림 : 1byte(좁은 통로) -> InputStream / OuputStream
	   - 문자 스트림 : 2byte (넓은 통로) -> ~Reader     / ~Writer
	  2) 외부 매체 직접 연결 유무
	   - 기반 스트림 : 외부매체와 집접적으로 연결되는 통로
	   - 보조 스트림 : 보조 역할만 하는 통로 (속도 빠르게 하거나, 성능을 향상해줌)
	   		ㄴ 단독 사용 불가, 기반 스트림이 반드시 있어야 함.
	   		
	  => 첨부 파일 기능 구현할 때 꼭 필요한 개념
	*/
	
	
	
	
	
	
	

}
