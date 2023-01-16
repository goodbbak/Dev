package com.yedam.java.ch01_01;

public class Computer extends Calculator {
	@Override //이거 없어도 자동으로 오버라이딩되지만 밑에 메소드명 오타나면 새로운거 하나 만들까봐
	double areaCircle(double r) {//우클릭 source override로 가능
		System.out.println("Computor 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
	
	
	
	
	

	
}
