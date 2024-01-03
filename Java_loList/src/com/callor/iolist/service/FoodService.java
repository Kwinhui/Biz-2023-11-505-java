package com.callor.iolist.service;

/*
 * 구분 1인지 2인지
 * 구분 1이면 매입단가(purchase) * 수량을 계산하여 매입금액에 표시
 * 구분 2이면 판매단가(sell) * 수량을 계산하여 판매금액에 표시
 */

public interface FoodService {
	public void lodeData();
	public void printList();
}
