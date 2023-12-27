package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.hello.line.Line;

public class ScannerE {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		Line.dLine(50);
		while (true) {
			System.out.print("원하는 구구단을 입력해 주세요 >> ");
			String str = scan.nextLine();
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 입력해주세요!!");
				continue;
			}
			break;
		}
		System.out.printf("%d 단 구구단\n", num);
		for (int i = 0; i < 9; i++) {
			System.out.printf("%d x %d = %d\n", num, (i + 1), (num * (i + 1)));
		}
		
	}
}
