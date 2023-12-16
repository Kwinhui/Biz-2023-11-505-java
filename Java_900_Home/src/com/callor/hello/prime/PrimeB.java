package com.callor.hello.prime;

public class PrimeB {
	public static void main(String[] args) {
		
		int num = 15;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.printf("%d MOD %d = %d", num, i, (num % i));
				System.out.println(", 15는 소수가 아님");
			}
		}
		
		
	}
}
