package com.yedam.object;

public class CalculatorSingle {
	
	//싱글톤 -> 필요시마다 매번 객체를 생성하지 않고(new 사용 막음) 한번만 객체를 생성해놓고 필요시 참조해서 사용(메모리관리에 용이)
	static CalculatorSingle instance = new CalculatorSingle(); //객체를class파일에서 미리 만듦 static이라 스태틱메모리에 담김 instance에 CalculatorSingle객체의 주소가 담김
	static CalculatorSingle getInstance() { //객체를 호출하는 메소드를 만들어 둠
		return instance;
	}
	
	
	
	
	//필드
	
			
	//생성자
	private CalculatorSingle() {} //생성자 생성 못하게 막음
			
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
