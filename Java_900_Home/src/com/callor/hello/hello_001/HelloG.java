package com.callor.hello.hello_001;

public class HelloG {
	public static void main(String[] args) {
		System.out.println("5단 구구단"); 
		System.out.println("=".repeat(50));
		int num = 5;
		for(int i = 0; i < 9; i++) {
			System.out.printf("%d x %d = %d\n", num, i + 1, num * (i + 1));
		}
		
		
		
	}
}
