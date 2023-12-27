package com.callor.score.model;

public class ScoreDto {
	// S0001,62,88,68,63,87,59,51
	
	public String num;
	public int kor;
	public int eng;
	public int math;
	public int music;
	public int art;
	public int sw;
	public int db;
	private int total;
	private float avg;
	
	
	public int getTotal() {
		total = kor;
		total += eng;
		total += math;
		total += music;
		total += art;
		total += sw;
		total += db;
		
		return total;
	}
	public float getAvg() {
		this.getTotal();
		avg = (float)total / 7;
		return avg;
	}
	@Override
	public String toString() {
		return "ScoreDto [num=" + num + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", music=" + music
				+ ", art=" + art + ", sw=" + sw + ", db=" + db + "]";
	}
	
}
