package com.callor.oop.exec;

import com.callor.hello.line.Line;
import com.callor.oop.service.ScoreService;

public class ScoreC {
		public static void main(String[] args) {
			ScoreService[] scores = new ScoreService[10];

			for (int i = 0; i < scores.length; i++) {
				scores[i] = new ScoreService();
			}
			for (int i = 0; i < scores.length; i++) {
				 
				scores[i].scoreKor = (int)(Math.random() * 50) + 51;
				
				scores[i].scoreEng = (int)(Math.random() * 50) + 51;
				
				scores[i].scoreMath = (int)(Math.random() * 50) + 51;
			}
			
			Line.dLine(50);
			System.out.println("국어\t영어\t수학\t총점\t평균");
			Line.sLine(50);
			for(int i = 0; i < scores.length; i++) {
				System.out.printf("%d\t%d\t%d\t%d\t%.2f\n", scores[i].scoreKor, scores[i].scoreEng, scores[i].scoreMath,
						scores[i].getScoreTotal(), scores[i].getScoreAvg());
			}
			
			
	}
}
