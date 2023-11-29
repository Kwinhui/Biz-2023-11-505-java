package com.collor.hello.arrays;



public class ArraysD {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		int[] scoreEng = new int[STUDENT_LENGTH];
		int[] scoreMath = new int[STUDENT_LENGTH];
		int[] sum = new int[STUDENT_LENGTH];
		float[] Avg = new float[STUDENT_LENGTH];
		
		// 국어점수
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			int rndScore = (int)(Math.random() * 50) + 51;
			scoreKors[i] += rndScore;
		}
		// 영어점수
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			int rndScore = (int)(Math.random() * 50) + 51;
			scoreEng[i] += rndScore;
		}
		// 수학점수
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			int rndScore = (int)(Math.random() * 50) + 51;
			scoreMath[i] += rndScore;
		}

		
		
		// 총점
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			sum[i] += scoreKors[i] + scoreEng[i] + scoreMath[i];
		}
		
		// 평균
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			Avg[i] += (float)sum[i] / 3;
		}
		
		
		
		
		
												
		
		System.out.println("=".repeat(100));
		System.out.println("\t\t\t\t샛별반 성적표");
		System.out.println("-".repeat(100));
		
		for(int i = 0; i < 1; i++) {
			System.out.print("국어\t\t 영어\t\t 수학\t\t 총점\t\t 평균\n");
		}
		System.out.println("-".repeat(100));
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			System.out.printf("%3d\t\t %3d\t\t %3d\t\t %3d\t\t %3.2f\n", scoreKors[i], scoreEng[i], scoreMath[i], sum[i], Avg[i]);
		}
	
		
		
		

		
	
		
		
		
			
		
		
	}

}
