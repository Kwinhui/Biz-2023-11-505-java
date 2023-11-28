package com.callor.hello.Arrays;

public class ArraysA {
	public static void main(String[] args) {
		int multiple = (int)(Math.random() * 50) + 51; 
		int num1 = multiple;
		int num2 = multiple;
		int num3 = multiple;
		int num4 = multiple;
		int num5 = multiple;
		int sum = 0;
		sum = num1 + num2 + num3 + num4 + num5; 
		
		System.out.println("===========================");
		System.out.printf("1 번째 값 : %d\n", num1);
		System.out.printf("2 번째 값 : %d\n", num2);
		System.out.printf("3 번째 값 : %d\n", num3);
		System.out.printf("4 번째 값 : %d\n", num4);
		System.out.printf("5 번째 값 : %d\n", num5);
		System.out.println("---------------------------");
		System.out.printf("합산 결과 : %d\n", sum);
		System.out.println("===========================");
		
		
		
		
	}

}
