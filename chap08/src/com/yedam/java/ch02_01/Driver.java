package com.yedam.java.ch02_01;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { //vehicle의 실제 instance가 Bus이면
			Bus bus = (Bus)vehicle;  //강제타입변환
			bus.checkFare();	//Bus만 쓸수있는 기능 사용가능
		}
		
		vehicle.run();
	}
}
