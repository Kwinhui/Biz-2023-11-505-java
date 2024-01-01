package com.callor.student.exec;

import com.callor.student.impl.StartServiceImplV1;
import com.callor.student.service.StartService;

public class ExecA {
	public static void main(String[] args) {
		StartService stService = new StartServiceImplV1();
//		StdServiceImplV1 stdService = new StdServiceImplV1();
		stService.startApp();
		
		
		
		
	}
}
