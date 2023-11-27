package com.callor.hello.prime;

public class PrimeE {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 2;
			int index = 0;
			boolean isPrime = false;

			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					isPrime = true;
					break;

				}
				if (isPrime) {
					System.out.printf("%d MOD %d = %d, %d는 소수가 아님\n", num, index, (num % index), num);

				} else {
					System.out.printf("%d 는 소수임\n", num);

				}
			}
		}

	}
}
