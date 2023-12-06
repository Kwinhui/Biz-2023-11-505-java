package com.callor.algorithm.exec;

import com.callor.algorithm.service.NumberService;
import com.callor.algorithm.utils.Line;

public class NumbersG {
	public static void main(String[] args) {
		NumberService numService = new NumberService();
		Line.dLine(50);
		int num = numService.inputNum("점수를");
		Line.sLine(50);
		String str = "F";
		
		if(num >= 95) str = "A+";
		else if(num >= 90) str = "A";
		else if(num >= 90) str = "B+";
		else if(num >= 85) str = "B";
		else if(num >= 80) str = "C+";		
		else if(num >= 75) str = "C";
		else if(num >= 70) str = "D+";
		else if(num >= 65) str = "D";
		System.out.printf("%s 입니다\n", str);
		if (str.equals("A+")) {
			System.out.println("축하합니다.");
		} else if(str.equals("A")) {
			System.out.println("축하합니다.");
		} else if(str.equals("B+")) {
			System.out.println("축하합니다.");
		} else if(str.equals("B")) {
			System.out.println("축하합니다.");
		} else if(str.equals("C+")) {
			System.out.println("더 분발하세요.");
		} else if(str.equals("C")) {
			System.out.println("더 분발하세요.");
		} else if(str.equals("D+")) {
			System.out.println("더 분발하세요.");
		} else if(str.equals("D")) {
			System.out.println("더 분발하세요.");
		} else {
			System.out.println("낙제입니다.");
		}
		Line.dLine(50);
		str = "F 입니다\n낙제입니다.";
		if(num >= 95) str = "A+ 입니다\n축하합니다";
		else if(num >= 90) str = "A 입니다\n축하합니다";
		else if(num >= 90) str = "B+ 입니다\n축하합니다";
		else if(num >= 85) str = "B 입니다\n축하합니다";
		else if(num >= 80) str = "C+ 입니다\n더 분발하세요";		
		else if(num >= 75) str = "C 입니다\n더 분발하세요";
		else if(num >= 70) str = "D+ 입니다\n더 분발하세요";
		else if(num >= 65) str = "D 입니다\n더 분발하세요";
		System.out.println(str);
			
		
			
		
		
	}
}
