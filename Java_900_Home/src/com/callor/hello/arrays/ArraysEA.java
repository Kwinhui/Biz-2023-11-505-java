package com.callor.hello.arrays;

import com.callor.hello.line.Line;

public class ArraysEA {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[10];
		int[] scoreEng = new int[10];
		int[] scoreMath = new int[10];
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;
		int sum = 0;
		float avg = 0;
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			scoreKors[i] = (int)(Math.random() * 50) + 51;
			scoreEng[i] = (int)(Math.random() * 50) + 51;
			scoreMath[i] = (int)(Math.random() * 50) + 51;
		}
		Line.dLine(50);
		System.out.println("\t샛별반 성적표");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		Line.sLine(50);
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			sum = scoreKors[i];
			sum += scoreEng[i];
			sum += scoreMath[i];
			avg = (float) sum / 3;
			korSum += scoreKors[i];
			engSum += scoreEng[i];
			mathSum += scoreMath[i];
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n", (i + 1), scoreKors[i], scoreEng[i], scoreMath[i], sum, avg);
		}
		Line.sLine(50);
		System.out.printf("총점\t%d\t%d\t%d\n", korSum, engSum, mathSum);
		
	}
}
