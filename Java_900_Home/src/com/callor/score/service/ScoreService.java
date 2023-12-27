package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.hello.line.Line;
import com.callor.score.model.ScoreDto;

public class ScoreService {
	
	
	List<ScoreDto> scoreList = null;
	private Scanner scan = null;
	private ScoreDto scoreDto = null;
	public ScoreService() {
		this.scoreDto = new ScoreDto();
		this.scoreList = new ArrayList<ScoreDto>();
	}
	
	
	public void loadScores() {
		InputStream is = null;
		String data = "src/com/callor/score/service/data.txt";
		try {
			is = new FileInputStream(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int sum = 0;
		float avg = 0;
		scan = new Scanner(is);
		while(scan.hasNext()) {
			String line = scan.nextLine();
			String[] lines = line.split(",");
			
			scoreDto = new ScoreDto();
			scoreDto.num = lines[0];
			scoreDto.kor = Integer.valueOf(lines[1]);
			scoreDto.eng = Integer.valueOf(lines[2]);
			scoreDto.math = Integer.valueOf(lines[3]); 
			scoreDto.music = Integer.valueOf(lines[4]);
			scoreDto.art = Integer.valueOf(lines[5]);
			scoreDto.sw = Integer.valueOf(lines[6]);
			scoreDto.db = Integer.valueOf(lines[7]);
			scoreList.add(scoreDto);
		}

		scan.close();
		
	}	// loadScore
	
	public void printScore() {
		Line.dLine(100);
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\tsw\tdb\t총점\t평균");
		Line.sLine(100);
		this.loadScores();
		for(ScoreDto dto : scoreList) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
					dto.num, dto.kor, dto.eng, dto.math, dto.music, dto.art, dto.sw, dto.db, dto.getTotal(), dto.getAvg()
					);
		}
		
		
	}
		
}
