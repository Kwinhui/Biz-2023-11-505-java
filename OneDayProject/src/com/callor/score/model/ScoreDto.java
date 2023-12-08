package com.callor.score.model;

public class ScoreDto {
	public int students;
	public String stdNum;
	public int kor;
	public int eng;
	public int math;
	public int music;
	public int art;
	
//	public int sumKor;
//	public int sumEng;
//	public int sumMath;
//	public int sumMusic;
//	public int sumArt;
//	public int sumKorAvg;
//	
//	public int sumTotal;
//	private float sumAvg;
//	public int getSumTotal() {
//		sumTotal = sumKor;
//		sumTotal += sumEng;
//		sumTotal += sumMath;
//		sumTotal += sumMusic;
//		sumTotal += sumArt;
//		return sumTotal;
//	}
	
	
	
	
	private int total;
	private float avg;
	
	
	
	public int getTotal() {
		total = kor;
		total += eng;
		total += math;
		total += music;
		total += art;
		
		return total;
		
	}
	
	public float getAvg() {
		getTotal();
		
		avg = (float) getTotal() / 5;
		
		return avg;
	}
	
}
