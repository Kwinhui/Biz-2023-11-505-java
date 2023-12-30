package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.hello.line.Line;

public class NumbersF {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Line.dLine(50);
		System.out.print("정수를 입력해 주세요 >> ");
		String str = scan.nextLine();
		int num = 0;
		try {
			num = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("정수를 입력해 주세요");
			return;
		}
		for(int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(i == num || j == num ) {
					System.out.printf("%d x %d = %d\n", i , j , (i * j));
				}
			}
		}
	}
}
