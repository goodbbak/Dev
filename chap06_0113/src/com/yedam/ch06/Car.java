package com.yedam.ch06;

public class Car {
	private int speed;
	private int maxSpeed;
	private String model;
	
	public Car(String model,int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
	}
	
	public String getModel() { //이미 정해져서 나오는 필드값들은 get(조회)만 가능 set(수정) 불가
		return this.model;	
	}
	
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	
	
	
	
	
	
	
	
}
