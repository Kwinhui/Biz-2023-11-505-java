package com.callor.hello.algorithm;

public class LoopK {
	public static void main(String[] args) {
		int num = 100;
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += i + 1;
			
		}
		System.out.printf("1부터 %d까지 덧셈 결과 : %d", num , sum);
	}

}
