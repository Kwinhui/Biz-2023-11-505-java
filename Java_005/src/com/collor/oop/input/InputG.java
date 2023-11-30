package com.collor.oop.input;

import java.util.Scanner;

public class InputG {
	
	public static boolean isPrime(int num) {
		boolean prime = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prime = true;
				break;
			}
		}
		
		
		return prime;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수(QUIT:종료) >> ");
			
			String str = scan.nextLine();
			if (str.equals("QUIT")) {
				System.out.println("프로그램 종료!!");
				break;
			}
			int num = 0;
			try {
				num = Integer.valueOf(str);
				
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요.");
				System.out.println("입력한 값 : " + str);
				continue;
			}
			
			// 2 이상의 정수
			if (num < 2) {
				System.out.println("값은 2이상의 정수 중에 입력해야합니다.");
				System.out.println("입력한 값 : " + num);
				continue;
			}
			// 짝수 판별
			if (num % 2 == 0) {
				System.out.println(num + " 는 짝수");
			} else {
				System.out.println(num + " 는 짝수가 아님");
			}
			
			// 소수판별
			if (isPrime(num)) {
				System.out.println(num + " 는 소수가 아님");
				
			} else {
				System.out.println(num + " 는 소수입니다!");
			}
				

			
		}	// end while
		
		
	}	// end main

}
