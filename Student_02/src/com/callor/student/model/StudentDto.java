package com.callor.student.model;

public class StudentDto {
	public String num;
	public String name;
	public String dept;
	public String grade;
	public String tel;
	public String addr;
	@Override
	public String toString() {
		return "StudentDto [num=" + num + ", name=" + name + ", dept=" + dept + ", grade=" + grade + ", tel=" + tel
				+ ", addr=" + addr + "]";
	}
	public StudentDto() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentDto(String num, String name, String dept, String grade, String tel, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.grade = grade;
		this.tel = tel;
		this.addr = addr;
	}

	
	
}

