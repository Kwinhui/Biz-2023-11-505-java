package com.callor.hello.Arrays;

public class ArraysD {
	public static void main(String[] args) {
		int sum = 0;
		
		// 배열 요소에 값 할당
		int[] nums = new int[10];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 50) + 51;
		}
		
		// 짝수 찾아 출력하는 부분
		for(int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				System.out.printf("index %d 번 요소의 값 : %d\n", i, nums[i]);
				
			}
		}
		
		// 짝수들의 합
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				sum += nums[i];
			}
		}
		System.out.printf("짝수들의 합 : %d\n", sum);
	}

}
