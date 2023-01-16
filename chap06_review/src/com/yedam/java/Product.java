package com.yedam.java;

public class Product {
	//상품의 정보를 담는 클래스
				
	//필드 - 해당 클래스가 가지는 모든 정보(특성)
	private String proName; //상품명
	private int proPrice;	//상품가격

	//생성자 - 인스턴스를 생성할 때 필요한 프로세스를 담은 메소드
	public Product(String proName,int proPrice) {
		this.proName = proName;	//this = 클래스를 기반으로 만들어지는 인스턴스
		this.proPrice = proPrice;
	}
	//메소드	- 해당 클래스가 가지는 모든 기능
	public void setProName(String proName) {	//set메소드(수정) 규칙 정해진대로(필드대문자시작) 만들어야 됨 return값이 없을 땐 void
		this.proName = proName;				
	}
	
	public String getProName() {//(조회)
		return this.proName;
	}
	
	public void setProPrice(int proPrice) {	//위에 private로 막아놔서 이걸로 가격확인
		this.proPrice = proPrice;
	}
	
	public int getProPrice() {
		return this.proPrice;
	}




















}
