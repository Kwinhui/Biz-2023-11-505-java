package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;

public class ListB {

	public static boolean check(int check) {
		List<Integer> nums = new ArrayList<>();
		int count = 10;

		for (int i = 0; i < count; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			nums.add(rndNum);
		}
		System.out.println(nums);

		int size = nums.size();
		for (int i = 0; i < size; i++) {
			if (nums.get(i) == check) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		boolean bYes = check(77);
		if(bYes) System.out.println("있다");
		else System.out.println("없다");
		
	}
}
