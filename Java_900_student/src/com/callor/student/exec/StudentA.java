package com.callor.student.exec;

import com.callor.student.impl.StudetnServiceImplV1;
import com.callor.student.service.StudentService;

public class StudentA {
	public static void main(String[] args) {
		StudentService stService = new StudetnServiceImplV1();
		stService.inputStudent();
		
		
		
	}
}
