package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;

public class NumbersAB {
	public static void main(String[] args) {
		int num = 0;
		Line.dLine(100);
		while(num < 10) {
			num++;
			System.out.printf("%d\t", num);
			
		}
		System.out.println();
		Line.dLine(100);
		System.out.println();
		Line.dLine(100);
		num = 0;
		while(true) {
			System.out.printf("%d\t", num + 1);
			if (num > 10) {
				break;
			}
		}
	}
}
