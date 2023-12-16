package com.callor.hello.algorithm;

public class LoopK {
	public static void main(String[] args) {
		int sum = 0;
		int firstCount = 1;
		int i = 0;
		for(i = 0; i < 35; i++) {
			sum += (i + 1);
		}
			
		System.out.printf("%d ~ %d 까지 덧셈 결과 : %d", firstCount, i, sum);
		
		
	}
}
