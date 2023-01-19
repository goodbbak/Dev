package com.yedam.java.ch01.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		list.add("Java"); //0번에 있지만 5번에 또 들어감 0번과 같은 주소를 참조
		
		//Java JDBC Database Servlet/JSP iBATIS 순서로 리스트에 저장
		
		int size = list.size();
		System.out.println("총 객체수 :"+ size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2:"+skill);
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			System.out.printf("%d:%s\n",i,list.get(i));
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("Java"); //앞부터 Java를 찾아서 찾으면 제거하고 끝
		
		for(String data : list) { //향상된 for문
			System.out.println(data);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
