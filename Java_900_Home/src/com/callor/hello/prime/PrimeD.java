package com.callor.hello.prime;

import com.callor.hello.line.Line;

public class PrimeD {
	public static void main(String[] args) {
		int rndNum = (int)(Math.random() * 10) + 2;
		boolean isPrime = false;
		int i = 0;
		for(i = 2; i < rndNum; i++) {
			if(rndNum % i == 0) {
				isPrime = true;
				break;
			} 
		}
		Line.dLine(50);
		System.out.printf("%d 는 Prime Number 인가?\n", rndNum);
		Line.dLine(50);
		if(isPrime) {
			System.out.printf("%d Mod %d = %d, %d 는 소수가 아님\n", rndNum, i, (rndNum % i), rndNum);
		} else {
			System.out.printf("%d 는 소수임", rndNum);
		}
		
		
	}
	
	
}
