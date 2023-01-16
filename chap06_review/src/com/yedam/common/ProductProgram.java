package com.yedam.common;

import java.util.Scanner;

public class ProductProgram {

	public ProductProgram() {
		Scanner sc = new Scanner(System.in);
		Product[] list = null; //객체를담는 배열
		int productNum = 0;

		boolean run = true;
		while (run) {
			System.out.println("===1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료===");
			System.out.println("선택>");
			int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.println("등록할 상품 수 입력>");
				productNum = Integer.parseInt(sc.nextLine());
				list = new Product[productNum];
			} else if (selectNo == 2) {
				for (int i = 0; i < list.length; i++) {
					System.out.println("상품명>");
					String name = sc.nextLine();
					System.out.println("상품가격>");
					int price = Integer.parseInt(sc.nextLine());

					Product product = new Product(name, price); // 인스턴스(상품product) 생성해서 배열에담음

					list[i] = product;
				}

			} else if (selectNo == 3) {
				for (Product product : list) {
					System.out.printf("%s:%d\n", product.getProName(), product.getProPrice());
				}

			} else if (selectNo == 4) {
				int max = 0;
				int productIndex = 0;
				for(int i=0;i<list.length;i++) {
					Product product = list[i];
					if(max < product.getProPrice()) {
						max = product.getProPrice();
						productIndex = i;
					}
				}
				
				int sum = 0;
				for(int i=0;i<list.length;i++) {
					if(i==productIndex) continue; //밑에줄 실행 안하고 바로 i++ or (i!=productIndex)
					Product product = list[i];
					sum += product.getProPrice();
				}
				System.out.println("최고가제품:"+list[productIndex].getProName());
				System.out.println("최고가제품을 제외한 제품값의 합은:"+sum);
				
			} else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
		}
	}
}
