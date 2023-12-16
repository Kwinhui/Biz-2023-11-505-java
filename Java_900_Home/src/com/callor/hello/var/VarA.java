package com.callor.hello.var;

public class VarA {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 40;
		float num3 = 30.2f;
		float num4 = 40.3f;
		
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d ÷ %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%d MOD %d = %d\n", num1, num2, num1 % num2);
		
		System.out.printf("%f + %f = %f\n", num3, num4, num3 + num4);
		System.out.printf("%f - %f = %f\n", num3, num4, num3 - num4);
		System.out.printf("%f x %f = %f\n", num3, num4, num3 * num4);
		System.out.printf("%f ÷ %f = %f\n", num3, num4, num3 / num4);
		System.out.printf("%f MOD %f = %f\n", num3, num4, num3 % num4);
		
		
	}
}
