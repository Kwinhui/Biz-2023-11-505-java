package com.callor.iolist.model;

public class FoodDto {
	public String date;		// 거래일자
	public String time;		// 거래시간
	public String foodName;	// 상품명
	public String location;	// 거래처명
	public String name;		// 대표자명
	public String division; // 구분
	public int purchase;	// 매입단가
	public int sell;		// 판매단가
	public int count;	// 수량
	
	

	public int getPurchase() {
		int total = purchase * count;
		return total;
	}


	public int getSell() {
		int total = sell * count;
		return total;
	}


	@Override
	public String toString() {
		return "FoodDto [date=" + date + ", foodName=" + foodName + ", location=" + location + ", name=" + name
				+ ", division=" + division + ", purchase=" + purchase + ", sell=" + sell + ", count=" + count + "]";
	}
}
