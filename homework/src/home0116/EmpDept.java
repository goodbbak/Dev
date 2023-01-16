package home0116;

public class EmpDept extends Employee{
	

	//필드
	private String department;
	
	
	//생성자
	public EmpDept(String name, int salary ,String department) {//여기서 받은 name salary를 부모생성자에 넘겨줌
		super(name, salary); //부모생성자중 매개변수가 (name, salary)인것을 찾아옴
		this.department = department;
	}
	
	//메소드
	@Override
	public void getInformation() {
		System.out.println("이름:"+name+"연봉:"+salary+"부서:"+department);		
	}
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}

	public String getDepartment() {
		return department;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
