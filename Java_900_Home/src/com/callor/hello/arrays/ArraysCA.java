package com.callor.hello.arrays;

public class ArraysCA {
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
		avg = (float)sum / scoreKors.length;
		for(int i = 0; i < scoreKors.length; i++) {
			System.out.printf("%d 번 : %d\n", i + 1, scoreKors[i]);
		}
		
		System.out.printf("총점 : %d, 평균 : %.2f\n", sum, avg);
	}
}
