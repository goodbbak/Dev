package com.yedam.java.ch02.set;

import java.util.HashSet;
import java.util.Set;

public class MemeberExample {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member(1000,"홍길동"));
		set.add(new Member(1000,"홍길동"));
		
		System.out.println("총 객체 수 :"+set.size()); //Set은 중복 불가인데 2개의 객체가 만들어짐 왜?=>  equals재정의 전이라 두개의 객체는 서로 다른 주소 => 다른 값으로 인식
	}												 //Member에서 equals재정의 해놓음 이제 객체수 1개로 뜸
																						
	
	
	
}
