package com.callor.hello.arrays;

import com.callor.hello.line.Line;

public class arraysDA {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[10];
		int[] scoreEng = new int[10];
		int[] scoreMath = new int[10];
		int sum = 0;
		float avg = 0;
		
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			scoreKors[i] = (int)(Math.random() * 50) + 51;
			scoreEng[i] = (int)(Math.random() * 50) + 51;
			scoreMath[i] = (int)(Math.random() * 50) + 51;
			
		}
		Line.dLine(50);
		System.out.println("\t 샛별반 성적표");
		Line.sLine(50);
		System.out.println("국어\t영어\t수학\t총점\t평균");
		Line.sLine(50);
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			sum = scoreKors[i];
			sum += scoreEng[i];
			sum += scoreMath[i];
			avg = (float)sum / 3;
			System.out.printf("%d\t%d\t%d\t%d\t%.2f\n", scoreKors[i], scoreEng[i], scoreMath[i], sum, avg);
		}
		
		Line.dLine(50);
		
	}
}
