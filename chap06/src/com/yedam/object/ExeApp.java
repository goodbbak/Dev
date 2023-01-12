package com.yedam.object;

public class ExeApp {
	public static void main(String[] args) {
		
		Book b1 = new Book("yedam-001","혼자 공부하는 자바",24000);
		b1.content = "꿀잼";
		b1.getInfo();
		
		Book b2 = new Book();
		
		Car car1 = new Car();//일반 생성자
		System.out.println("car1.company:"+car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company:"+car2.company);
		System.out.println("car2.model:"+car2.model);
		System.out.println();
		
		Calculator ca = new Calculator();
		double result = ca.sub(1,1);
		System.out.println(result);
		
		int sumResult = ca.sum2(1,2,3,4,5,6,7,98);
		System.out.println("총합:"+sumResult);
		sumResult = ca.sum2(1,2,3,4,5);
		System.out.println("총합:"+sumResult);
		
		Score sc = new Score(50,70,30);
		
		sc.getInfo();
		
		
		
		
		
		
		
		
		
		

		
		
	}
}
