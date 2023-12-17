package com.callor.hello.arrays;

public class ArraysD {
	public static void main(String[] args) {
		int[] nums = new int[10];
		int sum = 0;
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int)(Math.random() * 50) + 51;
			
		}
		
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] % 2 == 0) {
				System.out.printf("index %d 번 요소의 값 : %d\n", i, nums[i]);
				sum += nums[i];
			}
		}
		System.out.println("짝수들의 합 : " + sum);
		
		
	}
}
