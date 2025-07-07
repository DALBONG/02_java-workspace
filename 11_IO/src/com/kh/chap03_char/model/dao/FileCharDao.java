package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
		/*
		 문자 기반 스트림을 가지고 입출력 해보기
		 
		 - 문자 스트림 : 데이터를 2byte 단위로 전송하는 통로 (넓음)
		 - 기반 스트림 : 외부매체와 직접적으로 연결되는 통로
		   ㄴ xxxReader(입력용) / xxxWriter(출력용)
		 
		*/
	
		//프로그램 --> 파일 (출력)
		public void FileSave() {
			//FileWriter : 파일로 데이터를 2바이트 단위로 출력할 수 있는 스트림.
			FileWriter fw = null;
			try {
				//1. FileWriter 객체 생성 
				fw = new FileWriter("b_char.txt", true); //해당 파일이 없으면, 파일 생성후 연결.
					// 두번째 인자 값이 트루면 파일을 이어서 씀.
					// 두번째 인자 값이 false면 파일을 새로 쓰겠다.
				
				//2. write메소드를 이용해서 데이터 출력
				fw.write("와! IO재밌다! ...ㅋ");
				fw.write("bbbb");
				fw.write("ㅋㅋㅋ");
				fw.write("\n");
				
				char[] arr = {'a', 'p', 'p', 'l', 'e'};
				fw.write(arr);
				
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
	
		
		//프로그램  <-- 파일 (입력)
		public void fileRead() {
			//FileReader : 파일로부터 데이터를 2byte단위로 입력 받을 수 있는 스트림 
			FileReader fr = null;
			
			try {
				//1.FileReader 객체 생성
				fr = new FileReader("b_char.txt");
				
				//2. read 메소드 통해 읽어들이기 (정수값)
				  //파일의 끝을 만나는 순간 -1반환
				
				int value = 0;
				while((value = fr.read()) != -1);
				System.out.println((char)value);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
				//3. 반납
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	
}
