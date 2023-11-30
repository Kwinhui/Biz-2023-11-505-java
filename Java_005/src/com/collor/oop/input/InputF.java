package com.collor.oop.input;

import java.util.Scanner;

import com.collor.oop.utils.Line;

public class InputF {
	public static void main(String[] args) {
		int num = 0;
		
		while(true) {
			System.out.println("종료하려면 QUIT를 입력하세요");
			System.out.print("2 ~ 10 까지 정수를 입력하세요 >> ");
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			
			if (str.equals("QUIT")) {
				System.out.println("실행 종료!!");
				break;
			}
			try {
				num = Integer.valueOf(str);
							
			} catch (Exception e) {
				System.out.println("정수값을 다시 입력하세요");
				continue;
			} 

			if (num > 10 || num < 2) {
				Line.dLine(30);
				System.out.println("2 ~ 10 사이의 정수값을 다시 입력하세요!!");
				Line.dLine(30);
				continue;
			}
			
			
			if (num % 2 == 0) {
				Line.sLine(30);
				System.out.printf("%d 은 짝수\n", num);
				Line.sLine(30);
			}else {
				Line.sLine(30);
				System.out.printf("%d 은 짝수가 아님\n", num);
				Line.sLine(30);
			}

			
		}	// end while
		
		
		
		
		
		
	}	// end main

}
