package com.yedam.reference;

public class StringRef {

	public static void main(String[] args) {
		String strVal1 = "yedam";
		String strVal2 = "yedam";  //yedam이라는 데이터는 heap에 들어가고 스택에는 주소가 있음
		
		if(strVal1 == strVal2) {
			System.out.println("strVal1과strVal2는 메모리 주소가 같다"); // 참조변수중 String만 예외로 같음
		} else {
			System.out.println("strVal1과strVal2는 메모리 주소가 다르다");
		}

		if(strVal1.equals(strVal2)) { //데이터(눈에 보이는 글자자체)를 확인할땐 .equals
			System.out.println("strVal1과strVal2는 데이터 동일");
		} else {
			System.out.println("strVal1과strVal2는 데이터 다름");
		}
	
		//new 연산자를 활용한 String 새롭게 객체 생성
		//heap에 객체를 만든다.=> heap에 String 데이터를 넣을 수 있는 새로운 공간을 만든다.
		String strVal3 = new String("yedam"); //새로운공간 ex)100번지
		String strVal4 = new String("yedam"); //새로운공간 ex)200번지
		
		if(strVal3 == strVal4) {
			System.out.println("strVal3과strVal4는 메모리 주소가 같다"); 
		} else {
			System.out.println("strVal3과strVal4는 메모리 주소가 다르다");
		}
		
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3과strVal4는 데이터 동일");
		} else {
			System.out.println("strVal3과strVal4는 데이터 다름");
		}
		
		//String strVal1 = "yedam"
		//String strVal3 = new String("yedam")
	
		if(strVal1 == strVal3) {
			System.out.println("strVal1과strVal3는 메모리 주소가 같다"); 
		} else {
			System.out.println("strVal1과strVal3는 메모리 주소가 다르다");
		}
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal1과strVal3는 데이터 동일");
		} else {
			System.out.println("strVal1과strVal3는 데이터 다름");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
