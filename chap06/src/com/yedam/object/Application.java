package com.yedam.object;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		//클래스 생성해서 객체 만든 다음 객체 바로 사용
		//개겣를 한 곳에 모아서 관리하는 형태
		//배열
		//int[] ary = new int[4];
		//Student[] stdAry = new Student[10];
		
		//학생 정보 보관하는 배열
		Student[] stdAry = null; //배열에 Student클래스로 만들어진 객체가 들어감
		int stdNum = 0;
		Scanner sc = new Scanner(System.in);
		//while문을 활용해서 학생 관리 프로그램 작성.
		while(true) {
			System.out.println("======================================");
			System.out.println("1.학생 수|2.정보입력|3.정보확인|4.분석|5.종료");
			System.out.println("======================================");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				//Student 클래스로 만들어지는 객체를 몇개나 배열에 넣을지에 대한 값을 받아옴
				System.out.println("학생 수>");
				stdNum = Integer.parseInt(sc.nextLine());
			} else if(selectNo == 2) {
				stdAry = new Student[stdNum];
				for(int i=0;i<stdAry.length;i++) {
					//객체 배열의 각 인덱스에 존재하는 student객체에게 데이터를 제공하기위한 임시 객체를 만듦
					//Student std = new Student();
					//stdAry[i] = std; //or 배열에 객체를 바로 넣기 =밑에 방식
					stdAry[i] = new Student();
					System.out.println("이름>");
					stdAry[i].name = sc.nextLine();
					System.out.println("나이>");
					stdAry[i].age = Integer.parseInt(sc.nextLine());
					System.out.println("학교>");
					stdAry[i].schoolName = sc.nextLine();	
					System.out.println("국어점수>");
					stdAry[i].kor = Integer.parseInt(sc.nextLine());
					System.out.println("영어점수>");
					stdAry[i].eng = Integer.parseInt(sc.nextLine());
					System.out.println("수학점수>");
					stdAry[i].math = Integer.parseInt(sc.nextLine());
				}						
			} else if(selectNo == 3) {
				for(Student std : stdAry) { //배열의 값 하나씩 변수에 담아서 실행
					std.getInfo();
				}
			} else if(selectNo == 4) {
				//총합 평균
				int total = 0;
				double avg = 0;
				System.out.println("전체 학생 총합/평균 조회");
				for(int i=0;i<stdAry.length;i++) {
					total = stdAry[i].kor+stdAry[i].eng+stdAry[i].math;
					avg = total/3.0;
					System.out.println(stdAry[i].name +"학생의>");
					System.out.println("총합 :"+total+"평균 :"+avg);
				}
				//최대 최소
				int max = 0;
				int min = 0;
				for(int i=0;i<stdAry.length;i++) { //객체수만큼 포문
					for(int j=0;j<3;j++) { //객체가 가진 과목수만큼 포문
						if(j==0) {
							max = stdAry[i].kor;
							min = stdAry[i].kor;
						}
						if(stdAry[i].eng<stdAry[i].math) { //영어<수학
							if(max < stdAry[i].math) {    //국어와 수학 비교
								max = stdAry[i].math;
							} 
						} else {//영어>수학
							if(max < stdAry[i].eng) {    //국어와 영어 비교
								max = stdAry[i].eng;
							} 
						}
						
					}
					System.out.println(stdAry[i].name+"의 최고성적 :"+max);
				}
				
				
				break;
			} else if(selectNo == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Student s1 = new Student(); //Student라는class(설계도)이용해서 새로운 객체를 만듦(heap에 공간할당) s1에는 Student객체가 존재하는 주소값이 나옴
	//Student=class이름  si=인스턴스=객체
		//Student s2 = new Student(); //Student()생성자의 내용을 실행하면서 객체 만듦
		
		//System.out.println(s1);
		
		//dot 연산자(점)
		/* 만들어진 객체에 속성,정보,데이터 넣기
		 * s1.age = 20; s1.name = "예담"; s1.schoolName = "예담대학교"; s1.getInfo();
		 * 
		 * s2.age = 30; s2.name = "대예담"; s2.schoolName = "예담대학원"; s2.getInfo();
		 */
		//s1.getInfo();
		//s1.name ="대학생";
		//s1.age = 20;
		/*
		 * System.out.println("학생의 이름:"+s1.name); System.out.println("학생의 나이:"+s1.age);
		 * System.out.println("학생의 학교:"+s1.schoolName);
		 * 
		 * Korean k1 = new Korean("김또치","001111-1234562");
		 * 
		 * System.out.println("k1이 가지고 있는 필드 값>"); System.out.println(k1.nation);
		 * System.out.println(k1.name); System.out.println(k1.ssn);
		 */
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}	
