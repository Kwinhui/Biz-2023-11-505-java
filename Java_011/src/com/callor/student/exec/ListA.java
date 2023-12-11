package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;

public class ListA {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		int count = 10;
		
		int index = 0;
		for(index = 0; index < count; index++) {
			int rndNum = (int)(Math.random() * 50) + 51;
			nums.add(rndNum);
		}
			
				
		int size = nums.size();
		for (int i = 0; i < size; i++) {
			
			if(nums.get(i) == 77) {
				System.out.println("있다");
			} 
		}
		
		
		for (index = 0; index < size; index++) {
			// if(nums(index) == 77) break;
			if(nums.get(index) == 77) {
				break;
			}
		}
		if(index < size) {
			System.out.println(index + " 번째에서 찾음");
		}else {
			System.out.println("없음");
		}

			

		System.out.println(nums);
		
		
			
		
			
		
	}
}
