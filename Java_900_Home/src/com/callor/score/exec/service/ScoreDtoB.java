package com.callor.score.exec.service;

public class ScoreDtoB {
	public int kor;
	public int eng;
	public int math;
	
	private int total;
	
	public int getTotal() {
		total = kor;
		total += eng;
		total += math;
		
		return total;
	}
	
	
}
