package com.yedam.java.ch03_example;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	
	public abstract void showLevelMessage();
	
	public final void go(int count) {	//모든 레벨에서 동일하게 하니까 일반메소드로 만듦, override(재정의) 막기위해 final
		run();
		for(int i=0;i<count;i++) {
			jump();
		}
		turn();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
