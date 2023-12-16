package com.callor.hello.prime;

import com.callor.hello.line.Line;

public class PrimeE {
	public static void main(String[] args) {
		Line.dLine(50);
		System.out.println("소수판별하기");
		Line.sLine(50);
		for (int i = 0; i < 5; i++) {
			int index = 0;
			int rndNum = (int) (Math.random() * 100) + 2;
			boolean isPrime = false;
			for (index = 2; index < rndNum; index++) {
				if (rndNum % index == 0) {
					isPrime = true;
					break;
				}
			}
			if(isPrime) {
				System.out.printf("%d MOD %d = %d,\t %d 는 소수가 아님\n", rndNum, index, (rndNum % index), rndNum);
			} else {
				System.out.printf("%d 는 소수임\n", rndNum);
			}
				
		}
		Line.dLine(50);
	}
}
