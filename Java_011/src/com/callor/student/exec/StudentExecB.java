package com.callor.student.exec;

import com.callor.student.service.StudentServiceV2;

public class StudentExecB {
	public static void main(String[] args) {
		StudentServiceV2 stService = new StudentServiceV2();
		stService.inputStudents();
		
		
		boolean bYes = stService.check();
		if(bYes) {
			System.out.println("있다");
		}
		else {
			System.out.println("없다");
		}
		
	}
}
