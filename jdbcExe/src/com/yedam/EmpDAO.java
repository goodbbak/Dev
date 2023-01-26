package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDAO {
	//필드
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "hr";
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
			conn = DriverManager.getConnection(url,user,pass);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
	}
//C(create)R(read)U(update)D(delete)

	// 목록조회
	public List<Map<String, Object>> empList() {
		sql = "select * from emp_temp";
		connect();
		List<Map<String, Object>> list =  new ArrayList<Map<String,Object>>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String,Object> map = new HashMap<>();
				map.put("emp_id", rs.getInt("employee_id"));
				map.put("first_name", rs.getString("first_name"));
				map.put("last_name", rs.getString("last_name"));
				map.put("salary", rs.getInt("salary"));
				
				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	//List<Map<String, Object>>타입과 비교 
	public List<EmpVO> empVoList(){
		connect();
		sql = "select * from emp_temp";
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				EmpVO emp = new EmpVO();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date"));
				
				list.add(emp);
			}
		} catch (SQLException e) {
			System.out.println("처리 실패");
			e.printStackTrace();
		}
		return list;
	}
	// 단건조회
	public EmpVO getEmp(int id) {
		sql = "select * from emp_temp where employee_id ="+id;
		connect();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs.next()) { //다음으로 넘어가서 값이 있으면 true
				EmpVO emp = new EmpVO(); //조회해서 받은 데이터를 emp객체 만들어서
				emp.setEmployeeId(rs.getInt("employee_id")); //객체의 필드에 저장
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date"));
				return emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; //조회된 데이터 없음.
	}
	//입력
	public int addEmp(EmpVO emp) {
		connect();
		sql = "insert into emp_temp (employee_id,last_name,email,hire_date,job_id) "
				+ "values(?,?,?,?,?);";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1,emp.getEmployeeId());
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());
			
			r = psmt.executeUpdate(); //처리된 건수.
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	
	// 수정
	public int updateEmp(int id,int sal) {
		connect();
		sql = "update emp_temp set salary = ? where employee_id = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sal);
			psmt.setInt(2, id);					
			r = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	// 삭제 //안됨 다시
	public int deleteEmp(int id) {
		connect();
		sql = "delete from emp_temp where id = ?";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, id);
						
			r = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

}
