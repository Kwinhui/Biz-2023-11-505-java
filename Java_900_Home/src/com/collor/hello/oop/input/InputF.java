package com.collor.hello.oop.input;

import java.util.Scanner;

public class InputF {
	
	public static void main(String[] args) {
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("2부터 10 사이의 정수를 입력해 주세요(종료:QUIT) >> ");
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
			if(num < 2 || num > 10) {
				System.out.println("2 ~ 10 사이의 숫자를 입력해 주세요!!");
				continue;
			}
			if(num % 2 == 0) {
				System.out.println(num + " 는 짝수입니다.");
			} else {
				System.out.println(num + " 는 짝수가 아닙니다.");
			}
			
			
			
		}
	}
}
