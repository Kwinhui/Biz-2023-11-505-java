package com.callor.hello.method;

public class MethodE {
	
	public static int buy(int money) {
		int cup = 1500;
		
		return money - cup;
		
	}
	
	public static void main(String[] args) {
		int money = 2000;
		int change = buy(money);
		System.out.printf("전달한 값 : %d, 잔액 : %d\n", money, change);
		
		
	}

}
