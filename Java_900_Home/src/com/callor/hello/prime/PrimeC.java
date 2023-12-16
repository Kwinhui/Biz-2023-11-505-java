package com.callor.hello.prime;

public class PrimeC {
	public static void main(String[] args) {
		int num = 9;
		boolean isPrime = false;
		int i = 0;
		for (i = 2; i < num; i++) {
			if(num % i == 0) {
				isPrime = true;
				break;
			} else {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.printf("%d MOD %d = %d", num, i, (num / i));
			System.out.printf(", %d 는 소수가 아님\n", num);
		} else {
			System.out.printf("%d 는 소수임", num);
			System.out.println();
		}

	}

}
