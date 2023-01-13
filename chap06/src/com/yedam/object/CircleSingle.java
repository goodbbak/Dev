package com.yedam.object;

public class CircleSingle {	
	
	//싱글톤
	static CircleSingle instance = new CircleSingle();
	static CircleSingle getInstance() {
		return instance;
	}
	
	
	//static으로 고정하면 class가 만들어짐과 동시에 메모리에 static저장소를 따로 두고 데이터를 저장
	//만들어진 인스턴스들은 static저장소를 공유
	//final넣으면 변경불가		
	static final double pi=3.141592;
	double r;
	//
	CircleSingle(){
		
	}
	CircleSingle(double r){
		this.r = r;
	}
	
	
	
	//
	double area() {
		double result = pi*r*r;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
