package com.callor.hello.prime;

public class PrimeG {
	public static void main(String[] args) {
		System.out.println("============================");
		System.out.println("2 ~ 100까지 수 중 소수만 출력하기");
		System.out.println("----------------------------");
		
		int num = 0;
		int index = 0;
		for (index = 2; index < 102; index++) {
			num++;
			for (int i = 2; i < index; i++) {
				if (num % i != 0) {
					break;
				}
			}
			
			
		}



	}

}
