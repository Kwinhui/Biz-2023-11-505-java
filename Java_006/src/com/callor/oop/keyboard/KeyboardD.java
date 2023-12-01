package com.callor.oop.keyboard;

import java.util.Scanner;

import com.collor.oop.util.Line;

public class KeyboardD {
	public static void main(String[] args) {
		String str = "";
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int num = 0;
		int rndNum = (int) (Math.random() * 50) + 1;

		Line.dLine();
		System.out.println("뤼팡의 황금열쇠를 찾아라");
		Line.dLine();
		System.out.println("1 ~ 50까지의 숫자중 황금열쇠를 입력하세요");

		KeyboardDA.game(rndNum, count);
		while (true) {
			str = scan.nextLine();
			rndNum = (int) (Math.random() * 50) + 1;
			if (str.equals("Y")) {
				KeyboardDA.game(rndNum, count);


			}
			if (str.equals("N")) {
				System.out.println("종료!!");
				break;
			}

		}

	}

}
