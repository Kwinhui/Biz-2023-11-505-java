package com.project.blackjack.Service;

public class Card {
	// 2 ~ 10
	// ★ ◆ ♠ ♥
	
	private int[] num = null;
	private String[] pattern = null;
	
	public void CardNum() {
		int[] card = new int[9];
		for(int i = 2; i < card.length; i++) {
			card[i] += i;
			System.out.printf("%d\t", card[i]);
		}
		num = card;
		
	}
	
}
