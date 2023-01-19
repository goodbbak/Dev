package com.yedam.java.ch02;

public class Box<T> { //generic 만들기 <>넣고 안에 아무대문자 =>대문자의 역할: 타입(클래스)를 값으로 받는 일종의 변수 역할
	//필드
	private T t;
	
	
	//메소드
	public void set (T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
