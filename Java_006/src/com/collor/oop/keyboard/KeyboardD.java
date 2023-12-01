package com.collor.oop.keyboard;

import java.util.Scanner;

public class KeyboardD {
	public static void main(String[] args) {
		System.out.println("=".repeat(50));
		System.out.println("뤼팡의 황금열쇠를 찾아라");
		System.out.println("=".repeat(50));
		System.out.println("1 ~ 50 까지의 숫자중 황금열쇠를 입력하세요.");
		int rndNum = (int)(Math.random() * 50) + 1;
		int count = 0;
		int num = 0;
		Scanner scan = new Scanner(System.in);
		String str1 = "";
		while(true) {
			
			
			KeyboardDA.game(rndNum, num, count, str1);
			if (count == 5) {
				System.out.println("황금열쇠 찾기에 실패했습니다.");
				System.out.println("게임을 계속 할까요? Y / N");
				str1 = scan.nextLine();
			}
				if (str1.equals("Y")) {
					 
					count = 0;
					continue;
				} else if (str1.equals("N")) {
					System.out.println("게임을 종료합니다.");
					break;
				}
			
			
			
		}	// end while
		
				
		
	}	// end main
}
