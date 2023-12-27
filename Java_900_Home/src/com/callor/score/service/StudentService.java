package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.StudentDto;

public class StudentService {
	Scanner scan = null;
	List<StudentDto> studentList = null;
	public StudentService(String data) {
		InputStream is = null;
		try {
			is = new FileInputStream(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);
		studentList = new ArrayList<StudentDto>();
	}
	
	public void loadStudent() {
//		num name dept grade prof tel addr
		while(scan.hasNext()) {
			StudentDto studentDto = new StudentDto();
			String line = scan.nextLine();
			String[] lines = line.split(",");
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

			studentList.add(studentDto);
			
			
		}
		
		
		
	}
	
	
	
}
