package com.yedam.object;

public class Student {
	
	//필드 - 객체의 속성,정보,데이터가 저장되는 부분
	//이름
	final String school = "예담학교"; //final(변경불가)이면 꼭 값이 있어야됨 여기서 초기화 해주던가 생성자에서 해줘야됨
	String name;
	int age;
	String schoolName = "예담대학교"; //데이터를 넣는 방식 다양 
	int kor;
	int eng;
	int math;
	
	//생성자 - 객체 초기화(생성)할 때 어떠한 행동(생성자 안에 정의된 내용)을 하고 객체를 생성
	//기본생성자-> 생성자를 생성하지 않아도 컴파일(실행) 할 때 자바에서 알아서 생성
	//생성자 -> 매개변수, 객체 생성시 실행문 정의
	Student(){ //생성자이름은 무조건 class랑 같게
		//this.school = "예담"; final 초기화 이렇게 할거면 모든생성자에 다 해줘야 됨
		System.out.println("객체 생성중");
	}
	
	Student(String name){ //생성자이름은 무조건 class랑 같게
		this.name = name;
	}
	
	Student(int age){ //생성자이름은 무조건 class랑 같게
		if(age>0) {
			this.age = age;
		}else {
			this.age = 0;
		}
		
	}
	
	Student(String name, int age){ //생성자이름은 무조건 class랑 같게
		this(age); //this()일반생성자 호출 ()안에 age넣으면 자동으로 타입 같은 생성자 호출
		this.name = name;
	}
	
	//메소드 - 객체를 생성 후 기능을 사용할 때 정의 하는 부분
	void getInfo() {
		System.out.println("학생의 이름:"+name);
		System.out.println("학생의 나이:"+age);
		System.out.println("학생의 학교:"+schoolName);
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
