package com.kh.chap03_map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {

	public static void main(String[] args) {
		
		// Properties : Map계열의 컬렉션. => key+value 세트로 저장
		// HashMap과의 차이점 
		  // - Properties는 k값도, v값도 모두 String
		
		Properties prop = new Properties();
		
		/*
		prop.put("다이제", new Snack("초코맛", 1500));
		prop.put("새우깡", new Snack("짠맛", 500));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		*/
		
		// 하지만, Properties를 사용하는 경우, 주로 properties에 담긴 것들을 파일로 출력 or 입력 받아올 때 사용
			// 즉, properties에서 제공하는 store(), load()메소드를 사용하기 위해.
		
		/*
		try {
			prop.store(new FileOutputStream("test.properties"), "properties Test");
			// ClassCastException
			// 내부적으로 store 실행시 Properties에 담겨있는 키 + 밸류 세트로 String으로 
			//  밸류 -> 객체타입으로 적었기 때문에 형변환 불가
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		// 파일 입출력 하고 싶으면 put이 아닌, 다른 메소드를 사용.
		
		//1. setProperty(String key, String value);
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		System.out.println(prop); // 키값 중복X 중복시 덮어씌워짐, 저장 순서 유지X
		
		//2. getProperty(String key) : String
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("새우깡")); // 존재하지 않는 키값 제시시 null 반환
		
		try {
			//3. store(OupputStream os, String comments) : properties에 담겨있는 key value값들을 파일로 출력
			prop.store(new FileOutputStream("test.properties"), "차차차차차차");
			
			//4. storeToXML(OutputStream os, String commentes) : properties에 담겨있는 key value값들을 파일로 출력
			prop.storeToXML(new FileOutputStream("test.xml"), "프로테스트");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		
		

	}

}
