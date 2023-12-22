package com.callor.oop.service;

public class ScoreService {
	// 클래스 영역에 선언한 변수
	
	public int scoreKor = 0;
	public int scoreEng = 0;
	public int scoreMath = 0;
	

	private int scoreTotal = 0;
	private float scoreAvg = 0.0f;
	

	
	public int getScoreTotal() {
		scoreTotal = scoreKor;
		scoreTotal += scoreEng;
		scoreTotal += scoreMath;
		
		return scoreTotal;
	}
	public float getScoreAvg() {
		getScoreTotal();
		scoreAvg = (float)(scoreTotal) / 3;
		return scoreAvg;
	}
}
