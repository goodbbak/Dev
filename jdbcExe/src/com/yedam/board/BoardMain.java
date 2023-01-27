package com.yedam.board;

import java.util.List;
import java.util.Scanner;

public class BoardMain {
	BoardDAO dao = new BoardDAO();
	Scanner sc = new Scanner(System.in);
	
	String id; String pw;
	User user = new User();
	public void exe() {
		while(true) {
			System.out.println("---------1.로그인 | 2.회원가입 | 3.비회원-----------");
			int menu = Integer.parseInt(sc.nextLine());
			if(menu == 1) {
				login();
				
			}else if(menu == 2) {
				join();
			}
//			System.out.println("=============== <게시판> ================");
//			System.out.println(" 번호      제목            작성자     작성일");
		}
		
	}
	
	//함수
	//회원가입
	public void join() {
		System.out.println("아이디 입력 >");
		id = sc.nextLine();
		System.out.println("비밀번호 입력 >");	
		pw = sc.nextLine();
		user.id = id;
		user.pw = pw;
		
		if(dao.addUser(user)>0) {
			System.out.println("회원가입 성공!");
		}
	}
	//로그인
	public void login() {
		System.out.println("아이디 입력 >");
		id = sc.nextLine();
		System.out.println("비밀번호 입력 >");	
		pw = sc.nextLine();
		user.id = id;
		user.pw = pw;
		dao.loginCheck(user);
	}
	//전체조회
//	public void showBList() {
//		List<BoardVO> list = dao.bList();
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.toString());
//		}
//	}
	
}
