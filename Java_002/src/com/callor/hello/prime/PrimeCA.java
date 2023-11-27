package com.callor.hello.prime;

public class PrimeCA {
	public static void main(String[] args) {
		int num = 9;
		boolean noPrime = false;
		int i = 0;
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				// prime 이 아니다.
				noPrime = true;
				break;
			}
		}
		if(noPrime) {
			System.out.printf("%d MOD %d = %d, ", num, i, num % i);
			System.out.println(num + " 는 소수가 아님");
		}
		else {
			System.out.println(num + " 는 소수임");
		}
		
	}
}
