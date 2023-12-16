package com.callor.hello.algorithm;

public class AlgE {
	public static void main(String[] args) {
		int num1 = 3587964;
		int count = num1 % 1000000 / 100000;	// num % 1000000 = 587964
												// 587964 / 100000 = 5.87964 인데 정수형 이기때문에 나머지 사라져서 5
		System.out.println("10만단위 개수 : " + count);
		
		
		
	}

}
