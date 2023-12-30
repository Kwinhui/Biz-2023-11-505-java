package com.callor.algorithm.exec;

import com.callor.hello.line.Line;

public class NumbersA {
	public static void main(String[] args) {
		Line.dLine(100);
		int count = 0;
		while(count < 10) {
			System.out.print((count + 1) + "\t");
			count++;
		}
		System.out.println();
		Line.dLine(100);
	}

}
