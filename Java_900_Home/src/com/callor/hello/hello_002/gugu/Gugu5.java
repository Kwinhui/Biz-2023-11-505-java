package com.callor.hello.hello_002.gugu;

public class Gugu5 {
	public static void main(String[] args) {
		System.out.println("5단 구구단");
		System.out.println("=".repeat(50));
		for(int i = 0; i < 9; i++) {
			int num = 5;
			System.out.println(num + " x " + (i + 1) + " = " + num * (i + 1));
		}
	}
}
