package com.yedam.java.ch04.wrapper;

public class BoxingUnboxingExample {
	public static void main(String[] args) {
		//박싱
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = Integer.valueOf("200");
		//Integer obj3 = new Integer(1000); //옛날에 쓰던방식이라 진행은되는데 굳이 ㄴㄴ
		
		//언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		
		//자동 박싱 이거 돼서 위에꺼 딱히 안 씀 그냥 넣으면 그 타입에 맞게 자동으로 바뀜
		Integer newObj1 = value1;
		Integer newObj2 = value2;
		
		//자동 언박싱 마찬가지
		int result = newObj1 + newObj2;
		System.out.println(result);
	
		int newValue1 = newObj1;
		int newValue2 = newObj2;
		
		//Wrapper 클래스 값 비교
		Integer data1 = 300;
		Integer data2 = 300;
		System.out.println("== 결과 :"+(data1 == data2)); //false 300을 비교하는게 아닌 300이 담긴 인스턴스의 주소값을 비교하기에 
		System.out.println("언박싱 후 == 결과:"+(data1.intValue() == data2.intValue()));
		System.out.println("equals() 결과:"+data1.equals(data2)); //Integer클래스에서 equals()를 재정의 해놔서? ㅇㅇ
		
		//예외사항
		Integer data3 = 30;
		Integer data4 = 30;
		System.out.println("== 결과 :"+(data4 == data3)); //true 값의 범위가 -128~127 로 작으면 그냥 숫자 비교해줌 근데 그냥 쓸 생각말고 위에꺼 ㄱㄱ
		System.out.println("언박싱 후 == 결과:"+(data3.intValue() == data4.intValue()));
		System.out.println("equals() 결과:"+data3.equals(data4));
		
		
		
		
		
		
		
		
		
	}
}
