package com.yedam.java.ch01_01;

public class DmbCellPhonExample {
	public static void main(String[] args) {
		//자식의 instance를 만들면 부모의 instance가 먼저 만들어지고 만들어짐 부모가있어야 자식이 있음
		DmbCellPhone dmbCellPhone = new DmbCellPhone("갤럭시폰","애플그린",10);
		
		//CellPhone의 필드(부모)
		System.out.println("모델:"+dmbCellPhone.model);
		System.out.println("색상:"+dmbCellPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널:"+dmbCellPhone.channel);
		
		//CellPhone의 메소드(부모) 부모의 instance가 만들어졌기에 사용가능
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 박주안입니다.");
		
		//DmbCellPhone의 메소드
		dmbCellPhone.turnOnDmb();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
