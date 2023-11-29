package com.collor.hello.arrays;

public class ArraysF {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int SUBJECT_COUNT = 3; 
		int stdNum[] = new int[STUDENT_LENGTH];
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEngs = new int[STUDENT_LENGTH];
		int[] scoreMath = new int[STUDENT_LENGTH];
		int[] result = new int[STUDENT_LENGTH];
		float[] avg = new float[STUDENT_LENGTH];
		int sumKors = 0;
		int sumEngs = 0;
		int sumMath = 0;
		int sumResult = 0;
		float avgKors = 0;
		float avgEngs = 0;
		float avgMath = 0;
		float avgAvg = 0;
		for(int i = 0; i <STUDENT_LENGTH; i++) {
			stdNum[i] += i + 1;
		}
		
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			scoreKors[i] = (int)(Math.random() * 50) + 51;
			sumKors += scoreKors[i];
			avgKors = (float)sumKors / 10;
		}
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			scoreEngs[i] = (int)(Math.random() * 50) + 51;
			sumEngs += scoreEngs[i];
			avgEngs = (float)sumEngs / 10;
		}
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			scoreMath[i] = (int)(Math.random() * 50) + 51;
			sumMath += scoreMath[i];
			avgMath = (float)sumMath / 10;
		}
		
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			result[i] = scoreKors[i];
			result[i] += scoreEngs[i];
			result[i] += scoreMath[i];
			sumResult += result[i];
		}
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			avg[i] = (float)result[i] / 3;
			avgAvg += avg[i] / 10;
		}
		
		System.out.println("=".repeat(80));
		System.out.println("-".repeat(80));
		System.out.println("\t\t 샛별반 성적표");
		System.out.println("-".repeat(80));
		System.out.println("학번\t 국어\t 영어\t 수학\t 총점\t 평균\t");
		System.out.println("-".repeat(80));
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			System.out.printf("%3d\t %3d\t %3d\t %3d\t %4d\t %5.2f\t\n", stdNum[i], scoreKors[i], scoreEngs[i], scoreMath[i], result[i], avg[i]);
		}
		System.out.printf("총점\t %d\t %d\t %d\t %d\t\n", sumKors, sumEngs, sumMath, sumResult);
		System.out.println("-".repeat(80));
		System.out.printf("평균\t %.2f\t %.2f\t %.2f\t\t %.2f\n", avgKors, avgEngs, avgMath, avgAvg);
		System.out.println("=".repeat(80));
		
		
		
		
		
		
		
	}

}
