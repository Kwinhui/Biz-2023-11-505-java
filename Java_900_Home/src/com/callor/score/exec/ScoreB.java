package com.callor.score.exec;

import com.callor.score.exec.service.ScoreDtoB;
import com.callor.score.service.ScoreServiceB;

public class ScoreB {
	public static void main(String[] args) {
		ScoreServiceB score = new ScoreServiceB();
		ScoreDtoB scDto = new ScoreDtoB();
		
		scDto.kor = score.inputScore("국어점수를", 50, 100);
		scDto.eng = score.inputScore("영어점수를", 50, 100);
		scDto.math = score.inputScore("수학점수를", 50, 100);
		
		System.out.println(scDto.getTotal());
		
		
	}
}
