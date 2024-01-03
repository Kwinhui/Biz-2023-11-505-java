package com.callor.guide.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.guide.model.GuideDto;
import com.callor.guide.model.stdIndex;
import com.callor.guide.service.GuideService;
import com.callor.guide.utils.Line;

public class GuideServiceImplV1 implements GuideService {

	private List<GuideDto> guideList = null;
	private String data = null;

	public GuideServiceImplV1() {
		data = "src/guide.txt";
		guideList = new ArrayList<GuideDto>();
	}

//	public String idNum() {
//		String idNum = "PN001";
//		if (!guideList.isEmpty()) {
//			int IntIdNum = Integer.valueOf(idNum.indexOf(1));

//			int intIdNum = Integer.valueOf(idNum);

//			idNum = guideList.get(guideList.size() - 1).id;
//			System.out.println(idNum);
//
//			String frefix = idNum.substring(0, 2);
//
//			idNum = idNum.substring(4);
//
//			idNum = String.format("%s%03d", frefix, Integer.valueOf(idNum) + 1);
//			System.out.println(idNum);
//		}
//		return idNum;
//
//	}

	
	@Override
	public void loadGuide() {
		Scanner fileScan = null;
		InputStream is = null;
		try {

			is = new FileInputStream(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		fileScan = new Scanner(is);


		guideList = new ArrayList<GuideDto>();
		while (fileScan.hasNext()) {

			String line = fileScan.nextLine();
			String[] lines = line.split(",");

			GuideDto dto = new GuideDto();

			dto.id = lines[stdIndex.id.index];
			dto.list = lines[stdIndex.종목명.index];
			dto.seq = lines[stdIndex.순서.index];
			dto.guide = lines[stdIndex.방법.index];

			guideList.add(dto);

		} // end while()
		fileScan.close();

	}

	@Override
	public void printGuideList() {
		Line.dLine(100);
		this.loadGuide();
		System.out.println("id\t종목\t순서\t방법");
		String previousId = null; // 이전 id 값 초기화
	    for (GuideDto item : guideList) {
	    	
	    	String sameId = item.list;
	        
	        
	        if (!sameId.equals(previousId)) {
	        	Line.sLine(100);
	            
	        }

	        System.out.printf("%s\t", item.id);
	        System.out.printf("%s\t", item.list);
	        System.out.printf("%s 회\t", item.seq);
	        System.out.printf("%s\n", item.guide);
	        previousId = item.list; // 현재 id 값을 이전 id 값으로 업데이트
	    }
	    Line.dLine(100);

	}

}
