package com.callor.hello.method;

public class MethodJ {
	public static boolean isEven(int num) {
		if(num % 2 == 0) {
			return true;		// 짝수
		} else {
			return false;		// 짝수가 아님
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			int rndNum = (int)(Math.random() * 100) + 1;
			if(isEven(rndNum) == true) {
				System.out.printf("%d 는 짝수\n", rndNum);
			} else {
				System.out.printf("%d 는 짝수가 아님\n", rndNum);
				
			}
			
		}
	}
}
