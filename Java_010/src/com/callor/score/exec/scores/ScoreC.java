package com.callor.score.exec.scores;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.utils.Line;

public class ScoreC {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		List<ScoreDto> scores = new ArrayList<ScoreDto>();
		int start = 50;
		int end = 100;
		int scoreKor = 0;
		int scoreEng = 0;
		int scoreMath = 0;
		
		
		
		for (int i = 0; i < 3; i++) {
			ScoreDto scoreDto = new ScoreDto();
			scoreKor = numService.inputNumber("국어 점수를", start, end);
			scoreEng = numService.inputNumber("영어 점수를", start, end);
			scoreMath = numService.inputNumber("수학 점수를", start, end);
			
			scoreDto.kor = scoreKor;
			scoreDto.eng = scoreEng;
			scoreDto.math = scoreMath;
			

			scores.add(scoreDto);
		}
		Line.dLine(50);
		System.out.println("성적 리스트");
		Line.dLine(50);
		System.out.println("국어\t 영어\t 수학\t 총점");
		Line.sLine(50);
		for(int i = 0; i < scores.size(); i++) {
			ScoreDto dto = scores.get(i);
			System.out.printf("%d\t %d\t %d\t %d\n", dto.kor, dto.eng, dto.math, dto.getTotal());
			

		}


		
		

	}
}
