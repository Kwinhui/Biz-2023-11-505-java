package com.callor.hello.algorithm;

public class LoopI {
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			if((i + 1) % 7 == 0) {
				System.out.print((i + 1) + " ");
			}
		}
	}
}
