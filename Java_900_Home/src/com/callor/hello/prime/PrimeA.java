package com.callor.hello.prime;

import com.callor.hello.line.Line;

public class PrimeA {
	public static void main(String[] args) {
		Line.dLine(50);
		System.out.println("9는 Prime Number 인가?");
		Line.sLine(50);
		int num = 9;
		for(int i = 2; i < num; i++) {
			System.out.printf("%d MOD %d = %d\n", num, i, (num % i));
		}
		
		
	}
}
