package com.callor.score.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.hello.line.Line;
import com.callor.score.exec.service.ScoreDtoB;
import com.callor.score.service.ScoreServiceB;

public class ScoreC {
	public static void main(String[] args) {
		List<ScoreDtoB> scores = new ArrayList<ScoreDtoB>();
		ScoreServiceB scService = new ScoreServiceB();
		int kor = 0;
		int eng = 0;
		int math = 0;
		for(int i = 0; i < 3; i++) {
			ScoreDtoB scoreDto = new ScoreDtoB();
			kor = scService.inputScore("국어점수를", 50, 100);
			eng = scService.inputScore("영어점수를", 50, 100);
			math = scService.inputScore("수학점수를", 50, 100);
			scoreDto.kor = kor;
			scoreDto.eng = eng;
			scoreDto.math = math;
			scores.add(scoreDto);
		}
		Line.dLine(50);
		System.out.println("성적 리스트");
		Line.dLine(50);
		System.out.println("국어\t영어\t수학\t총점");
		for (int i = 0; i < scores.size(); i++) {
			ScoreDtoB dto = scores.get(i);
			System.out.printf("%d\t%d\t%d\t%d\n", dto.kor, dto.eng, dto.math, dto.getTotal());
		}
		
	}
}
