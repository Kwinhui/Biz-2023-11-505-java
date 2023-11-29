package com.collor.hello.arrays;

public class ArraysG {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			scoreKors[i] = (int) (Math.random() * 50) + 51;
		}
		System.out.println("-".repeat(30));
		System.out.println("국어\t 평점");
		System.out.println("-".repeat(30));
		for (int i = 0; i < STUDENT_LENGTH; i++) {
			String gradeScore = "F";
			if (scoreKors[i] >= 95) {
				gradeScore = "A+";
				System.out.printf("%d\t %s\n", scoreKors[i], gradeScore);
			} else if (scoreKors[i] >= 90) {
				gradeScore = "A";
				System.out.printf("%d\t %s\n", scoreKors[i], gradeScore);
			} else if (scoreKors[i] >= 85) {
				gradeScore = "B+";
				System.out.printf("%d\t %s\n", scoreKors[i], gradeScore);

			} else if (scoreKors[i] >= 80) {
				gradeScore = "B";
				System.out.printf("%d\t %s\n", scoreKors[i], gradeScore);
			} else if (scoreKors[i] >= 75) {
				gradeScore = "C+";
				System.out.printf("%d\t %s\n", scoreKors[i], gradeScore);
			} else if (scoreKors[i] >= 70) {
				gradeScore = "C";
				System.out.printf("%d\t %s\n", scoreKors[i], gradeScore);

			} else if (scoreKors[i] >= 65) {
				gradeScore = "D+";
				System.out.printf("%d\t D+\n", scoreKors[i], gradeScore);

			} else if (scoreKors[i] >= 60) {
				gradeScore = "D";
				System.out.printf("%d\t %s\n", scoreKors[i], gradeScore);
			} else {
				System.out.printf("%d\t %s\n", scoreKors[i], gradeScore);

			}

		}
		
		
	}
}
