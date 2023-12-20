package com.collor.hello.oop.keyboard;

import java.util.Scanner;

public class KeyboardB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rndNum = (int)(Math.random() * 10) + 1;
		while(true) {
			System.out.print("1 부터 10까지 정수를 입력해 주세요 >> ");
			String str = scan.nextLine();
			int num = 0;
			
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요");
				continue;
			}
			if(rndNum > num) {
				System.out.println("값이 너무 작아요");
				continue;
			} else if (rndNum < num) {
				System.out.println("값이 너무 커요");
				continue;
			} else {
				System.out.println("참 잘했어요!! 정답은 : " + rndNum);
				break;
			}
			
			
		}
		
	}
}
