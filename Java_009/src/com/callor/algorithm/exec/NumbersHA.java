package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersHA {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		
		float avg = 0;
		Line.dLine(50);

		int score1 = numService.inputNum("첫 번째 과목 점수를");
		int score2 = numService.inputNum("두 번째 과목 점수를");
		int score3 = numService.inputNum("세 번째 과목 점수를");
		int total = score1 + score2 + score3;

		Line.sLine(50);
		avg = total / 3;
		if (avg >= 60) {
			System.out.println("합격입니다");
		} else
			System.out.println("낙제입니다");

	}
}
