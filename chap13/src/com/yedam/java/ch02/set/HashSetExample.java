package com.yedam.java.ch02.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();//Set => 중복없고 인덱스 없는 보따리 
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Database");
		set.add("iBATIS");
		boolean num = set.add("Java");
		System.out.println(num);
		
		int size = set.size();
		System.out.println("총 객체 수 :"+size); //6개의 객체 넣었는데 5가 나옴 Java가 겹쳐서 Set은 중복 불가 Set에서 아마 equals가 재정의 돼있을거임
		System.out.println();
		
		Iterator<String> iterator = set.iterator(); //iterator() => 보따리에서 랜덤 하나 뽑기
		while(iterator.hasNext()) { //hasNext() 다음 올 값이 있는지 체크하는 있으면 true라 while문 계속 진행 or 향상된 for문으로 안에 값 뽑기 가능
			String element = iterator.next();
			System.out.println("\t"+element); 	//저장된 순서대로 출력안하고 제멋대로 나옴
		}
		System.out.println();
		
		set.remove("JDBC"); //Set은 인덱스 없으니 그냥 값 넣어서 삭제하면 됨
		set.remove("iBATIS");
		
		for(String skill : set ) {
			System.out.println("\t"+skill);
		}
		System.out.println();
		
		set.clear(); //인스턴스는 존재한느데 내부의 값을 삭제
		if(set.isEmpty()) {
			System.out.println("내부가 비었습니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
