package com.callor.algorithm.exec;

import java.util.Scanner;

import com.callor.score.service.NumberService;

public class NumbersH {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;
		System.out.print("1번 학생 점수 >> ");
		String str = scan.nextLine();
		System.out.print("2번 학생 점수 >> ");
		str = scan.nextLine();
		System.out.print("3번 학생 점수 >> ");
		str = scan.nextLine();
		
		try {
			score1 = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("정수를 입력해 주세요");
			return;
		}
		try {
			score2 = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("정수를 입력해 주세요");
			return;
		}
		try {
			score3 = Integer.valueOf(str);
		} catch (Exception e) {
			System.out.println("정수를 입력해 주세요");
			return;
		}
		float avg = (float) (score1 + score2 + score3) / 3;
		if(avg >= 60) {
			System.out.println("합격입니다");
		} else
			System.out.println("낙제입니다");
		

		
		
	}
}
