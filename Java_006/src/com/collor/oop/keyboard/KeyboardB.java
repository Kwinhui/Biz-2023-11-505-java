package com.collor.oop.keyboard;

import java.util.Scanner;

public class KeyboardB {
	public static void main(String[] args) {

		int num1 = (int) (Math.random() * 10) + 1;
		int num2 = 0;
		int count = 0;
		float result = 100.0f;
		Scanner scan = new Scanner(System.in);
		System.out.println("=".repeat(50));
		System.out.println("재시작 : F5");
		System.out.println("1부터 10까지 정수를 입력해 주세요.");
		while (true) {
			
			count++;

			System.out.print("정수 >> ");
			String str = scan.nextLine();
			if(str.equals("F5")) {
				num1 = (int) (Math.random() * 10) + 1;
				num2 = 0;
				count = 0;
				continue;
			}
			try {
				num2 = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요.");
				continue;
			}
			if (num2 < 1 || num2 > 10) {
				System.out.println("1부터 10 범위의 숫자를 입력해주세요");
				System.out.printf("입력한 수 : (%d)\n", num2);
				continue;
			}
			if (num1 == num2) {
				System.out.println("-".repeat(50));
				System.out.println("참 잘했어요 : " + num1);
				System.out.println("-".repeat(50));
				break;
			} else if (num1 > num2) {
				System.out.println("값이 너무 작아요");
			} else if (num1 < num2) {
				System.out.println("값이 너무 커요!");
			}
			System.out.println("다시 한번 잘 생각해 보세요!!");



		} // end while
		System.out.println("입력 횟수 : " + count);
		System.out.printf("정답률 : %.2f%%\n", result / count);
	} // end main
}
