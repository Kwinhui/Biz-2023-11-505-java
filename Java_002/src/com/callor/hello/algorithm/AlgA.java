package com.callor.hello.algorithm;

public class AlgA {
	public static void main(String[] args) {
		
		/*
		 * 1~100 까지 숫자중의 3의 배수의 합
		 */
		
		int sum = 0;
		
		for (int i = 0; i < 100; i++) {
			if ((i + 1) % 3 == 0) 
				sum += (i + 1);
			
		}
		System.out.println("1부터 100까지 숫자 중 3의 배수의 합 : " + sum);
		
	}
}
