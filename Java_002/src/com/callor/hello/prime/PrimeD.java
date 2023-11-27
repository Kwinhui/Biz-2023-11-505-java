package com.callor.hello.prime;

public class PrimeD {
	
	public static void main(String[] args) {
		// 임의의 숫자 생성하기
		int num = (int)(Math.random() * 10) + 2;
		
		// 소수인가 판별하기
		int index = 0;
		boolean isPrime = false;
		for (index = 2; index < num; index++) {
			
			if(num % index == 0) {
				isPrime = true;
				break;
			}
		}
		
		// 판별 결과 출력하기
		System.out.println("====================================");
		System.out.println("소수판별하기");
		System.out.println("------------------------------------");
		if(isPrime) {	
			System.out.printf("%d MOD %d = %d, %d는 소수가 아님\n", num, index, (num % index), num);
			
		}
		else {
			System.out.printf("%d 는 소수임\n", num);
		}
		System.out.println("====================================");

		
			
		
		
	}

}
