package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.algorithm.utils.Line;

public class ScannerA {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		
		Line.dLine(50);
		
		System.out.print("첫 번째 정수를 입력하세요. >> ");
		String str1 = scan.nextLine();
		System.out.print("두 번째 정수를 입력하세요. >> ");
		str1 = scan.nextLine();
		Line.sLine(50);
		try {
			num1 = Integer.valueOf(str1);
			
			
		} catch (Exception e) {
			System.out.println("정수를 입력해주세요");
			System.out.printf("입력한값 : %s\n", str1);
		}
		System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
		System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
		System.out.printf("%d x %d = %d\n", num1, num2, (num1 * num2));
		System.out.printf("%d ÷ %d = %d\n", num1, num2, (num1 / num2));
		System.out.printf("%d MOD %d = %d\n", num1, num2, (num1 % num2));
		
		Line.dLine(50);
	}
}
