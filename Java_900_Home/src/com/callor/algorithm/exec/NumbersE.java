package com.callor.algorithm.exec;

import com.callor.hello.line.Line;

public class NumbersE {
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			Line.dLine(50);
			System.out.printf("%d 단 구구단\n", i);
			Line.sLine(50);
			for (int j = 1; j <= 9; j++) {
				if ((i * j) % 2 == 0) {
					
					System.out.printf("%d x %d = %d\n", i, j, (i * j));
				}
			}
		}
	}
}
