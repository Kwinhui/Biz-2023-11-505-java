package com.collor.hello.scores;

import com.collor.hello.service.ScoreService;

public class ScoresA {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKores = ScoreService.score(STUDENT_LENGTH);
		int[] scoreEngs = ScoreService.score(STUDENT_LENGTH);
		int[] scoreMaths = ScoreService.score(STUDENT_LENGTH);
		int[] scoreMusics = ScoreService.score(STUDENT_LENGTH);
		int[] scoreHiss = ScoreService.score(STUDENT_LENGTH);
		
		for(int i = 0; i < scoreKores.length; i++) {
			System.out.printf("%3d\t", scoreKores[i]);
			System.out.println(ScoreService.gradeScore(scoreKores[i]));
		}
		
	}

}
