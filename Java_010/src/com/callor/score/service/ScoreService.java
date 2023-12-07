package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;

public class ScoreService {
	private List<ScoreDto> scores = null;
	private NumberService numService = null;
	
	public ScoreService() {
		scores = new ArrayList<ScoreDto>();
		numService = new NumberService();
	}
	public void inputScore() {
		
		ScoreDto scoreDto = new ScoreDto();
		int scoreKor = numService.inputNumber("국어의");
		int scoreEng = numService.inputNumber("영어의");
		int scoreMath = numService.inputNumber("수학의");
		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math = scoreMath;
		scores.add(scoreDto);
		
	} // end inputScore
		
	public void inputScore(int start, int end) {
		int scoreKor = numService.inputNumber("국어의", start, end);
		int scoreEng = numService.inputNumber("영어의", start, end);
		int scoreMath = numService.inputNumber("수학의", start, end);
		ScoreDto scoreDto = new ScoreDto();
		scoreDto.kor = scoreKor;
		scoreDto.eng = scoreEng;
		scoreDto.math = scoreMath;
		scores.add(scoreDto);
		
		
		
	}
		
		
}
