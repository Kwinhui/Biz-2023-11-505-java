package com.callor.student.exec;

import com.callor.student.service.StudentServiceV3A;

public class StudentExecB {
	public static void main(String[] args) {
		StudentServiceV3A stService = new StudentServiceV3A();
		stService.inputStudents();
		stService.printStudent();
 
		

		
	}
}
