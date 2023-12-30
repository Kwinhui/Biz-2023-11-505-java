package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.hello.line.Line;

public class NumbersB {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Line.dLine(50);
		System.out.print("숫자를 입력해 주세요 >> ");
		String str = scan.nextLine();
		int num = 0;
		try {
			num = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("숫자를 입력해주세요");
			return;
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		Line.dLine(50);
		
	}

}
