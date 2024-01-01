package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.exec.service.ScoreDtoB;

public class ScoreServiceC {
	List<ScoreDtoB> scores = null;
	Scanner scan = null;
	public ScoreServiceC() {
		scores = new ArrayList<ScoreDtoB>();
		scan = new Scanner(System.in);
	}
	
	public void inputScore() {
		int korScore = 0;
		int engScore = 0;
		int mathScore = 0;
		while(true) {
			ScoreDtoB dto = new ScoreDtoB();
			System.out.print("국어 점수 >> ");
			String str = scan.nextLine();
			System.out.print("영어 점수 >> ");
			str = scan.nextLine();
			System.out.print("수학 점수 >> ");
			str = scan.nextLine();
			try {
				korScore = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요");
				continue;
			}
			try {
				engScore = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요");
				continue;
			}
			try {
				mathScore = Integer.valueOf(str);
			} catch (Exception e) {
				System.out.println("정수를 입력해 주세요");
				continue;
			}
			dto.kor = korScore;
			dto.eng = engScore;
			dto.math = mathScore;
			scores.add(dto);
			
			
		}
		
		
	}

}
