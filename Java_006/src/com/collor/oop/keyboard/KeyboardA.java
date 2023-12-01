package com.collor.oop.keyboard;

import java.util.Scanner;

public class KeyboardA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int index = 0;
		
		System.out.print("정수 >> ");
		String str = scan.nextLine();
		while(true) {
			
		try {
			num = Integer.valueOf(str);
			
		} catch (Exception e) {
			System.out.println("10 이상의 정수를 입력해 주세요.");
			System.out.printf("입력한 수 : (%d)\n", num);
		}
		for (index = 1; index < num; index++) {
			if (num % 2 == 0 ) {
				if (num == index) {
					System.out.println(num);
					
				}
			}
		}
		
		
			
		}	// end while
		
		}	// end main
		
		
	}

