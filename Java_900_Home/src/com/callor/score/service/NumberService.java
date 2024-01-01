package com.callor.score.service;

import java.util.Scanner;

public class NumberService {
	public int inputNumber(String title) {
		Scanner scan = new Scanner(System.in);
		System.out.print(title + " 점수 >> ");
		String str = scan.nextLine();
		int num = 0;
		try {
			num = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("정수를 입력해 주세요");
		}
		
		return num;
	}
}
