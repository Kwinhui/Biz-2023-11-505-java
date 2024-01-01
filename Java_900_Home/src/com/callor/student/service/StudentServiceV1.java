package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentServiceV1 {
	Scanner scan = null;
	List<StudentDto> list = null;
	String[] students = null;
	public StudentServiceV1() {
		scan = new Scanner(System.in);
		list = new ArrayList<StudentDto>();
		students = new String[] { "학번", "이름", "학과", "학년", "전화번호", "주소" };
	}

	public boolean inputStudent() {
		String[] inputStr = new String[students.length];
		
			for(int i = 0; i < students.length; i++) {
				System.out.print(inputStr[i] + " 입력(종료:QUIT) >> ");
				String str = scan.nextLine();
				if(str.equals("QUIT")) {
					return false;
				}
				inputStr[i] = str;
			}
			StudentDto dto = new StudentDto();
			dto.num = inputStr[0];
			dto.name = inputStr[1];
			dto.dept = inputStr[2];
			dto.grade = inputStr[3];
			dto.tel = inputStr[4];
			dto.addr = inputStr[5];
			list.add(dto);
			
			return true;
			
		
		
	}

}