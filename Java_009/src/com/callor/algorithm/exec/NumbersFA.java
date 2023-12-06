package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersFA {
	public static void main(String[] args) {
		
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = numService.inputNum("정수를");
		
		for (int dan = 2; dan < 10; dan++) {
			for (int item = 1; item < 10; item++) {
				if ((dan * item) % num == 0) {
					
				System.out.printf("%d x %d = %d\n", dan, item, dan * item);
				}
			} // end or j

			Line.sLine(50);

		} // end for i

	}
}
