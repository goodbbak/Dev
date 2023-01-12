package com.yedam.object;

public class MethodA {
	//필드
	
	
	//생성자
	
	
	//메소드 이름 같아도 여러개 생성가능 System.out.println()안에 다양한 타입 오는거 생각하면 쉬움
	int methodA() {
		return 0;
	}
	
	int method(int a) {
		return a;
	}
	
	int methodA(String a) {
		return 0;
	}
	
	int methodA(int a , String b) {
		return a;
	}
	
	int methodA( String a ,int b ) {
		return b;
	}
	
	//정사각형의 넓이 
	double areaRectangle(double width) {
		return width*width;
	}
	//직사각형의 넓이 
	double areaRectangle(double width,double height) {
		return width*height;
	}
	
	
	
	
	
	
	
	
	
	
	
}
