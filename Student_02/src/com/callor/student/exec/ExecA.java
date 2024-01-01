package com.callor.student.exec;

import com.callor.student.impl.StudentServiceImplV1;
import com.callor.student.service.StudentService;

public class ExecA {
	public static void main(String[] args) {
		StudentService stService = new StudentServiceImplV1();
		stService.loadStd();
		stService.searchStd();
		
	}
}
