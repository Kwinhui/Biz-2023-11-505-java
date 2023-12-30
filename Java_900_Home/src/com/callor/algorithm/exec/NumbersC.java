package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.hello.line.Line;

public class NumbersC {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Line.dLine(50);
		System.out.print("숫자를 입력해 주세요 >> ");
		String str = scan.nextLine();
		Line.sLine(50);
		int num = 0;
		try {
			num = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("정수를 입력해주세요");
			return;
		}
		for(int i = num; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		Line.dLine(50);
	}

}
