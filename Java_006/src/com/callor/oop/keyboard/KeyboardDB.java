package com.callor.oop.keyboard;

import java.util.Scanner;

import com.collor.oop.util.Line;

public class KeyboardDB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int rndNum = (int) (Math.random() * 50) + 1;
		
		System.out.println("뤼팡의 황금열쇠를 찾아라");
		Line.dLine();
		System.out.println("1 ~ 50까지의 숫자중 황금열쇠를 입력하세요");
		Line.dLine();

		int count = 0;

		while (true) {

			System.out.print("황금열쇠 >> ");
			String str = scan.nextLine();

			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정확한 정수값을 입력하세요");
				continue;
			}
			if (num > 10 || num < 1) {
				System.out.println("1 ~ 50 범위의 정수를 입력하세요");
			}

			if (rndNum == num) {
				System.out.printf("참 잘했어요 : %d(황금열쇠값)\n", rndNum);
				break;

			} else if (rndNum > num) {
				System.out.println("입력한 값이 너무 작아요");
				count++;

			} else if (rndNum < num) {
				System.out.println("입력한 값이 너무 커요");
				count++;

			}
			

			while (count == 5) {

				System.out.print("다시 시작하시겠습니까? 재시작 : Y / 종료 : N >> ");
				String str1 = scan.nextLine();

				if (str1.equals("Y")) {
					count = 0;
					rndNum = (int) (Math.random() * 50) + 1;
					continue;
					
				}
				if (str1.equals("N")) {
					count = 0;
					continue;
				}
					

			} // end while

		} // end restart while
		System.out.printf("%d번 만에 정답을 찾았습니다!", count + 1);

		
		
	}

}
