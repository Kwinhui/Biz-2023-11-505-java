package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersF {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = numService.inputNum("정수를");
		Line.sLine(50);
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if(i == num || j == num) {
					System.out.printf("%d x %d = %d\n", i, j, i*j);
				}
			}
		}
		
		
		
		
	}
}
