package com.callor.hello.algorithm;

import com.callor.hello.line.Line;

public class AlgA {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 0; i < 100; i++) {
			if((i + 1) % 3 == 0) {
				sum += i + 1;
			}
		}
		System.out.println("3의 배수만의 덧셈 : " + sum);
		
		
		Line.dLine(50);
		/*
		 * 1 ~ 100 까지 숫자중 3의배수의 합과 5의 배수의 합을 구하고
		 * 4칙연산을 출력
		 */
		
		int sum_3 = 0;		// 3의배수의 총합
		int sum_5 = 0;		// 5의배수의 총합
		
		for(int i = 0; i < 100; i++) {
			if((i + 1) % 3 == 0) {
				sum_3 += (i + 1);
			}
			if((i + 1) % 5 == 0) {
				sum_5 += (i + 1);
			}
		}
		System.out.printf("3의배수 + 5의배수 = %d\n", (sum_3 + sum_5));
		System.out.printf("3의배수 - 5의배수 = %d\n", (sum_3 - sum_5));
		System.out.printf("3의배수 * 5의배수 = %d\n", (sum_3 * sum_5));
		System.out.printf("3의배수 ÷ 5의배수 = %d\n", (sum_3 / sum_5));
		System.out.printf("3의배수 MOD 5의배수 = %d\n", (sum_3 % sum_5));
		
		
	}
}
