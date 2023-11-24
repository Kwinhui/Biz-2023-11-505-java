package com.callor.hello.algorithm;

public class LoopJ {
	public static void main(String[] args) {
		
		/*
		 * sum 변수를 어디에서 선언할 것인가
		 */
		
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i + 1;
//			1. i = 0
//			sum = 0 + 1 > sum = 1
//			2. i = 1
//			sum = 1 + 1 > sum = 2
//			3. i = 2
//			sum = 2 + 2 > sum = 4
//			4. i = 3
//			sum = 4 + 3 > sum = 7
//			5. i = 4
//			sum = 7 + 4 > sum = 11
		}

		// 결과 출력은 어디에서 할 것인가
			
		System.out.println("1부터 10까지 합 : " + sum);
	}
}
