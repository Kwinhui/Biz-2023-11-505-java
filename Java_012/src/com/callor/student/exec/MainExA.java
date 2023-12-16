package com.callor.student.exec;

import com.callor.student.service.StartService;
import com.callor.student.service.StudentService;
import com.callor.student.service.impl.StartServiceImplV3;
<<<<<<< HEAD
import com.callor.student.service.impl.StudentServiceImplV2;
=======
import com.callor.student.service.impl.StudentServiceImplV1;
>>>>>>> caf1cc29be28f2c3c0c09a72a07048c0095424a2

public class MainExA {
	public static void main(String[] args) {
		String studentDataFile = "/src/com/callor/student/data/student.txt";
<<<<<<< HEAD
		StudentService stService = new StudentServiceImplV2();
		StartService start = new StartServiceImplV3(stService);
		start.selectMenu();
=======
		StudentService stService = new StudentServiceImplV1();
		StartService start = new StartServiceImplV3(stService);

>>>>>>> caf1cc29be28f2c3c0c09a72a07048c0095424a2
		start.startApp();
		
		
		
		
	}
}
