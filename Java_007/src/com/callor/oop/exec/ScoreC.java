package com.callor.oop.exec;

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
		
		// 배열에 저장된 점수 화면에 출력하기
		System.out.println("=".repeat(50));
		System.out.println("국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("-".repeat(50));
		for(int i = 0; i < 5; i++) {
			System.out.printf("%3d\t %3d\t %3d\t %3d\t %.2f\n", scores[i].scoreKor, scores[i].scoreEng,
					scores[i].scoreMath, scores[i].getScoreTotal(), scores[i].getScoreAvg());
		}
		System.out.println("=".repeat(50));
		
		

	}
}
