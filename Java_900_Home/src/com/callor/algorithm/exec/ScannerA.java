package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.hello.line.Line;

public class ScannerA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		Line.dLine(50);
		while(true) {
		System.out.print("첫번째 정수를 입력하세요 >> ");
		String str = scan.nextLine();

		Line.sLine(50);
		
			try {
				num1 = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요");
				continue;
			}
			break;
		}
		while(true) {

			System.out.print("두번째 정수를 입력하세요 >> ");
			String str = scan.nextLine();
			Line.sLine(50);
			
			try {
				num2 = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요");
				continue;
			}
			break;
		}
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);
		
		
	}
}
