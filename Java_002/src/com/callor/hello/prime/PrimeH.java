package com.callor.hello.prime;

public class PrimeH {
	public static void main(String[] args) {
		System.out.println("==============================");
//		System.out.println("2 ~ 100까지 수 중 소수들의 합 : 1060");
		
		int sum = 0;
		for(int i = 1; i < 100; i++) {	// i = 1 ~ 99까지
			int num = i + 1;	// num = (1 ~ 99까지) + 1 → 2 ~ 100까지
			int index = 0;
			// 소수는 1과 자기자신인 수 이기 때문에
			// 굳이 1로 나눌 필요가 없어서 index = 2부터 시작
			for (index = 2; index < num; index++) {
				
				if (num % index == 0) {
					break;
				}
			}
			if (index >= num) {
				sum += num;
			}
			
		}
					
				
		
		System.out.printf("2 ~ 100까지 수 중 소수들의 합 : %d\n", sum);
		System.out.println("==============================");
		
		
		
	}

}
