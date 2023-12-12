package com.callor.student.service;

import java.util.Scanner;

import com.callor.student.utils.Line;

public class StartService {

	private Scanner scan = null;

	public StartService() {
		scan = new Scanner(System.in);
	}

	public void mainMenu() {
		Line.dLine(50);
		System.out.println("한울고교 학사관리");
		Line.dLine(50);
		System.out.println("업무를 선택해 주세요");
		Line.sLine(50);
		System.out.println("1. 학생정보 입력");
		System.out.println("2. 학생정보 조회");
		System.out.println("3. 학생정보 출력");
		System.out.println("QUIT. 종료");
		Line.sLine(50);
	}

	public int selectMenu() {
		int num = 0;
		while (true) {
			this.mainMenu();
			System.out.print("업무 선택 >> ");
			String str = scan.nextLine();

			if (str.equals("QUIT")) {
				break;
			}
			try {
				num = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수값을 입력해 주세요!!");
				continue;
			}
			if (num > 3 || num < 1) {
				System.out.println("1 ~ 3 까지의 정수값을 입력해주세요");
				continue;
			}
			

		} // end while
		return num;

	} // end selectMenu

}
