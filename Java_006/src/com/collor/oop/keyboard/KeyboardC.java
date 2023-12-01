package com.collor.oop.keyboard;

import java.util.Scanner;

public class KeyboardC {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rndNum = (int)(Math.random() * 10) + 1;
		int count = 0;
		System.out.println("=".repeat(50));
		System.out.println("숫자 맞추기 게임");
		System.out.println("=".repeat(50));
		while(true) {
			System.out.println("1 ~ 10까지 범위의 정수를 입력하세요.");
			System.out.print("정수 >> ");
			String str = scan.nextLine();
			count++;
			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 정확히 입력해 주세요.");
				System.out.printf("입력한 값 : (%s)\n", str);
				continue;
			}
			if(num < 1 || num > 10) {
				System.out.println("1 ~ 10 까지 범위의 정수만 입력하세요");
			}
			if(num == rndNum) {
				System.out.println("참 잘했어요 : " + num);
				break;
			} else if(num > rndNum) {
				System.out.println("입력한 값이 너무 커요");
				
			} else if(num < rndNum) {
				System.out.println("입력한 값이 너무 작아요");
			}
			System.out.println("다시한번 잘 생각해 보세요");
			if (count >= 5) {
				break;
			}
			
			
		}	// end while
		if (count < 5) {
			System.out.printf("%d 번째 정답 맞춤\n", count);
		} else {
			System.out.printf("%d 번째 정답 못맞춤\n", count);
			
		}
			
		System.out.println("GAME OVER!!");
	}	// end main
}
