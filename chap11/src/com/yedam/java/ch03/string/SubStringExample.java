package com.yedam.java.ch03.string;

public class SubStringExample {
	public static void main(String[] args) {
		String ssn = "880815 1234567";
		
		String firstNum = ssn.substring(0,6); //인덱스0~6'앞'까지(6미포함) 헷갈리기쉽
		System.out.println("생년월일 :"+firstNum);
		
		String secondNum = ssn.substring(7); //7번부터(포함) 모두
		System.out.println("뒷자리:"+secondNum);
		
		String[] numList = ssn.split(" ");
		for(String num : numList) {
			System.out.println(num);
		}
	}
}
