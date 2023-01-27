package com.yedam.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;import java.util.ArrayList;
import java.util.List;

import com.yedam.EmpVO;


public class BoardDAO {
	//필드
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String ouser = "hr";
		String pass = "hr";
		
		Connection conn; //db연결용
		Statement stmt = null; //쿼리용
		PreparedStatement psmt = null; //?쿼리용
		ResultSet rs = null; //조회결과담기용
		String sql;
		
		//메소드
		public void connect() {
			try {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection(url,ouser,pass);
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("에러발생");
				e.printStackTrace();
			}
		}
		
		//입력 회원가입
		public int addUser(User user) {
			connect();
			sql = "insert into b_user (id,pw) "
					+ "values(?,?)";
			int r = 0;
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setString(1,user.id);
				psmt.setString(2,user.pw);		
				
				r = psmt.executeUpdate(); //처리된 건수. 조회빼고는 이걸로 숫자가 바뀐것 확인해서 메소드가 잘 실행됨을 확인
			} catch (SQLException e) {
				System.out.println("중복된 아이디입니다.");
			}
			return r;
		}
		
		//로그인시 아이디비번있는지확인 (단건조회)
		public void loginCheck(User user) {
			sql = "select * from b_user where id = '"+user.id+"'";
			connect();
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql); //rs에 쿼리문 받은 디비의 응답이 담김
				if(rs.next()) { //다음으로 넘어가서 값이 있으면 true
					if(user.pw.equals(rs.getString("pw"))) {
						System.out.println("로그인 성공");
						
						System.out.println("--------------- < 게시판 > -----------------");
						System.out.println(" 번호     제목               작성자      작성일 ");
						showBList();
					}System.out.println("비밀번호를 확인해주세요");
					
				}System.out.println("없는 계정입니다.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		//b_list 전체조회
		public void showBList(){
			connect();
			sql = "select * from b_list";
			List<BoardVO> list = new ArrayList<BoardVO>(); //list엔 게시물객체들이 담김
			try {
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					BoardVO bvo = new BoardVO();
					bvo.no = rs.getInt("no");
					bvo.setTitle(rs.getString("title"));
					bvo.writer = rs.getString("writer");
					bvo.date = rs.getString("wr_date");
					list.add(bvo);
				}for(BoardVO temp : list) {
					temp.printF();
				}
				
			} catch (SQLException e) {
				System.out.println("처리 실패");
				e.printStackTrace();
			}
		
		}
		
}
