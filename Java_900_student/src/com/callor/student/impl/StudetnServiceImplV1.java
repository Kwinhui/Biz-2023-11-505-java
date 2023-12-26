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
	private StudentDto stDto = null;
	InputStream is = null;
	String dataFile = "";

	public StudetnServiceImplV1() {
		stDto = new StudentDto();
		studentDto = new ArrayList<StudentDto>();
		dataFile = "src/data.txt";
		try {
			is = new FileInputStream(dataFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan = new Scanner(is);

	}

	@Override
	public void saveStudent() {

		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] lines = line.split(",");
			
			StudentDto stdDto = new StudentDto();
			try {
				stdDto.stdNum = lines[0];
				stdDto.stdName = lines[1];
				stdDto.stdDept = lines[2];
				stdDto.stdGrade = lines[3];
				stdDto.stdAddr = lines[4];
				stdDto.stdTel = lines[5];

			} catch (Exception e) {
				System.out.println("데이터 읽는 중 오류 발생");
				System.out.println(line);
				break;
			}
			studentDto.add(stdDto);
			System.out.println(line);
			
		}
	}

	@Override
	public void findName() {
		this.saveStudent();
		Line.dLine(50);
		System.out.println("찾는 학생이름을 입력하세요(종료하려면 QUIT를 입력)");
		Line.sLine(50);
		System.out.print("이름 >> ");
		

		}

	

	@Override
	public void printData() {
		
		this.findName();
		
		Scanner scans = new Scanner(System.in);
		String str = scans.nextLine();
		if(str.equals("QUIT")) {
			System.out.println("프로그램 종료");
			return;
		}
		for(int i = 0; i < studentDto.size(); i++) {
			if(str.equals(studentDto.indexOf(str))) {
				System.out.println("같다");
			} else {
				System.out.println("다르다");
				
				break;
			}
		}

	}

}
