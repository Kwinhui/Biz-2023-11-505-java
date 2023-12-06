package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;

public class ScannerD {
	public static void main(String[] args) {
		NumberService keyInputService = new NumberService();
		int num1 = keyInputService.inputNum("첫 번째 숫자를");
		int num2 = keyInputService.inputNum("두 번째 숫자를");
		int _tmp = 0;
		if(num1 < num2) {
			_tmp = num1;
			num1 = num2;
			num2 = _tmp;
		}
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);
		
	}
}
