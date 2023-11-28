package com.callor.hello.method;

public class MethodG {

	public static boolean isPrime(int num) {

		int index = 0;
		boolean isPrime = false;

		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				isPrime = true;
				break;
			}
		}
		return isPrime;

	}

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
		boolean isPrime = isPrime(num);
		if (isPrime) {
			System.out.printf("%d = 소수가 아니다", num);
		} else {
			System.out.printf("%d = 소수", num);
		}

	}
}
