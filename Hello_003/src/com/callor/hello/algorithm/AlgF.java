package com.callor.hello.algorithm;

public class AlgF {
	public static void main(String[] args) {
		
		/*
		 * 우리나라 화폐는
		 * 5만, 1만, 5천, 1천, 5백, 1백, 50, 10원 단위이다.
		 * 아래 pay 에 저장된 값에서
		 * 각각 화폐단위만큼 몇개씩이 포함되는지
		 * 출력하시오.
		 */
		int pay = 3587960;
		int tmp = 0;						// 거스름돈
		
		
		int five_man_won = pay / 50000;		// 5만원권
		tmp = pay % 50000;
		
		
		int man_won = tmp / 10000;			// 만원권
		tmp = pay % 10000;
		
		
		int five_cheon_won = tmp / 5000;	// 5천원권
		tmp = pay % 5000;
		
		int cheon_won = tmp / 1000;			// 천원권
		tmp = pay % 1000;
		
		int five_baeg_won = tmp / 500;		// 오백원
		tmp = pay % 500;
		
		int baeg_won = tmp / 100;			// 백원
		tmp = pay % 100;
		
		int five_sib_won = tmp / 50;		// 오십원
		tmp = pay % 50;
		
		int sib_won = tmp / 10;				// 십원
		
		
		System.out.println("오만원권 = " + five_man_won + "매");
		System.out.println("만원권 	 = " + man_won + "매");
		System.out.println("오천원권 = " + five_cheon_won + "매");
		System.out.println("천원권   = " + cheon_won + "매");
		System.out.println("오백원권 = " + five_baeg_won + "매");
		System.out.println("백원권   = " + baeg_won + "매");
		System.out.println("오십원권 = " + five_sib_won + "매");
		System.out.println("십원권   = " + sib_won + "매");
		
		
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("50000원 개수 :" + pay / 50000 + "매");
		System.out.println("10000원 개수 :" + pay % 50000 / 10000 + "매");
		System.out.println("5000원  개수 :" + pay % 50000 % 10000 / 5000 + "매");
		System.out.println("1000원  개수 :" + pay % 50000 % 10000 % 5000 / 1000 + "매");
		System.out.println("500원   개수 :" + pay % 50000 % 10000 % 5000 % 1000 / 500 + "매");
		System.out.println("100원   개수 :" + pay % 50000 % 10000 % 5000 % 1000 % 500 / 100 + "매");
		System.out.println("50원	개수 :" + pay % 50000 % 10000 % 5000 % 1000 % 500 % 100 / 50 + "매");
		System.out.println("10원	개수 :" + pay % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10 + "매");
		
		
		
	}
}
