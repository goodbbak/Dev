package com.yedam.java;

import java.util.Scanner;

public class ProductProgram {
	private Scanner sc = new Scanner(System.in);
	private Product[] list = null;

	public ProductProgram() { //생성자임
		while (true) {
			// 메뉴출력
			menuPrint();
			// 메뉴선택
			int selectNo = menuSelect();

			if (selectNo == 1) {
				// 상품수입력
				inputProductNum();
			} else if (selectNo == 2) {
				// 상품및가격입력
				inputProductInfo();
			} else if (selectNo == 3) {
				// 제품별가격
				productInfoPrint();
			} else if (selectNo == 4) {
				// 분석
				productAnalysis();
			} else if (selectNo == 5) {
				// 종료
				exit();
				break;
			} else {
				// 잘못된메뉴선택시 안내메시지
				printErrorMessage();

			}
		}

	}

	private void printErrorMessage() {
		System.out.println("1~5선택");

	}

	private void exit() {
		System.out.println("프로그램 종료");
	}

	private void productAnalysis() {
		int max = 0;
		int productIndex = 0;
		for (int i = 0; i < list.length; i++) {
			Product product = list[i];
			if (max < product.getProPrice()) {
				max = product.getProPrice();
				productIndex = i;
			}
		}

		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			if (i == productIndex)
				continue; // 밑에줄 실행 안하고 바로 i++ or (i!=productIndex)
			Product product = list[i];
			sum += product.getProPrice();
		}
		System.out.println("최고가제품:" + list[productIndex].getProName());
		System.out.println("최고가제품을 제외한 제품값의 합은:" + sum);

	}

	private void productInfoPrint() {
		for (Product product : list) {
			System.out.printf("%s:%d\n", product.getProName(), product.getProPrice());
		}

	}

	private void inputProductInfo() {
		for (int i = 0; i < list.length; i++) {
			System.out.println("상품명>");
			String name = sc.nextLine();
			System.out.println("상품가격>");
			int price = Integer.parseInt(sc.nextLine());

			Product product = new Product(name, price); // 인스턴스(상품product) 생성해서 배열에담음

			list[i] = product;
		}

	}

	private void inputProductNum() {
		int productNum;
		System.out.println("등록할 상품 수 입력>");
		productNum = Integer.parseInt(sc.nextLine());
		list = new Product[productNum];

	}

	private int menuSelect() {
		System.out.println("선택>");
		return Integer.parseInt(sc.nextLine());
	}

	private void menuPrint() {
		System.out.println("===1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료===");
	}
}
