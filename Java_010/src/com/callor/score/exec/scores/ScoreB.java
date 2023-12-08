package com.callor.score.exec.scores;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;

public class ScoreB {
	public static void main(String[] args) {
		ScoreDto score = new ScoreDto();
		NumberService numService = new NumberService();
		
		score.kor = numService.inputNumber("국어 점수를", 50, 100);
		score.eng = numService.inputNumber("영어 점수를", 50, 100);
		score.math = numService.inputNumber("수학 점수를", 50, 100);
		
		
		int total = score.getTotal();
		
		System.out.println("총점 : " + total);
		
		
		
	}

}
