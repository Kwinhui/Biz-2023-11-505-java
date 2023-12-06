package com.project.blackjack.game;

import java.util.List;

import com.project.blackjack.Service.CardService;
import com.project.blackjack.model.BlackjackDto;

public class Game {
	public static void main(String[] args) {
		CardService card = new CardService();
		BlackjackDto black = new BlackjackDto();
		CardService service = new CardService();
		
		service.makeDeck();
		List<BlackjackDto> deckList = service.getDeck();
		
		for(BlackjackDto dto : deckList) {
			System.out.println(dto);
		}
		
		
	}
}
