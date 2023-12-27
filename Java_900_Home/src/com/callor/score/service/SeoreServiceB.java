package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class SeoreServiceB {
	private Scanner scan = null;
	
	public SeoreServiceB(String data) {
		
		InputStream is = null;
		try {
			is = new FileInputStream(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.scan = new Scanner(is);
		
	}
}
