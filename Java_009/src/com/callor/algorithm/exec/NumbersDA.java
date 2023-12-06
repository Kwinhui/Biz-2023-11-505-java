package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersDA {
	public static void main(String[] args) {
		Line.dLine(50);
		NumberService numService = new NumberService();
		int sum = 0;
		int num = 0;
		int count = 0;
		while(sum < 1000) {
			num = numService.inputNum("숫자를");
			count++;
			sum += num;
			
		}
		Line.sLine(50);
		System.out.printf("%d 번 입력한 숫자 총 합 : %d\n" , count, sum);
		Line.dLine(50);
		
	}
}
