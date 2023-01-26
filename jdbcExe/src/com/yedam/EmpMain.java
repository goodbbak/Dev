package com.yedam;

import java.util.List;
import java.util.Scanner;

public class EmpMain {
	EmpDAO dao = new EmpDAO();
	Scanner scn = new Scanner(System.in);

	public void exe() {
		while (true) {
			System.out.println("1)목록조회 2)단건조회 3)입력 4)급여변경 5)삭제 9)종료");
			int menu = scn.nextInt();
			if (menu == 5) {
				remove();
			} else if (menu == 4) { // 사원번호, 급여 입력. updateEmp(int id, int sal)
				modify();
			} else if (menu == 3) {
				add();
			} else if (menu == 2) {
				search();
			} else if (menu == 1) {
				list();
			} else if (menu == 9) {
				// 종료.
				break;
			}
		} // end of while()

		System.out.println("end of program.");

	} // end of main()

	// 목록조회.
	public void list() { // static메소드 or 인스턴스메소드.
		// 목록조회.
//		List<Map<String, Object>> result = dao.empList(); // 반환유형.
//		for (Map<String, Object> map : result) {
//			System.out.println("사원번호: " + map.get("emp_id") //
//					+ ", 이름: " + map.get("first_name") + "-" + map.get("last_name")//
//					+ ", 급여: " + map.get("salary")//
//			);
//		}
 
		List<EmpVO> list = dao.empVoList();
		for (EmpVO emp : list) {
			System.out.println(emp.toString());
		}
	}

	// 단건조회. search()
	public void search() {
		// 단건조회.
		System.out.println("조회사원번호 입력>> ");
		int id = scn.nextInt();

		EmpVO emp = dao.getEmp(id);
		if (emp == null) {
			System.out.println("조회된 정보 없음!!");
//			continue;
		} else {
			// 반환유형: EmpVO
			System.out.println("결과: " + emp);//EmpDAO에서보면 emp는 인스턴스인데 왜 출력이가능?
		}									  //EmpVO에 toString()메소드 만들어놔서그런거였음
	}

	// 입력. add()
	public void add() {
		// 입력처리. :=> 사번, last_name, 이메일, 입사일자, 직무:
		System.out.println("사번입력>> ");
		int eid = scn.nextInt();
		scn.nextLine();
		System.out.println("이름>> ");
		String name = scn.nextLine();
		System.out.println("이메일>> ");
		String mail = scn.nextLine();
		System.out.println("입사일자>> ");
		String hDate = scn.nextLine();
		System.out.println("직무>> ");
		String job = scn.nextLine();

		EmpVO emp = new EmpVO();
		emp.setEmployeeId(eid);
		emp.setLastName(name);
		emp.setEmail(mail);
		emp.setHireDate(hDate);
		emp.setJobId(job);

		if (dao.addEmp(emp) > 0) {
			System.out.println("입력성공!!");
		} else {
			System.out.println("처리중에러!!");
		}
	}

	// 수정. modify()
	public void modify() {
		System.out.println("사원번호입력>> ");
		int eid = scn.nextInt();
		System.out.println("변경 급여 입력>> ");
		int sal = scn.nextInt();

		if (dao.updateEmp(eid, sal) > 0) {
			System.out.println("변경 성공!!");
		} else {
			System.out.println("처리중에러!!");
		}
	}

	// 삭제. remove()
	public void remove() {

	}

} // end of class
