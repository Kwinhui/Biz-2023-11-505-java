package com.callor.score.exec;

import com.callor.score.service.StudentService;

public class Student {
	public static void main(String[] args) {
		String dataFile1 = "src/com/callor/score/service/student.txt";
		StudentService studentService = new StudentService(dataFile1);
		studentService.loadStudents();
		studentService.printStudent();
	}

}
