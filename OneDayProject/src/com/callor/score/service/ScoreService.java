package com.callor.score.service;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreService {
	List<ScoreDto> scores = null;

	public ScoreService() {
		scores = new ArrayList<ScoreDto>();

	}

	public void makeScore(int student) {
		
		int num = 0;
		int size = scores.size();
		String strStdNum = "23000";
		if (scores.size() > 0) {
			strStdNum = scores.get(scores.size() - 1).stdNum;
		}
//		for(int i = 0; i < size; i++) {
//			
//			int intStdNum = Integer.valueOf(strStdNum.substring(2));
//			intStdNum++;
//			strStdNum = String.format("23%03d", intStdNum);
//		}

		for (int i = 0; i < student; i++) {
			int intStdNum = Integer.valueOf(strStdNum.substring(2));
			intStdNum++;
			strStdNum = String.format("23%03d", intStdNum);

			ScoreDto dto = new ScoreDto();
			dto.stdNum = strStdNum;

			dto.kor = (int) (Math.random() * 50) + 51;
			dto.eng = (int) (Math.random() * 50) + 51;
			dto.math = (int) (Math.random() * 50) + 51;
			dto.music = (int) (Math.random() * 50) + 51;
			dto.art = (int) (Math.random() * 50) + 51;

			scores.add(dto);
		}

	}

	public void printStdNum() {

		Line.dLine(100);
		System.out.println("* 한울 고교 새별 반 성적 리스트 *");
		Line.dLine(100);
		System.out.print("학번\t\t국어\t영어\t수학\t음악\t미술\t총점\t평균\n");
		Line.sLine(100);

//		for(ScoreDto dto : scores) {
//			System.out.printf("%s\t\t", dto.stdNum);
//			System.out.printf("%d\t", dto.kor);
//			System.out.printf("%d\t", dto.eng);
//			System.out.printf("%d\t", dto.math);
//			System.out.printf("%d\t", dto.music);
//			System.out.printf("%d\t", dto.art);
//			System.out.printf("%d\t", dto.getTotal());
//			System.out.printf("%.2f\n", dto.getAvg());
//		}
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		int sumMusic = 0;
		int sumArt = 0;
		int sumTotal = 0;
		int size = scores.size();
		for (int i = 0; i < size; i++) {
			ScoreDto dto = new ScoreDto();
			dto = scores.get(i);
			System.out.printf("%s\t\t", dto.stdNum);
			System.out.printf("%d\t", dto.kor);
			System.out.printf("%d\t", dto.eng);
			System.out.printf("%d\t", dto.math);
			System.out.printf("%d\t", dto.music);
			System.out.printf("%d\t", dto.art);
			System.out.printf("%d\t", dto.getTotal());
			System.out.printf("%.2f\n", dto.getAvg());

			sumKor += dto.kor;
			sumEng += dto.eng;
			sumMath += dto.math;
			sumMusic += dto.music;
			sumArt += dto.art;
			sumTotal = (sumKor + sumEng + sumMath + sumMusic + sumArt);
		}
		float sumKorAvg = (float)sumKor / size;
		float sumEngAvg = (float)sumEng / size;
		float sumMathAvg = (float)sumMath / size;
		float sumMusicAvg = (float)sumMusic / size;
		float sumArtAvg = (float)sumArt / size;
		float sumTotalAvg = (float)(sumKorAvg + sumEngAvg + sumMathAvg + sumMusicAvg + sumArtAvg) / 5;
		Line.sLine(100);
		System.out.print("총점\t\t");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n",sumKor, sumEng, sumMath, sumMusic, sumArt, sumTotal);
		System.out.print("평균\t\t");
		System.out.printf("%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t\t%.2f\n", sumKorAvg, sumEngAvg, sumMathAvg, sumMusicAvg, sumArtAvg, sumTotalAvg);
		Line.dLine(100);
		
		
	}
		


}
