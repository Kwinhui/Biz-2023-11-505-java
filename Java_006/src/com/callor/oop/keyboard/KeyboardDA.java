package com.callor.oop.keyboard;

import java.util.Scanner;

public class KeyboardDA {
	public static void game(int rndNum, int count) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.print("황금열쇠 >> ");
			String str = scan.nextLine();
			
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정확한 정수값을 입력하세요");
				continue;
			}
			
			if (num > 50 || num < 1) {
				System.out.println("1 ~ 50 범위의 정수를 입력하세요");
				continue;
			}
			
			
			if (num == rndNum) {
				System.out.printf("참 잘했어요 : %d(황금열쇠값)\n", rndNum);
				System.out.printf("%d 번째에 맞췄어요!!\n", count + 1);
				break;
			} else if (num > rndNum) {
				System.out.println("입력한 값이 너무 커요");
				count++;
			} else if (num < rndNum) {
				System.out.println("입력한 값이 너무 작아요");
				count++;
			}
			if (count == 5) {
				System.out.println("황금열쇠 찾기에 실패 했습니다");
				break;
			}
			
			
		}	// end while
		System.out.print("다시 시작하시겠습니까? 재시작 : Y / 종료 : N >> ");
		
		
	}	// end main
}
