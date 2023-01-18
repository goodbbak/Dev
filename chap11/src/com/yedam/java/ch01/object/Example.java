package com.yedam.java.ch01.object;

import java.util.HashMap;
import java.util.Map;

public class Example {
	public static void main(String[] args) {
		Member m1 = new Member("홍길동");
		Member m2 = new Member("신용권");
		Member m3 = new Member("신용권"); //메모리에 3개의 인스턴스가 생성됨
		
		if(m1 == m2) {
			System.out.println("m1과 m2는 동등합니다.");
		}else {
			System.out.println("m1과 m2는 동등하지 않습니다."); //ㅇ 주소값이 다름
		}
		
		if(m3 == m2) {
			System.out.println("m3과 m2는 동등합니다.");
		}else {
			System.out.println("m3과 m2는 동등하지 않습니다."); //ㅇ 주소값이 다름
		}
		
		if(m2.equals(m3)) {
			System.out.println("m3과 m2는 동등합니다."); //Member에서 equals메소드 오버라이딩해서 이거나와짐
		}else {
			System.out.println("m3과 m2는 동등하지 않습니다."); 
		}
		
		Map<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(new Key(1), "홍길동");
		
		String name = hashMap.get(new Key(1));
		System.out.println(name);
		System.out.println();
		
		String message = "오늘은 수요일입니다.";
		System.out.println(message);
		System.out.println(m1);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
