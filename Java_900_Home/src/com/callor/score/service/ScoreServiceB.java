package com.callor.score.service;

import java.util.Scanner;

public class ScoreServiceB {
	
	private Scanner scan = null;
	
	public ScoreServiceB() {
		scan = new Scanner(System.in);
	}
	
	public int inputScore(String title, int start, int end) {
		
		while(true) {
			System.out.print(title + " 입력하세요 >> ");
			String str = scan.nextLine();
			int num = 0;
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요");
				continue;
			}
			if(num < start || num > end) {
				System.out.printf("점수는 %d ~ %d 사이의 점수를 입력해주세요\n", start, end);
				continue;
			}
			
			return num;

			
		}

		
		
	}
	
}
