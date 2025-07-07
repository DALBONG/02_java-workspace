package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDao {
	//Data Access object

	/*
	 "byte 기반 스트림"으로 데이터 입출력 해보기
	 - 바이트 스트림 : 1byte단위로 전송하는 통로(좁은 통로로, 한글은 깨짐)
	 -  기반 스트림 : 외부매체와 직접적으로 연결되는 통로
	 
	 xxxInputStream : xxx매체로부터 데이터를 입력받는 통로
	 	(외부 매체로 부터 데이터를 읽어올게!)
	 xxxPutputStream : xxx매체로부터 데이터를 출력하는 통로
	 	(외부매체로부터 데이터를 내보내겠다.)
	*/
	
	//프로그램 --> 외부매체(파일) (출력 : 프로그램 상의 데이터를 파일로 내보내기 즉, 파일 
	public void fileSave() {
		/*
		FileOutputStream : 파일과 직접 연결해서 1바이트 단위로 출력
		
		1. 스트림 생성 (통로 만들기)
		2. 스트림으로 데이터를 출력(메소드 활용)
		3. 다 사용 후, 스트림 반납! (반드시!)
		*/
		
		FileOutputStream fout = null;
		try {
			//1. FileOutputStream 객체 생성 -> 해당 파일과의 연결 통로 만들어짐 
			fout = new FileOutputStream("a_byte.txt"); // 해당 파일이 없어도, 해당 파일 만들어주고 통로 연결
			
			//2. 파일에 데이터를 출력하고자 할 때 write메소드 사용
			  // 숫자를 출력하든 실상 파일에 기록이 되는건 문자로 기록 (아스키 코드)
			fout.write(97); // 'a'가 저장
			fout.write('b'); // 'b'가 저장
			fout.write('퀭'); // 한글은 2byte짜리로, 깨져서 저장됨 
			
			byte[] arr = {99, 100, 101};
			fout.write(arr); //cde 문자열 저장
			
			fout.write(arr, 1, 2);//de 저장
			
			//3. 스트림 다 이용후 반납하기(반드시)
			// fout.close(); // 위에서 write메소드 실행시 에러 발생되었을 경우 -> catch블럭 실행 후 빠져나감.(반납코드 실행X)
			 					// 반드시 수행해야 하는 구문은 finally{}에 기술
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {//안에 작성된 코드는 예외가 발생되어도 마지막에 무조건 실행후 빠져나감
			try {
				// 3. 스트림 이용 후 반납. (반납코드 작성 후, 오류에 try/catch)
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//=======================================================================
	public void method2() {
		//프로그램 <--- 파일 (입력 : 파일로부터 데이터 가져오기)
		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력 받는 스트림.
		
		//1. 스트림 생성(통로 만들기)
		//2. 스트림을 통해 입력 받기 (메소드 활용)
		//3. 사용 끝난 메소드 반납
		
		FileInputStream fin = null;
		try {
			//1. FileInputStream 객체 생성 => 해당 파일과 연결 통로 만들어짐
			fin = new FileInputStream("a_byte.txt");
			
			//2. 파일로부터 데이터를 읽어들이기 : read()
				//1byte 단위로 하나씩 읽어옴 / 반환형이 int (숫자로 읽어들임)
			/*
			System.out.println(fin.read()); // 오류는 캐치 클라우즈 실행
			System.out.println(fin.read()); 
			System.out.println(fin.read()); 
			System.out.println(fin.read()); 
			System.out.println(fin.read()); 
			System.out.println(fin.read()); 
			System.out.println(fin.read()); 
			System.out.println(fin.read()); 
			System.out.println(fin.read()); // 파일의 끝을 만날 때 -1 반환.
			System.out.println(fin.read()); 
			*/
			
			/* 반복문 수행시, read메소드가 2번씩 실행되기 때문에 건너뛰어 읽어 들임
			while(fin.read() != -1) {
				System.out.println(fin.read());
			}
			*/
			//해결방법1.
/*			while(true) {
				int value = fin.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);
			}
*/
			//해결방법2. 권장 방법
			int value = 0;
			while((value = fin.read()) != -1) { //밸류의 값이 -1이 아닐때,
				System.out.println(value);
			}
	

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
	
	
	
	
	

}
