package com.callor.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;

public class StudentServiceV2 {
	private List<StudentDto> list = null;
	private Scanner scan = null;

	public StudentServiceV2() {
		scan = new Scanner(System.in);
		list = new ArrayList<StudentDto>();
	}

	public void inputStudent() {
		while (true) {
			StudentDto stDto = new StudentDto();

			System.out.print("학번입력(종료:QUIT) >> ");
			String stdNum = scan.nextLine();
			if(stdNum.equals("QUIT")) {
				System.out.println("퇴근!!");
				break;
			}
			System.out.print("이름입력(종료:QUIT) >> ");
			String stdName = scan.nextLine();
			if(stdName.equals("QUIT")) {
				System.out.println("퇴근!!");
				break;
			}
			System.out.print("학과입력(종료:QUIT) >> ");
			String stdDept = scan.nextLine();
			if(stdDept.equals("QUIT")) {
				System.out.println("퇴근!!");
				break;
			}
			System.out.print("학년입력(종료:QUIT) >> ");
			String stdGrade = scan.nextLine();
			if(stdGrade.equals("QUIT")) {
				System.out.println("퇴근!!");
				break;
			}
			System.out.print("전화번호입력(종료:QUIT) >> ");
			String stdTel = scan.nextLine();
			if(stdTel.equals("QUIT")) {
				System.out.println("퇴근!!");
				break;
			}
			System.out.print("주소입력(종료:QUIT) >> ");
			String stdAddr = scan.nextLine();
			if(stdAddr.equals("QUIT")) {
				System.out.println("퇴근!!");
				break;
			}
			stDto.num = stdNum;
			stDto.name = stdName;
			stDto.dept = stdDept;
			stDto.grade = stdGrade;
			stDto.tel = stdTel;
			stDto.addr = stdAddr;
			list.add(stDto);
		}
	}
}