package com.callor.score.exec;

import com.callor.score.service.ScoreService;

public class Score {
	public static void main(String[] args) {
		
		ScoreService scoreService = new ScoreService();
		scoreService.makeScore(10);
		scoreService.printStdNum();
		
		
		
		
		
	}
}
