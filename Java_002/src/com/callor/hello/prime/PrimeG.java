package com.callor.hello.prime;

public class PrimeG {
	public static void main(String[] args) {
		System.out.println("============================");
		System.out.println("2 ~ 100까지 수 중 소수만 출력하기");
		System.out.println("----------------------------");
		
		for (int i = 1; i < 100; i++) {
			int num = i + 1;
			int index = 0;
			for (index = 2; index < num; index++) {
				if ((num) % index == 0) {
					break;
				}
			}
			if (index >= num) {
				System.out.println(num);
			}
		}


	}

}
