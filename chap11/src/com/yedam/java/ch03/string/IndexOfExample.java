package com.yedam.java.ch03.string;

public class IndexOfExample {
	public static void main(String[] args) {
		String subject = "혼자 공부하는 자바, 신용권";
		
		int location = subject.indexOf("공부");
		System.out.println("'공부' 의 위치:"+location);
		
		if(subject.indexOf("자바") == -1) { //없으면 -1 return하는게 디폴트 값
			System.out.println("자바라는 단어가 포함 안 됨");
		} else {
			System.out.println("자바 단어 포함");
		}
		
		if(subject.indexOf("자바") > -1){ //위 방식이랑 똑같음
			System.out.println("자바라는 단어가 포함 안 됨");
		} else {
			System.out.println("자바 단어 포함");
		}
		
		
		
		
		
		
		
	}
}
