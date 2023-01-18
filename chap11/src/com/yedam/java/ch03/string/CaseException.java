package com.yedam.java.ch03.string;

public class CaseException {
	public static final String DATA = "HELLO WORLD!";
	public static void main(String[] args) {
		String inputData = "Hello World!";
		String newInputDataL = inputData.toLowerCase(); //소문자로 바꿈
		String newInputDataU = inputData.toUpperCase(); //대문자로 바꿈
		
		if(newInputDataU.equals(DATA)) {
			System.out.println("있는 데이터입니다.");
		} else {
			System.out.println("없는 데이터입니다.");
		}
		
		//대소문자 구분없이 비교하는 메소드
		if(inputData.equalsIgnoreCase(DATA)) {
			System.out.println("있는 데이터입니다.");
		} else {
			System.out.println("없는 데이터입니다.");
		}
		
		
	}
}
