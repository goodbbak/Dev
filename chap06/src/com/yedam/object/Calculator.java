package com.yedam.object;

public class Calculator {
	
	//필드
	
	
	
	
	
	
	//생성자
	
	
	
	
	
	//메소드(함수)
	//메소드 리턴 타입이 존재할 때=> return 값이랑 같은 타입으로 메소드 생성
	int sum(int a, int b) {
		return a + b;  //sum으로 return
	}
	
	double sub (int a, int b) {
		return a - b;
	}
	
	String result(String value) {
		String temp = "value 테스트:"+value;
		return temp;
	}
	
	//return문이 없는 메소드 생성=>void
	void powerOn () {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//매개변수의 개수가 늘 다를 때
	int sum2(int...values) {
		System.out.println(values); //values가 참조변수임
		int total = 0;
		for(int a : values) {
			System.out.println(a);
			total += a;
		}
		return total;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
