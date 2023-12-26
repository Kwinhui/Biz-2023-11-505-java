package com.callor.student.exec;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StartServiceImplV3;
import com.callor.student.service.impl.StudentServiceImplV2;


public class MainExA {
	public static void main(String[] args) {
		String studentDataFile = "/src/com/callor/student/data/student.txt";

		StudentService stService = new StudentServiceImplV2();
		StartService start = new StartServiceImplV3(stService);
		start.selectMenu();
		



		start.startApp();
		
		
		
		
	}
}
