package com.yedam.java.ch01_01;

public class DmbCellPhone extends CellPhone{ //앞에꺼가자식 뒤에가 부모 자식이 상속받을 부모를 선택
	//필드
	int channel;
	String model; //부모도 있는 중복된 값 가지면 super로 호출
	
	//생성자 아들생성자로 instance만들 때 자동으로 부모 생성자가 먼저 호출됨
	public DmbCellPhone(String model, String color, int channel) {
		super(model,color); //this()랑 같은 기능 but 부모instance를 가르킴 부모의 생성자가 기본생성자가 아니라면 super()로 불러줘야됨 
		//this.model = model;  //상속받아서 부모에게 있는 필드를 사용할 수 있음 /위이어서 기본생성자면super()가 생략돼서 들어있다 생각
		//this.color = color;	//중복된 필드아니면this사용 중복된거면 super사용
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel+"번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
