package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersH {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		int sum = 0;
		float avg = 0;
		Line.dLine(50);
		for(int i = 0; i < 3; i++) {
			int score = numService.inputNum("점수를");
			sum += score;
		}
		Line.sLine(50);
		avg = sum / 3;
		if (avg >= 60) {
			System.out.println("합격입니다");
		} else System.out.println("낙제입니다");
		
		
			
			
		
	}
}
