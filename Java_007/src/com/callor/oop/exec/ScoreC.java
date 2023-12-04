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
		

	}
}
