package com.callor.student.service;

import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentService {
	private Scanner scan = null;
	private StudentDto studentDto = null;
	public StudentService() {
		scan = new Scanner(System.in);
		studentDto = new StudentDto();
	}
	
	public void inputStudent() {
		
		System.out.print("학번 >> ");
		studentDto.num = scan.nextLine();
		System.out.print("이름 >> ");
		studentDto.name = scan.nextLine();
		System.out.print("학과 >> ");
		studentDto.dept = scan.nextLine();
		System.out.print("학년 >> ");
		studentDto.grade = scan.nextLine();
		System.out.print("전화번호 >> ");
		studentDto.tel = scan.nextLine();
		System.out.print("주소 >> ");
		studentDto.addr = scan.nextLine();
		System.out.println();
		StudentDto studentDto = new StudentDto();
		
		
	}
	public void printStudent() {
		System.out.println("학번\t이름\t학과\t학년\t전화번호  주소");
		System.out.printf("%s\t%s\t%s\t%s\t%s\t  %s\t", studentDto.num, studentDto.name, studentDto.dept, studentDto.grade, 
				studentDto.tel, studentDto.addr);
	}
		
		
		
	
	
}
