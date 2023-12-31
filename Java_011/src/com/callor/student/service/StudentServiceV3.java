package com.callor.student.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.models.StudentDto;

/*
 * 키보드를 통해서 학생정보를 입력받고
 * StudentDto 에 추가한 다음 
 * List<StudentDto> Students 리스트에 추가하기
 */
public class StudentServiceV3 {

	// 클래스 영역에 선언된 변수(객체)들
	// 인스턴스 변수, 멤버변수
	// 클래스 영역에 선언된 변수나 객체는 private 으로 선언한다.
	// 다만 이 클래스를 누군가 상속하여 사용할 것 으로 예상되면
	// protected 으로 선언한다.
	private Scanner scan = null;
	
	private List<StudentDto> students = null;
	private String dataFile = "";
	private InputStream is = null;

	// 클래스 영역에 선언된 변수는 생성자 method 에서
	// 값을 초기화 하여 사용할 준비를 한다.
	public StudentServiceV3() {
		scan = new Scanner(System.in);
		students = new ArrayList<StudentDto>();
		dataFile = "src/com/callor/student/models/student.txt";


	}

	private String itemInput(String title) {
		while (true) {

			System.out.print(title + " 입력(QUIT:종료) >> ");
			String inputStr = scan.nextLine();
			// 아무런 값도 입력하지 않고 Enter 누르기 금지
			if (inputStr.isBlank() == true) {
				System.out.printf("*** %s 값은 반드시 입력!! \n", title);
				continue;
			}

			// 키보드로 QUIT를 입력하면?
			if (inputStr.equals("QUIT")) {
				return null;
			}
			return inputStr;
		}
	}

	// 한 학생의 정보를 입력받는 method
	public boolean inputStudent() {

		String strNum = null;
		String strName = null;
		String strDept = null;
		String strGrade = null;
		String strTel = null;
		String strAddr = null;
		// 입력한 학번이 이미 students 요소중에 있으면
		// 다시 학번을 입력받기 위하여
		// 학번 입력 부분을 무한 반복처리
		while (true) {
			strNum = this.itemInput("학번");
			if (strNum == null)
				return false;

			// 학번에서 아무 값도 입력하지 않고 enter를 눌렀을때


			int index = 0;
			int size = students.size();
			for (index = 0; index < size; index++) {
				if (students.get(index).num.equals(strNum)) {
					break;
				}
			} // end for
			if (index < size) {
				System.out.println("** 학번 중복 **");
				continue;
			} else {
				
				break;
			}

			
		}	// end while
		strName = this.itemInput("이름");
		if (strName == null)
			return false;
		strDept = this.itemInput("학과");
		if (strDept == null)
			return false;
		strGrade = this.itemInput("학년");
		if (strGrade == null)
			return false;
		strTel = this.itemInput("전화번호");
		if (strTel == null)
			return false;
		strAddr = this.itemInput("주소");
		if (strAddr == null)
			return false;

		StudentDto stdDto = new StudentDto();
		stdDto.num = strNum;
		stdDto.name = strName;
		stdDto.dept = strDept;
		stdDto.grade = strGrade;
		stdDto.tel = strTel;
		stdDto.addr = strAddr;
		students.add(stdDto);
		return true;
	} // end inputStudent()

	public void inputStudents() {
		while (true) {
			boolean bYes = this.inputStudent();
//			if(bYes == false) {
//			if(bYes != true) {
			if (!bYes) {
				break;
			}

		} // end while
		System.out.println("업무 종료!!");
	}
	
	
	
	public void printStudent() {
		System.out.print("학번\t이름\t학과\t학년\t전화번호\t주소\n");
		for(StudentDto dto : students) {
//			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n", dto.num, dto.name, dto.dept, dto.grade, dto.tel, dto.addr);
			System.out.printf("%s\t", dto.num);
			System.out.printf("%s\t", dto.name);
			System.out.printf("%s\t", dto.dept);
			System.out.printf("%s\t", dto.grade);
			System.out.printf("%s\t", dto.tel);
			System.out.printf("%s\t\n", dto.addr);
		}
	}	// end printStudent()

	public void loadStudent() {
		
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);
		while(scan.hasNext()) {
			String file = scan.nextLine();
			String[] files = file.split(",");
			StudentDto std = new StudentDto();
			
			try {
				std.num = files[0];
				std.name = files[1];
				std.dept = files[2];
				std.grade = files[3];
				std.tel = files[4];
				std.addr = files[5];
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("데이터 읽는 중 오류 발생");
				System.out.println(file);
				break;
			}
			students.add(std);
			
		}
		for(StudentDto dto : students) {
			System.out.print(dto.num + "\t");
			System.out.print(dto.name + "\t");
			System.out.print(dto.dept + "\t");
			System.out.print(dto.grade + "\t");
			System.out.print(dto.tel + "\t");
			System.out.println(dto.addr);
			
		}
		
		
		
	}
	
	
}
