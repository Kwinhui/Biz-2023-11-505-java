package com.collor.hello.oop.input;

import java.util.Scanner;

public class InputG {
	public static void main(String[] args) {
		
		while (true) {
			boolean isPrime = false;
			Scanner scan = new Scanner(System.in);
			System.out.print("2 이상의 정수를 입력해 주세요(종료:QUIT) >> ");
			String str = scan.nextLine();
			if (str.equals("QUIT")) {
				System.out.println("실행 종료");
				break;
			}
			int num = 0;

			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 입력해주세요");
				continue;
			}
			if (num < 2 ) {
				System.out.println("2 이상의 정수를 입력해 주세요!!");
				continue;
			}
			for (int i = 2; i < num; i++) {
				if(num % i == 0) {
					isPrime = true;
					break;
				}
			}
			if (isPrime) {
				System.out.println(num + " 는 소수가 아닙니다.");
			} else {
				System.out.println(num + " 는 소수입니다.");
			}
			

		}
	}
}
