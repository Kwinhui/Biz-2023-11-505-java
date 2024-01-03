package com.callor.iolist.exec;

import com.callor.iolist.service.FoodService;
import com.callor.iolist.service.impl.FoodServiceImplV1;

public class ExecA {
	public static void main(String[] args) {
		FoodService foodService = new FoodServiceImplV1();
		
		foodService.printList();
	}
	
	
}
