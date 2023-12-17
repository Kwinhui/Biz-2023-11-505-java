package com.callor.hello.method;

public class MethodH {
	public static boolean isPrime(int num) {
		boolean isPrime = false;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				isPrime = true;
				return isPrime;
			}
		}
		
		return isPrime;
	}
	
	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			int num = (int)(Math.random() * 100) + 2;
			isPrime(num);
			if(isPrime(num)) {
				System.out.println(num + " 는 소수가 아님");
			} else {
				System.out.println(num + " 는 소수임");
			}
		}
		
		
	}
}
