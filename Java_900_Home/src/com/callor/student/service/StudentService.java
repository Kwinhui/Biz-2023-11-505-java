package com.callor.student.service;

import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentService {
	
	private Scanner scan = null;
	public StudentService() {
		scan = new Scanner(System.in);
	}
	
	public void inputStudent() {
		while(true) {
			StudentDto stDto = new StudentDto();
			
			System.out.print("학번입력 >> ");
			String stdNum = scan.nextLine();
			System.out.print("이름입력 >> ");
			String stdName = scan.nextLine();
			System.out.print("학과입력 >> ");
			String stdDept = scan.nextLine();
			System.out.print("학년입력 >> ");
			String stdGrade = scan.nextLine();
			System.out.print("전화번호입력 >> ");
			String stdTel = scan.nextLine();
			System.out.print("주소입력 >> ");
			String stdAddr = scan.nextLine();
			
			stDto.num = stdNum;
			stDto.name = stdName;
			stDto.dept = stdDept;
			stDto.grade = stdGrade;
			stDto.tel = stdTel;
			stDto.addr = stdAddr;

		}
		
		
		
		
	}
}
