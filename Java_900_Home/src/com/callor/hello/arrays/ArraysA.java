package com.callor.hello.arrays;

import com.callor.hello.line.Line;

public class ArraysA {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int rndNum = (int)(Math.random() * 50) + 51;
			int[] arr = new int[rndNum];
			
			sum += rndNum;
			System.out.println((i + 1) + " 번째 값 : " + arr.length);
			
		}
			
		Line.sLine(50);
		System.out.println("합산 결과 : " + sum);
		Line.dLine(50);
	}
	
	
}
