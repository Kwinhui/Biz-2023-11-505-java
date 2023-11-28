package com.callor.hello.method;

public class MethodHI {
	public static int isPrime(int num) {
		;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + " 소수가 아니다");
				return 0;
			}
		}
		
		System.out.println(num + " 는 소수이다");
		return num;


	}

	public static void main(String[] args) {
		System.out.println("=================================");
		System.out.println("소수 합 구하기");
		System.out.println("---------------------------------");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 100) + 2;
			int index = isPrime(num);
			if (index > 0) {
				sum += num;		
				
			} else {		

			}
		}

		System.out.println("소수의 합 = " + sum);
		System.out.println("=================================");
	}

}
