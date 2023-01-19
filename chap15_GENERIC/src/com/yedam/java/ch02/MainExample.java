package com.yedam.java.ch02;

public class MainExample {
	public static void main(String[] args) {
		Box<String> nameBox = new Box<>(); //T에 String만 담을 수 있게 지정해줌
		nameBox.set("홍길동");
		String name = nameBox.get();
		
		Box<Integer> priceBox = new Box<>(); //generic은 일반타입 안받음 클래스 받음
		priceBox.set(1000);
		int price = priceBox.get();
		
		Box<Apple> appleBox = new Box<Apple>(); 
		appleBox.set(new Apple());
		Apple apple = appleBox.get();
		
		Agency agency = new Agency();
		agency.rent().turnOnLight();
		agency.getCount().printRentDate();
	}
}

class Apple{}