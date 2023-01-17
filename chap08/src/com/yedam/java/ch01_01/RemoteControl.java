package com.yedam.java.ch01_01;

public interface RemoteControl { //interface = 만능리모컨비유
	// 상수 => static final 특성을 가짐
	//public static final int MAX_VALUE = 10; 원래 상수를 만들땐 이렇게 
	public int MAX_VALUE = 10; //객체가 interface라 static final없어도 당연히 필드에 상수가 오는걸로 판단
	public int MIN_VALUE = 0;
	
	// 추상 메소드
	public void turnOn(); //마찬가지로 interface에선 추상메소드만 옴
	public void turnOff();
	public void setVolume(int volume);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
