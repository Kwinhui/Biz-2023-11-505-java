package com.callor.oop.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StringC {
	public static void main(String[] args) {
		// 학번,국어,영어,수학,음악,미술,소프트웨어공학,데이터베이스
		Scanner scan = null;
		InputStream is = null;
		String data = "src/com/callor/oop/exec/data.txt";
		int sum = 0;
		try {
			is = new FileInputStream(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		}
		
		scan = new Scanner(is);
		System.out.println("학번\t국어\t영어\t수학\t음악\t미술\tSW\tDB\t총점");

		
		while(scan.hasNext()) {
			sum = 0;
			String line = scan.nextLine();
			String[] lines = line.split(",");
			for(int i = 0; i < lines.length; i++) {
				System.out.printf("%3s\t", lines[i]);
				
			}
			for(int i = 1; i < lines.length; i++) {
				sum += Integer.valueOf(lines[i]);
			}
			System.out.println(sum);
			
			
		}
		
		scan.close();

		
		
		
	}
}
