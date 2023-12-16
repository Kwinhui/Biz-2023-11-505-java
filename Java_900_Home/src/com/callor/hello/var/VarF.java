package com.callor.hello.var;

import com.callor.hello.line.Line;

public class VarF {
	public static void main(String[] args) {
		float kor = 80.2f;
		float eng = 70.3f;
		float math = 80.3f;
		float sum = 0;
		float avg = 0;
		sum = (kor + eng + math);
		avg = sum / 3;
		Line.dLine(50);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		Line.sLine(50);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}

}
