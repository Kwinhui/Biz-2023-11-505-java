package com.callor.hello.arrays;

import com.callor.hello.line.Line;

public class ArraysF {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[10];
		int[] scoreEng = new int[10];
		int[] scoreMath = new int[10];
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int sumSum = 0;
		int sum = 0;
		float avg = 0;
		float sumAvg = 0;
		Line.dLine(50);
		System.out.println("\t샛별반 성적표");
		Line.sLine(50);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		Line.sLine(50);
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			scoreKors[i] = (int)(Math.random() * 50) + 51;
			scoreEng[i] = (int)(Math.random() * 50) + 51;
			scoreMath[i] = (int)(Math.random() * 50) + 51;
		}
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			sum = scoreKors[i];
			sum += scoreEng[i];
			sum += scoreMath[i];
			avg = (float)sum / 3;
			sumKor += scoreKors[i];
			sumEng += scoreEng[i];
			sumMath += scoreMath[i];
			sumSum += sum;
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n", (i + 1), scoreKors[i], scoreEng[i], scoreMath[i], sum, avg);
			sumAvg += avg / 10;
		}
		Line.sLine(50);
		
		System.out.printf("총점\t%d\t%d\t%d\t%d\n", sumKor, sumEng, sumMath, sumSum);
		float avgSumKor = (float)sumKor / STUDENT_LENGTH;
		float avgSumEng = (float)sumEng / STUDENT_LENGTH;
		float avgSumMath = (float)sumMath / STUDENT_LENGTH;
		
		System.out.printf("평균\t%.2f\t%.2f\t%.2f\t\t%.2f\n", avgSumKor, avgSumEng, avgSumMath, sumAvg);
		
		
	}
}
