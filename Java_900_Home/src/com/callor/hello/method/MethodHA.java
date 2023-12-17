package com.callor.hello.method;

import com.callor.hello.line.Line;

public class MethodHA {
	public static int isPrime(int num) {
		// num이 소수면 0(false), 소수가아니면 1(true)
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return i;	// 소수가아님
			}
		}
		return 0;	// 소수
	}
	
	public static void main(String[] args) {
		Line.dLine(50);
		System.out.println("소수판별하기");
		Line.sLine(50);
		for(int i = 0; i < 5; i++) {
			int rndNum = (int)(Math.random() * 100) + 2;
			int index = isPrime(rndNum);
			if(index > 0) {
				System.out.printf("%d MOD %d = %d,\t %d는 소수가 아님\n", rndNum, index, (rndNum % index), rndNum);
			} else{
				System.out.printf("%d 는 소수임\n", rndNum);
			} 
				
			
		}
		Line.dLine(50);
		
	}
	
}
