package com.callor.hello.method;
public class MethodH {

public static boolean isPrime(int num) {
	int index = 0;
	boolean isPrime = false;
	
	for(index = 2; index < num; index++) {
		if (num % index == 0) {
			isPrime = true;
			break;
		}
	}
	return isPrime;
	
}

	public static void main(String[] args) {
		System.out.println("==========================");
		System.out.println("소수판별하기");
		System.out.println("--------------------------");
		for (int i = 0; i < 5; i++) {
			
			int num = (int)(Math.random() * 100) + 2;
			boolean isPrime = isPrime(num);
			if (isPrime) {
				System.out.printf("%d 는 소수가 아니다\n", num);
			} else {
				System.out.printf("%d 는 소수\n", num);
				
			}
		}
		System.out.println("==========================");
				
	}
	
	
}
			
			
