package com.collor.oop.keyboard;

import java.util.Scanner;

public class KeyboardDA {
	public static void game(int rndNum, int num, int count, String str1) {

		
		num = 0;
		count = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("황금열쇠 >> ");
			String str = scan.nextLine();
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정확한 정수값을 입력하세요");
				continue;
			}
			count ++;
			
			
			if(num == rndNum) {
				System.out.printf("참 잘했어요 : %d\n", rndNum);
			} else if (num > rndNum) {
				System.out.println("입력한 값이 너무 커요");
			} else if (num < rndNum) {
				System.out.println("입력한 값이 너무 작아요");
			}
			
			
			
			
		}	// end while
	}
}
