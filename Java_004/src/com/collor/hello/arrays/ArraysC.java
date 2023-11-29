package com.collor.hello.arrays;

public class ArraysC {
	public static void main(String[] args) {
		int[] scoreKors = new int[10];
		int sum = 0;
		float avg = 0;
		
		System.out.println("=".repeat(50));
		System.out.println("                  샛별반 국어 점수");
		System.out.println("-".repeat(50));
		
		// 데이터 저장
		for(int i = 0; i < scoreKors.length; i++) {
			int rndNum = (int)(Math.random() * 50) + 51;
			scoreKors[i] = rndNum;
		}
		for(int i = 0; i < scoreKors.length; i++) {
			sum += scoreKors[i];
		}
		
		
		// 평균 계산
		avg = (float) sum / scoreKors.length;
		
		
		// 출력
		for(int i = 0; i < scoreKors.length; i++) {
			System.out.printf("%3d 번 : %3d\n", i+1, scoreKors[i]);
		}

		System.out.println("-".repeat(50));
		System.out.printf("  총점 : %d, 평균 : %.2f\n", sum, avg);
		System.out.println("=".repeat(50));
	} 
}
