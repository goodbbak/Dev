package com.yedam.java.ch01_01;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision  tv = new SmartTelevision();
		
		tv.turnOn();
		tv.search("네이버");
		tv.setVolume(-100);
		tv.setVolume(20);
		tv.turnOff();
		
		RemoteControl rc = tv;	//정해진 인터페이스의 기능만 사용하고 싶을 때 이렇게하면 RemoteControl의 기능만 쓸 수 있음
		Searchable searchable = tv;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
