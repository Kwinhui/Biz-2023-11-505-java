package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.hello.line.Line;

public class NumbersG {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Line.dLine(50);
		System.out.print("점수를 입력해 주세요 >> ");
		String str = scan.nextLine();
		Line.sLine(50);
		int num = 0;
		try {
			num = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("정수를 입력해 주세요");
			return;
		}
		String grade = "F";
		if(num >= 95) grade = "A+";
		else if (num >= 90) grade = "A";
		else if (num >= 85) grade = "B+";
		else if (num >= 80) grade = "B";
		else if (num >= 75) grade = "C+";
		else if (num >= 70) grade = "C";
		else if (num >= 65) grade = "D+";
		else if (num >= 60) grade = "D";

		if(num >= 80) {
			System.out.printf("%s 입니다\n", grade);
			System.out.println("축하합니다");
		}
		else if (num >= 70) {
			System.out.printf("%s 입니다\n", grade);
			System.out.println("더 분발하세요");
			
		} else {
			System.out.printf("%s 입니다\n", grade);
			System.out.println("낙제입니다");
		}
		
	}
}
