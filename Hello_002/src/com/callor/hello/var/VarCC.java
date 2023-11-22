package com.callor.hello.var;

public class VarCC {
	public static void main(String[] args) {
		int scoreKor = 0;
		int scoreEng = 0;
		int scoreMath = 0;
		
		
		
		System.out.println("============================");
		scoreMath = 98;
		System.out.println("국어 : " + scoreKor);
		scoreEng = 70;
		System.out.println("영어 : " + scoreEng);
		scoreKor = 80;
		System.out.println("수학 : " + scoreMath);
		System.out.println("----------------------------");
		int total = scoreKor + scoreEng + scoreMath;
		System.out.println("총점 : " + total);
		int avg = total / 3;
		System.out.println("평균 : " + avg);
		System.out.println("============================");
		
	}

}
