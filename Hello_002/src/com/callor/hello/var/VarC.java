package com.callor.hello.var;

public class VarC {
	public static void main(String[] args) {
		int scoreKor = 80;
		int scoreEng = 90;
		int scoreMath = 85;
		
		
		int total = scoreKor + scoreEng + scoreMath;
		int avg = total / 3;
		
		System.out.println("============================");
		System.out.println("국어 : " + scoreKor);
		System.out.println("영어 : " + scoreEng);
		System.out.println("수학 : " + scoreMath);
		System.out.println("----------------------------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("============================");
		
	}

}
