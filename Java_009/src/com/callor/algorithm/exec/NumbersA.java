package com.callor.algorithm.exec;

import com.callor.algorithm.utils.Line;

public class NumbersA {
	public static void main(String[] args) {
		int num = 0;
		Line.dLine(100);
		while(true) {
			num++;
			System.out.printf("%d\t", num);
			if(num == 10) {
				break;
			}
		}
		System.out.println();
		Line.dLine(100);
		num = 0;
		while(true) {
			System.out.printf("%d\t", num + 1);
			num++;
			if(num >= 10) {
				break;
			}
			
		}
		System.out.println();
		Line.dLine(100);
		num = 0;
		while(num < 10) {
			System.out.printf("%d\t", num++ + 1);
		}
		
		
		
	}	// end main
}
