package com.kh.chap04_assist.part01_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BurfferDao {

	/*
	 보조스트림 : 기반 스트림만으로 부족했던 성능을 보다 향상 시켜주는 스트림
	 			기반스트림에서 제공하지 않는 추가적 메소드 제공/ 데이터 전송 속도 향상 
	 			>> 외부 매체와 직접적으로 연결되는 스트림 X, 
	 			-단독 사용 불가(반드시 기반 스트림과 함께 사용)
	 */
	
	public void fileSave() {
		  //FileWriter 기반스트림으로
		  //파일과 직접적으로 연결해서 2바이트 단위로 출력할 수 있는 스트림
		//BufferedWriter : 버퍼라는 '공간'을 제공해주는 보조 스트림 (속도 향상)
		
		//BufferedWriter bw = new BufferedWriter("c_buffer.txt"); 단독사용 불가!
		
		/*
		BufferedWriter bw = null;
		try {
			//1. 기반스트림 먼저 사용.
			  //FileWriter fw = new FileWriter("c_buffer.txt");
			
			//2. 보조 스트림 생성
			  //BufferedWriter bw = new BufferedWriter(fw);
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			//3. write 메소드 통해 출력
			bw.write("안녕하세요!\n");
			bw.write("반갑습니다?");
			bw.newLine();// 추가적인 메소드 활용(개행)
			bw.write("저리 가세요");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		
		//try ~ with ~ resource 구문으로 자원 반납까지 더 간단하게 작업
			// jdk 1.7버전 이상.
		/*
		 try(try블럭 내 스트림객체 생성 구문){
		 
		 }catch(예외 클래스 e){
		 
		 }
		*/
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
			bw.write("안녕하세요!\n");
			bw.write("반갑습니다?");
			bw.newLine();// 추가적인 메소드 활용(개행)
			bw.write("저리 가세요");
			//buffer라는 공간에 계속 쌓아놨다가 한번에 출력 -> 속도 향상에 좋음.
		} catch (IOException e) {
			e.printStackTrace();
		}//finally 안해도 됨! 
	}
	
	
	//프로그램 <--- 파일(입력)
	public void fileRead() {
		
		//FileReader : 파일과 연결해서 2바이트 단위로 데이터를 입력받을 수 있는 기반 스트림
			//BufferedReader : 속도 향상, 도움이 되는 보조 스트림
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
			
			//System.out.println(br.read()); //int형 반환
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			// 파일 끝 : null 반환
			//System.out.println(br.readLine());
			
		String value = null;
		while((value = br.readLine()) != null) {
			System.out.println(value);
		}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
}
