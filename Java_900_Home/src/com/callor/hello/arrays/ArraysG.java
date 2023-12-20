package com.callor.hello.arrays;

public class ArraysG {
	public static void main(String[] args) {
		int STUDENT_LENGTH = 10;
		int[] scoreKors = new int[STUDENT_LENGTH];
		for(int i = 0; i < STUDENT_LENGTH; i++) {
			int rndNum = (int)(Math.random() * 50) + 51;
			scoreKors[i] += rndNum;
//			System.out.println(scoreKors[i]);
			
			String grade = "F";
			if(scoreKors[i] >= 95 ) grade = "A+";
			else if (scoreKors[i] >= 90) grade = "A";
			else if (scoreKors[i] >= 85) grade = "B+";
			else if (scoreKors[i] >= 80) grade = "B";
			else if (scoreKors[i] >= 75) grade = "C+";
			else if (scoreKors[i] >= 70) grade = "C";
			else if (scoreKors[i] >= 65) grade = "D+";
			else if (scoreKors[i] >= 60) grade = "D";
			else grade = "F";
			
			System.out.printf("%d 번 학생 점수 : %d, 등급 : %s\n", (i + 1), scoreKors[i], grade);
		}
			
		
		
		
		
		
	}
}
