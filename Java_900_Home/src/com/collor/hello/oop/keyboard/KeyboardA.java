package com.collor.hello.oop.keyboard;

import java.util.Scanner;

import com.callor.hello.line.Line;

public class KeyboardA {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Line.dLine(50);
		System.out.print("정수 >> ");
		String str = scan.nextLine();
		Line.sLine(50);
		int num = 0;
		while(true) {
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요!!");
				continue;
			}
			break;
		}
		System.out.printf("1 ~ %d 까지 범위에서 짝수는?\n", num);
		Line.dLine(50);
		for(int i = 1; i < num; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
			
	}
}
