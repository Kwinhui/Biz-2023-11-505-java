package com.callor.hello.prime;

import com.callor.hello.line.Line;

public class PrimeH {
	public static void main(String[] args) {
		Line.dLine(50);
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			int num = i + 1;
			int index = 0;
			for (index = 2; index < num; index++) {
				if (num % index == 0) {

					break;
				}
			}
			if (index >= num) {
				sum += num;
			}
		}

		System.out.println("2 ~ 100까지 수 중 소수들의 합 : " + sum);
		Line.dLine(50);
	}

}
