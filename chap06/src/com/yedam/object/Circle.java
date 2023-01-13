package com.yedam.object;
//순서
//클래스 선언
//static필드(public)
//instance필드(private)
//생성자(public)
//getter,setter(public)
//메서드(public)일부는private도있음
public class Circle {	
	//static으로 고정하면 class가 만들어짐과 동시에 메모리에 static저장소를 따로 두고 데이터를 저장
	//만들어진 인스턴스들은 static저장소를 공유
	//final넣으면 변경불가		
	static final double pi=3.141592;
	private double r; //캡슐화
	
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	//
	public Circle(){
		
	}
	Circle(double r){
		this.r = r;
	}
	
	
	
	//
	double area() {
		double result = pi*r*r;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
