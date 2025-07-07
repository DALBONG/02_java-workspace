package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {

	// 프로그램 ->파일(출력)
	public void fileSave() {
		Phone p1 = new Phone("아이폰", 2000000);
		Phone p2 = new Phone("갤럭시", 1500000);
		Phone p3 = new Phone("중국폰", 260000);
		
		// 객체 단위로 출력해줄 수 있는 보조스트림 필요
		// Objectxxxx : Object는 Writer나, Reader 가 없음
		 
		// FileOutputStream : 파일과 연결해서 1byte 단위로 출력할 수 있는 기반스트림
		// ObjectOutputStream : 객체단위로 출력할 수 있도록 도움을 주는 보조 스트림
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d_phone.txt"))) {
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_phone.txt"))){
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일 다 읽었음"); // EOF -> end of file 파일 끝 만나는 순간 예외 발생
		} catch (IOException e) { 
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
