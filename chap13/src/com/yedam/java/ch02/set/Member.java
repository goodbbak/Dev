package com.yedam.java.ch02.set;

public class Member {
	public int id;
	public String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return id + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id == member.id) {  //return (id == member.id) && (name.equalsIgnoreCase(member.name)); 이걸로 쓰면 이거랑 밑에줄 대신 쓸 수 있음
				if(name.equals(member.name)) {
					return true;
				}
			}
			
		} return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
