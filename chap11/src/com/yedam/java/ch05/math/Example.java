package com.yedam.java.ch05.math;

public class Example {
	public static void main(String[] args) {
		// abs() : 절대값
		System.out.println("-2.14의 절대값 :"+ Math.abs(-2.14));
		System.out.println("2.14의 절대값 :"+ Math.abs(2.14));
		
		// max(),min() : 최대값,최소값
		System.out.println("3.8, 6,7 중 최대값:"+Math.max(3.8,6.7));
		System.out.println("3.8, 6,7 중 최소값:"+Math.min(3.8,6.7));
		
		//ceil() : 올림값
		System.out.println("5.3의 올림값 :"+Math.ceil(5.3));
		System.out.println("-5.3의 올림값 :"+Math.ceil(-5.3));
		
		//floor(); : 버림값 - 기준값보다 작아짐
		System.out.println("5.3의 버림값 :"+Math.floor(5.3));
		System.out.println("-5.3의 버림값 :"+Math.floor(-5.3)); //-6나옴 주의
		
		//round() : 반올림값 - 음수일땐 -0.9부터-0.6까지 4개 => 내림
		System.out.println("5.3의 반올림값 :"+Math.round(5.3));
		System.out.println("-5.5의 반올림값 :"+Math.round(-5.5));
		
		//rind() : 반올림인데 정수부분이 홀수이면(내가아는 반올림) 5부터 올라가고 짝수이면 6부터 올림
		System.out.println("5.5의 가까운 정수의 실수값 :"+Math.rint(5.5));
		System.out.println("5.6의 가까운 정수의 실수값 :"+Math.rint(5.6));
		System.out.println("4.5의 가까운 정수의 실수값 :"+Math.rint(4.5));
		System.out.println("4.6의 가까운 정수의 실수값 :"+Math.rint(4.6));
		
		
		
		
		
		
		
		
		
		
		
	}
}
