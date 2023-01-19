package com.yedam.java.ch02;

@FunctionalInterface  //람다식을 쓸거니 반드시 추상메소드 하나(오직 한개만)를 포함하라는 의미
public interface Workable {
	public void work();
}
