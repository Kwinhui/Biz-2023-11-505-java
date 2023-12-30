package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.hello.line.Line;

public class NumbersD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Line.dLine(50);
		int sum = 0;
		int num = 0;
		int count = 0;
		while(sum <= 1000) {
			System.out.print("숫자를 입력해 주세요 >> ");
			String str = scan.nextLine();
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("숫자를 입력해 주세요");
				continue;
			}
			count ++;
			sum += num;
		}
		System.out.printf("%d 번 입력한 숫자 총 합 : %d", count, sum);
		
	}
}
