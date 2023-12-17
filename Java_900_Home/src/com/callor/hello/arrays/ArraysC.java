package com.callor.hello.arrays;

import com.callor.hello.line.Line;

public class ArraysC {
	public static void main(String[] args) {
		int[] scoreKors = new int[10];
		int sum = 0;
		float avg = 0;
		for(int i = 0; i < scoreKors.length; i++) {
			scoreKors[i] = (int)(Math.random() * 50) + 51;
			
		}
		for(int i = 0; i < scoreKors.length; i++) {
			sum += scoreKors[i];
			
		}
		avg = (float) sum / scoreKors.length;
		Line.dLine(50);
		System.out.printf("국어 점수 총점 : %d, 평균 : %.2f\n", sum, avg);
		Line.dLine(50);
		
	}
}
