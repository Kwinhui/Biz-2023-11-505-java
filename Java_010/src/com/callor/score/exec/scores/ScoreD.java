package com.callor.score.exec.scores;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.service.NumberService;
import com.callor.score.utils.Line;

public class ScoreD {
	
	public static void main(String[] args) {
		List<ScoreDto> scores = new ArrayList<ScoreDto>();
		NumberService numService = new NumberService();
		int start = 50;
		int end = 100;
		for(int i = 0; i < 3; i++) {
			ScoreDto scoreDto = new ScoreDto();
			String strNum = String.format("S%05d", i + 1);
			int kor = numService.inputNumber(strNum + " 번의 국어의", start, end);
			int eng = numService.inputNumber(strNum + " 번의 영어의", start, end);
			int math = numService.inputNumber(strNum + " 번의 수학의", start, end);
			scoreDto.stdNum = strNum;
			scoreDto.kor = kor;
			scoreDto.eng = eng;
			scoreDto.math = math;
			scores.add(scoreDto);
		}
		Line.dLine(50);
		System.out.println("성적 리스트");
		Line.dLine(50);
		System.out.println("학번\t국어\t영어\t수학\t총점");
		Line.sLine(50);
		for (int i = 0; i < scores.size(); i++) {
			ScoreDto dto = scores.get(i);
			
			System.out.printf("%s\t %d\t %d\t %d\t %d\n", dto.stdNum, dto.kor, dto.eng, dto.math, dto.getTotal());
			
		}
		Line.dLine(50);
					
		
		
				
	}
}
