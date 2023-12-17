package com.callor.hello.method;

public class MethodE {
	public static int buy(int pay) {
		int cup = 1500;
		int change = pay - cup;
		System.out.println("컵라면 가격 = " + cup);
		System.out.println("동생에게 준 돈 = " + pay);
		return change;
	}
	
	
	public static void main(String[] args) {
		int change = buy(2000);
		
		System.out.println("거스름돈 = " + change);
		
	}
}
