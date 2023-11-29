package com.collor.hello.arrays;

public class ArraysB {
	public static void main(String[] args) {
		int[] scoreKors = new int[10];
		double average = 0;
		int result = 0;
		for (int i = 0; i < scoreKors.length; i++) {
			int rndNums = (int) (Math.random() * 50) + 51;
			scoreKors[i] = rndNums;
		}

		for (int i = 0; i < scoreKors.length; i++) {
			result += scoreKors[i];
			
		}
		average = ((double)result / scoreKors.length);
		System.out.printf("국어 점수 총점 : %d, %.2f\n", result, average);
		

	}
}
