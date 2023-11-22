package com.callor.hello.var;

public class VarF {
	public static void main(String[] args) {
		float scoreKor = 90.5f;
		float scoreEng = 80.4f;
		float scoreMath = 94.4f;
		
		float total = scoreKor + scoreEng + scoreMath;
		float avg = total / 3;
		System.out.println("=================");
		System.out.println("국어 : " + scoreKor);
		System.out.println("영어 : " + scoreEng);
		System.out.println("수학 : " + scoreMath);
		System.out.println("-----------------");
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.1f\n", avg);
		System.out.println("=================");
		
		
		
		
	}
	

}
