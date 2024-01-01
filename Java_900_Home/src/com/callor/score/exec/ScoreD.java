package com.callor.score.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.hello.line.Line;
import com.callor.score.exec.service.ScoreDtoB;
import com.callor.score.service.ScoreServiceB;

public class ScoreD {
	public static void main(String[] args) {
		List<ScoreDtoB> scores = new ArrayList<ScoreDtoB>();
		int scoreKor = 0;
		int scoreEng = 0;
		int scoreMath = 0;
		ScoreServiceB scService = new ScoreServiceB(); 
		for(int i = 0; i < 3; i++) {
			ScoreDtoB scDto = new ScoreDtoB();
			
			scoreKor = scService.inputScore("국어점수를 ", 50, 100);
			scoreEng = scService.inputScore("영어점수를 ", 50, 100);
			scoreMath = scService.inputScore("수학점수를 ", 50, 100);
			
			scDto.kor = scoreKor;
			scDto.eng = scoreEng;
			scDto.math = scoreMath;
			
			scores.add(scDto);
		}
		Line.dLine(50);
		System.out.println("성적 리스트");
		Line.dLine(50);
		System.out.println("학번\t국어\t영어\t수학\t총점");
		Line.sLine(50);
		for(int i = 0; i < scores.size(); i++) {
			ScoreDtoB dto = scores.get(i);
			System.out.printf("S000%d\t%d\t%d\t%d\t%d\n", (i + 1), dto.kor, dto.eng, dto.math, dto.getTotal());
			
		}
		Line.dLine(50);
		
	}
}
