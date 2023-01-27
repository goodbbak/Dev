package com.yedam.board;

public class BoardVO {
	public int no;
	public String title;
	public String writer;
	public String date;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return no+"  " +title+"  "+ writer+"  "+date;
	}
	public void printF() {
		System.out.printf(" %-5d| %-10s| %-4s| %-5s", no,title,writer,date);
	}
}
