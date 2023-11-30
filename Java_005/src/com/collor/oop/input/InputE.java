package com.collor.oop.input;

import java.util.Scanner;

public class InputE {

	public static boolean input() {

		int[] nums = new int[3];

		Scanner in = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("정수1 >> ");
				String str = in.nextLine();
				nums[0] = Integer.valueOf(str);

			} catch (Exception e) {
				System.out.println("정수1 값을 입력하세요.");

				continue;

			}

			break;
		} // end while
		while (true) {
			try {
				System.out.print("정수2 >> ");
				String str = in.nextLine();
				nums[1] = Integer.valueOf(str);

			} catch (Exception e) {
				System.out.println("정수2 값을 입력하세요.");

				continue;
			}
			break;
		}
		while (true) {
			try {
				System.out.print("정수3 >> ");
				String str = in.nextLine();
				nums[2] = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수3 값을 입력하세요.");
				continue;
			}
			break;
		}

		System.out.println("=".repeat(30));
		for (int i = 0; i < nums.length; i++) {
			System.out.println("입력한 값 : " + nums[i]);

		}
		return true;
	} // end input

	public static void main(String[] args) {

		input();

	}
}
