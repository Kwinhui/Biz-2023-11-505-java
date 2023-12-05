package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.StudentDto;
import com.callor.score.utils.Line;

public class StudentService {
	private Scanner scan = null;
	private List<StudentDto> students = null;

	public StudentService(String dataFile) {
		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);

		students = new ArrayList<>();

	} // end StudentService()

	public void loadStudents() {
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] lines = line.split(",");
			StudentDto studentDto = new StudentDto();
			// 학번,이름,학과,학년,담임교수,전화번호,주소,,
			try {
				studentDto.num = lines[0];
				studentDto.name = lines[1];
				studentDto.dept = lines[2];
				studentDto.grade = lines[3];
				studentDto.prof = lines[4];
				studentDto.tel = lines[5];
				studentDto.addr = lines[6];

			} catch (Exception e) {
				System.out.println("데이터 읽는 중 오류 발생");
				System.out.println(line);
				break;
			}

			students.add(studentDto);

		}

	} // end loadStudents()

	public void printStudent() {

		Line.dLine(180);
		System.out.println("학번\t   이름\t\t\t 학과\t\t      학년\t\t 담임교수\t\t\t 전화번호\t\t\t 주소");
		Line.sLine(180);
		
		
		
		
		for (int i = 0; i < students.size(); i++) {
			StudentDto studentDto = students.get(i);
			System.out.printf("%s\t", studentDto.num);
			System.out.printf("%5s\t\t", studentDto.name);
			System.out.printf("%s\t\t", studentDto.dept);
			System.out.printf("%s\t\t", studentDto.grade);
			System.out.printf("%6s\t\t\t", studentDto.prof);
			System.out.printf("%13s\t\t", studentDto.tel);
			System.out.printf("%s\t\n", studentDto.addr);
		}
		Line.dLine(180);
	}	// end printStudent()

}
