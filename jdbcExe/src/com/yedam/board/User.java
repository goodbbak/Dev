package com.yedam.board;

public class User {
	public String id;
	public String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}
}
