package com.callor.student.impl;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentDto;
import com.callor.student.service.StudentService;
import com.callor.utils.Line;

public class StudetnServiceImplV1 implements StudentService {
	private List<StudentDto> studentDto = null;
	private Scanner scan = null;

	public StudetnServiceImplV1() {
		scan = new Scanner(System.in);
		studentDto = new ArrayList<StudentDto>();

	}

	@Override
	public void inputStudent() {

		while (true) {
			StudentDto std = new StudentDto();
			Line.dLine(50);
			System.out.println("찾는 학생이름을 입력하세요(종료하려면 QUIT를 입력)");
			Line.sLine(50);
			System.out.print("이름 >> ");
			String str = scan.nextLine();

			boolean found = false;
			this.loadStdData();
			for (StudentDto dto : studentDto) {
				if (dto.name.equals(str)) {
					this.printStudent(dto);
//					System.out.printf("학번 : %s \n", dto.num);
//					System.out.printf("이름 : %s \n", dto.name);
//					System.out.printf("학과 : %s \n", dto.dept);
//					System.out.printf("학년 : %s \n", dto.grade);
//					System.out.printf("번호 : %s \n", dto.tel);
//					System.out.printf("주소 : %s \n", dto.addr);
					found = true;
					break;
				}
			}
			if (str.equals("QUIT")) {
				System.out.println("시스템 종료!");
				break;
			}
			if (!found) {
				System.out.printf("%s 자료는 없습니다\n", str);

			}

			if (str.isBlank()) {
				System.out.println("이름을 다시 입력해주세요");
				continue;
			}
		} // end while
	}

	@Override
	public void loadStdData() {
		String file = "src/com/callor/utils/data.txt";
		Scanner scan = null;
		InputStream is = null;

		try {
			is = new FileInputStream(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan = new Scanner(is);
		while (scan.hasNext()) {

			String line = scan.nextLine();
			String[] lines = line.split(",");

			StudentDto stdDto = new StudentDto();
			stdDto.num = lines[0];
			stdDto.name = lines[1];
			stdDto.dept = lines[2];
			stdDto.grade = lines[3];
			stdDto.tel = lines[4];
			stdDto.addr = lines[5];

			studentDto.add(stdDto);

		}
		scan.close();

	}

	@Override
	public void printStudent(StudentDto std) {
		
		System.out.printf("학번 : %s\n", std.num);
		System.out.printf("이름 : %s\n", std.name);
		System.out.printf("학과 : %s\n", std.dept);
		System.out.printf("학년 : %s\n", std.grade);
		System.out.printf("번호 : %s\n", std.tel);
		System.out.printf("주소 : %s\n", std.addr);

	}

}
