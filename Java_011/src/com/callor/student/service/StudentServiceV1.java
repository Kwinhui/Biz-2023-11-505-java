package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentServiceV1 {
	private Scanner scan = null;
	private StudentDto studentDto = null;
	private List<StudentDto> student = null;

	public StudentServiceV1() {
		scan = new Scanner(System.in);
		studentDto = new StudentDto();
		student = new ArrayList<StudentDto>();
	}

	public boolean inputStudent() {

		while (true) {
			
			System.out.print("학번(종료:QUIT) >> ");
			String stdNum = scan.nextLine();
			if (stdNum.equals("QUIT"))
				return false;
			boolean bYes = check(stdNum);
			if (bYes) {
				System.out.println("학번 중복, 다시입력해주세요");
				continue;
			}

			System.out.print("이름(종료:QUIT) >> ");
			String stdName = scan.nextLine();
			if (stdName.equals("QUIT"))
				return false;
			System.out.print("학과(종료:QUIT) >> ");
			String StdDept = scan.nextLine();
			if (StdDept.equals("QUIT"))
				return false;
			System.out.print("학년(종료:QUIT) >> ");
			String stdGrade = scan.nextLine();
			if (stdGrade.equals("QUIT"))
				return false;
			System.out.print("전화번호(종료:QUIT) >> ");
			String stdTel = scan.nextLine();
			if (stdTel.equals("QUIT"))
				return false;
			System.out.print("주소(종료:QUIT) >> ");
			String stdAddr = scan.nextLine();
			if (stdAddr.equals("QUIT"))
				return false;
			System.out.println();
			StudentDto studentDto = new StudentDto();
			studentDto = new StudentDto();
			studentDto.num = stdNum;
			studentDto.name = stdName;
			studentDto.dept = StdDept;
			studentDto.grade = stdGrade;
			studentDto.tel = stdGrade;
			studentDto.addr = stdAddr;
			student.add(studentDto);
			return true;

		}	// end while

	}

	public void inputStudents() {
		boolean result = true;
		while (result) {
			result = inputStudent();
			
		}
		System.out.println("입력 종료 퇴근하자!!!");

	}

	public boolean check(String check) {

		for (StudentDto dto : student) {
			if (dto.num.equals(check)) {
				return true;
			}
		}

		return false;
	}

//	public void printStudent() {
//		System.out.println("학번\t이름\t학과\t학년\t전화번호  주소");
//		System.out.printf("%s\t%s\t%s\t%s\t%s\t  %s\t", studentDto.num, studentDto.name, studentDto.dept, studentDto.grade, 
//				studentDto.tel, studentDto.addr);
//	}

}
