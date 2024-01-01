package com.callor.student.exec;

import com.callor.student.service.StudentService3;

public class ExecA {
	public static void main(String[] args) {
		StudentService3 stService = new StudentService3();
		
		stService.StartService();
		stService.selectMenu();
	}
}
