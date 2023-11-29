package com.collor.hello.arrays;

public class ArraysE {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] stdNums = new int[STUDENT_LENGTH];
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEng = new int[STUDENT_LENGTH];
		int[] scoreMath = new int[STUDENT_LENGTH];
		int[] sum = new int[STUDENT_LENGTH];
		float[] avg = new float[STUDENT_LENGTH];
		
		int sumKors = 0;
		int sumEngs = 0;
		int sumMath = 0;
		// 학번
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			stdNums[i] = i + 1;
		}
		
		// 국어
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			scoreKors[i] = (int)(Math.random() * 50) + 51;
			sumKors += scoreKors[i];
		}

		// 영어
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			scoreEng[i] = (int)(Math.random() * 50) + 51;
			sumEngs += scoreEng[i];
		}
		// 수학
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			scoreMath[i] = (int)(Math.random() * 50) + 51;
			sumMath += scoreMath[i];
		}
		// 총점
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			sum[i] = scoreKors[i];
			sum[i] += scoreEng[i];
			sum[i] += scoreMath[i];
		}
		// 평균
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			avg[i] = (float) sum[i] / 3;
		}
		
		System.out.println("=".repeat(80));
		System.out.println("\t\t\t샛별반 성적표");
		System.out.println("-".repeat(80));
		System.out.printf("학번\t 국어\t 영어\t 수학\t 총점\t 평균\n");
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			System.out.printf("%2d\t %3d\t %3d\t %3d\t %4d\t %4.2f\n", stdNums[i],scoreKors[i], scoreEng[i], scoreMath[i], sum[i], avg[i]);
			
		}
		System.out.println("-".repeat(80));
		System.out.printf("\t %3d\t %3d\t %3d\t\n", sumKors, sumEngs, sumMath);
		
		System.out.println("=".repeat(80));
		
		
	}
}
