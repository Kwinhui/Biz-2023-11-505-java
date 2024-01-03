package com.callor.iolist.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.iolist.model.FoodDto;
import com.callor.iolist.service.FoodService;
import com.callor.iolist.utils.Line;

public class FoodServiceImplV1 implements FoodService {
	private List<FoodDto> foodList = null;
	private Scanner scan = null;
	private String data = null;

	public FoodServiceImplV1() {
		foodList = new ArrayList<FoodDto>();
		scan = new Scanner(System.in);
		data = "src/매입매출데이터.txt";
//		data = "src/샘플-매입매출데이터(2024-01-03).txt";

	}

	@Override
	public void lodeData() {
		scan = null;
		InputStream is = null;
		try {
			is = new FileInputStream(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);
		foodList = new ArrayList<FoodDto>();
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] lines = line.split(",");
			FoodDto dto = new FoodDto();
			dto.date = lines[0];
			dto.time = lines[1];
			dto.foodName = lines[2];
			dto.location = lines[3];
			dto.name = lines[4];
			dto.division = lines[5];
			dto.purchase = Integer.valueOf(lines[6]);
			dto.sell = Integer.valueOf(lines[7]);
			dto.count = Integer.valueOf(lines[8]);

			foodList.add(dto);

		}
		scan.close();


	}

	@Override
	public void printList() {
		this.lodeData();
		Line.dLine(100);
		System.out.println("거래일자\t거래처\t상품이름\t매입금액\t판매금액");
		Line.sLine(100);
		
		int sumPurchase = 0;
		int sumSell = 0;
		int getPurchase = 0;
		int getSell = 0;
		for(FoodDto dto : foodList) {
//			System.out.println(dto.sell + " 판매금액");
//			System.out.println(dto.purchase + " 매입금액");
//			System.out.println(dto.count + " 수량");
			
			if(dto.division.equals("2")) {
				getSell += dto.sell * dto.count;
				getPurchase = 0;
				
			} else if (dto.division.equals("1")) {
				getPurchase += dto.purchase * dto.count;
				getSell = 0;
			}
			
			System.out.printf("%s\t%s\t%s\t%d\t%d\n",dto.date, dto.location, dto.foodName, getPurchase, getSell);
			sumPurchase += dto.getPurchase();
			sumSell += dto.getSell();
			
		}
		Line.sLine(100);
		System.out.print("거래건수");

		int size = foodList.size();
		System.out.printf("\t%d건\t\t\t%d\t\t%d\n", size, sumPurchase, sumSell);
		Line.dLine(100);
		
		
		
		
			
			
			

	}

}
