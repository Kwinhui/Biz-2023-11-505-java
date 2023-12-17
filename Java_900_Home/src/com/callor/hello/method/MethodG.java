package com.callor.hello.method;

public class MethodG {
	public static boolean isPrime(int num) {
		boolean isPrime = false;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				isPrime = true;
				break;
			}
		}
		return isPrime;
		
	}
	
	public static void main(String[] args) {
		int rndNum = (int)(Math.random() * 100) + 2;
		isPrime(rndNum);
		
		if(isPrime(rndNum)) {
			System.out.println(rndNum + " = 소수가 아님");
		} else {
			System.out.println(rndNum + " = 소수임");
		}
		
		
	}
}
