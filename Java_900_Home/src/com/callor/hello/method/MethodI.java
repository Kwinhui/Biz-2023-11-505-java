package com.callor.hello.method;

import com.callor.hello.line.Line;

public class MethodI {
	public static int isPrime(int num) {
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return 0;	// 소수가 아님
			}
		}
		return num;			// 소수임
		
	}
	
	public static void main(String[] args) {
		Line.dLine(50);
		System.out.println("소수 합 구하기");
		Line.sLine(50);
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int rndNum = (int)(Math.random() * 100) + 2;
			int index = isPrime(rndNum);
			if(index != 0) {
				sum += rndNum;
				System.out.printf("%d 는 소수임\n", rndNum);
			} else {
				System.out.printf("%d 는 소수가 아님\n", rndNum);
			}
			
		}
		Line.sLine(50);
		System.out.println("소수의 합 : " + sum);
		Line.dLine(50);
		
		
	}
	
}
