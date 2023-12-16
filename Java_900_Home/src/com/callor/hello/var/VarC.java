package com.callor.hello.var;

public class VarC {
	public static void main(String[] args) {
		int kor = 60;
		int eng = 90;
		int math = 80;
		int sum = 0;
		float avg = 0;
		sum = (kor + eng + math);
		avg = (float)sum / 3;
		
		System.out.println("=".repeat(50));
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("-".repeat(50));
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("=".repeat(50));
		
	}
}
