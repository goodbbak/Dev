package com.yedam.java.ch01.object;

public class Member {//자동으로 Object클래스의 자식임
	//필드
	public String id;
	
	//생성자
	public Member(String id) {
		this.id = id;
	}

	
	
	//메소드
	
	@Override
	public boolean equals(Object obj) { //equals는 타입이 같고 내용이 같으면 같게보는 코드
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id))
				return true;
		}
		return false;
				
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}



	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}
	
	
	
	
	
	
	
	
	
}
