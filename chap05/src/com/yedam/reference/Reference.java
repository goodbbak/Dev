package com.yedam.reference;

public class Reference {
 public static void main(String[] args) {
	int intVal = 10;
	int[] array = {1,2,3,4,5,6};
	int[] array2 = {1,2,3,4,5,6};
	int[] array3 = null;
	
	System.out.println(array);  //주소가 나옴
	System.out.println(array2);
	System.out.println(array==array2); //같은 데이터지만 주소가 다름 string만 데이터 같을 때 같은 주소 사용
	System.out.println(intVal);
	System.out.println(array3[0]);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
