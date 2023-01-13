package com.yedam.object;

public class CircleTest {

	public static void main(String[] args) {
		//pi가 static이어서 객체 생성없이 바로 쓸 수 있음
		System.out.println(Circle.pi);
		//반지름이 5인 원의 면적 계산
		//cricle객체 생성		
		Circle c = new Circle(5);
		//반지름 5로초기화
		//c.r = 5;
		//area호출
		double result = c.area();
		//결과출력
		System.out.println(result);
		
		//CircleSingle class에서 객체를 만들어서 static에 넣어뒀기에
		CircleSingle.getInstance();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
