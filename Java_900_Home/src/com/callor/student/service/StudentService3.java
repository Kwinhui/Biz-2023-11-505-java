package com.callor.student.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.hello.line.Line;
import com.callor.student.models.StudentDto;

public class StudentService3 {
	private List<StudentDto> students = null;
	private Scanner scan = null;
	private String[] menuItems = null;
	public StudentService3() {
		scan = new Scanner(System.in);
		students = new ArrayList<StudentDto>();
		menuItems = new String[] {
				"1. 학생정보 입력",
				"2. 학생정보 조회",
				"3. 학생정보 출력"
		};
	}
	
	public void StartService() {
		Line.dLine(50);
		System.out.println("한울고교 학사관리");
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);
		for(String menu : menuItems) {
			System.out.println(menu);
		}
		Line.sLine(50);
	}
	
	public int selectMenu() {
		while(true) {
			this.StartService();
			System.out.print("업무 선택 >> ");
			String str = scan.nextLine();
			if(str.equals("QUIT")) {
				return -1;
			}
			int menuId = 0;
			try {
				menuId = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수값을 입력해 주세요!!");
			}
			if(menuId > menuItems.length || menuId < 1) {
				System.out.printf("1 ~ %d 까지의 정수값을 입력해주세요\n");
				continue;
			}
			return menuId;
		}
		
	}
	
	
	public void loadStudent() {
		Line.dLine(100);
		System.out.println("한울 고교 학생정보");
		Line.dLine(100);
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		while(scan.hasNext()) {
			
		}
		
	}
	
	
	public void printStudent() {
		Line.dLine(100);
		System.out.println("한울 고교 학생정보");
		Line.dLine(100);
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		
		for(StudentDto dto : students) {
			System.out.printf("%s\t", dto.num);
			System.out.printf("%s\t", dto.name);
			System.out.printf("%s\t", dto.dept);
			System.out.printf("%s\t", dto.grade);
			System.out.printf("%s\t", dto.tel);
			System.out.printf("%s\t", dto.addr);
			
			
		}
		
	}
	
}
