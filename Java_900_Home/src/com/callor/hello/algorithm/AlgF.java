package com.callor.hello.algorithm;

import com.callor.hello.line.Line;

public class AlgF {
	public static void main(String[] args) {
		int pay = 3587960;
		int tmp = 0;
		
		Line.dLine(50);
		int pay_50000 = pay / 50000;
		tmp = pay % 50000;
		System.out.println("5만원권 : " + pay_50000);	// 5만원권 개수
//		System.out.println(tmp);		// 5만원 71장 빼고 남은 금액
		int pay_10000 = tmp / 10000;
		tmp = tmp % 10000;
		System.out.println("1만원권 : " + pay_10000);
		int pay_5000 = tmp / 5000;
		tmp = tmp % 5000;
		System.out.println("5천원권 : " + pay_5000);
		int pay_1000 = tmp / 1000;
		tmp = tmp % 1000;
		System.out.println("1천원권 : " + pay_1000);
		int pay_500 = tmp / 500;
		tmp = tmp % 500;
		System.out.println("500원권 : " + pay_500);
		int pay_100 = tmp / 100;
		tmp = tmp % 100;
		System.out.println("100원권 : " + pay_100);
		int pay_50 = tmp / 50;
		tmp = tmp % 50;
		System.out.println("50원권 : " + pay_50);
		int pay_10 = tmp / 10;
		tmp = tmp % 10;
		System.out.println("10원권 : " + pay_10);
		Line.dLine(50);
	
		
		
	}
}
