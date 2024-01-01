package com.callor.student.exec;

import java.util.ArrayList;
import java.util.List;

public class ListA {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			int rndNum = (int)(Math.random() * 51) + 50;
			nums.add(rndNum);

		}
		int index = 0;
		for(index = 0; index < nums.size(); index++) {
			if(nums.get(index) == 77) {
				System.out.println("있다");
				
			} 
		}
		for(index = 0; index < nums.size(); index++) {
			if(nums.get(index) == 77) {
				break;
			}
		}
		
		if(index < nums.size()) {
			System.out.println(index + 1 + " 번째에서 찾음");
			
		} else {
			System.out.println("없음");
		}
		
				
			
		
		
	}
}
