package com.collor.oop.input;

import java.util.Scanner;



public class InputD {
	public static boolean operator() {

		
		int num1 = 0;
		int num2 = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=".repeat(50));
		System.out.println("4칙연산 계산기");
		System.out.println("-".repeat(50));
		
		System.out.println("두 개의 정수를 입력받아");
		System.out.println("사칙연산을 수행합니다.");
		System.out.println("두 개의 정수를 입력해주세요");
		System.out.println("계산기를 종료하려면 QUIT 를 입력해 주세요.");
		System.out.println("-".repeat(50));
		while(true) {
			System.out.print("정수 (QUIT:끝내기) 1 >> ");
			String str1 = scan.nextLine();
			
			if(str1.equalsIgnoreCase("QUIT")) {
				return false;
			}
			
			try {
				num1 = Integer.valueOf(str1);	// static method
				
			} catch (Exception e) {
//			e.printStackTrace();
				System.out.println("정수값을 정확히 입력해야 합니다");
				continue;
			} 
			System.out.println("입력한 값 : " + str1);
			break;	
				
			
		}
		while(true) {
			System.out.print("정수 (QUIT:끝내기) 2 >> ");
			String str2 = scan.nextLine();	// non-static method
			if(str2.equalsIgnoreCase("QUIT")) {
				return false;
			}
			try {
				num2 = Integer.valueOf(str2);
				
			} catch (Exception e) {
				System.out.println("정수값으로 정확히 입력해 주세요.");
				continue;
				
			}
			System.out.println("입력한 값: " + str2);
			break;
		}
		
		
		
		
		
		
		
//		System.out.printf("입력한 정수는 %s, %s 입니다\n", str1, str2);
		System.out.println(num1 + num2);
		
		System.out.println("=".repeat(50));
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.println("=".repeat(50));
		

//		scan.close();
		return true;
		
	}	// end main

	public static void main(String[] args) {
		
		// operator() 함수가 실행되고 false 를 return 할때까지 
		// 코드는 무한 반복된다.
		boolean isExit = true;
		while(isExit) {
			// operator() 함수는 boolean type 의 값을 return 한다.
			isExit = operator();
		}
		System.out.println("계산기 종료~~ 야 퇴근이다!!");
		
			
	}
}
