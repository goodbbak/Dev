package com.yedam.object;

public class Book {

	//필드
	String title;
	String type = "학습서"; //kind
	String content;
	int price;
	String company = "한빛미디어"; //publish
	String bookNo; 	//isbn
	
	//생성자 생성자 함수의 이름 같아도 다르게 만들 수 있음
	Book(String bookNo,String title,int price){
		this.title = title;
		this.price = price;
		this.bookNo = bookNo;
	}
	//매개변수의 타입에 따른 생성자 오버로딩
	Book(int price,String title,String type){
		this.title = title;
		this.price = price;
		this.type = type;
	}
	
	//매개 변수 순서에 따른 생성자 오버로딩
	//데이터 타입 기준으로 순서를 따진다.
	
	//매개변수갯수에따른
	Book(int price){		
		this.price = price;		
	}
	//기본 생성자
	Book(){
		
	}
	
	
	
	//메소드
	void getInfo() {
		System.out.println(title);
		System.out.println(content);
		System.out.println("종류:"+type);
		System.out.println("가격:"+price);
		System.out.println("출판사:"+company);
		System.out.println("도서번호:"+bookNo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
