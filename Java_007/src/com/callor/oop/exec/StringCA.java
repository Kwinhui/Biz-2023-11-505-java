package com.callor.oop.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.oop.util.Line;

public class StringCA {
	public static void main(String[] args) {
		String dataFile = "src/com/callor/oop/exec/data.txt";
		Scanner scan = null;
		InputStream is = null;
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line = "";
		scan = new Scanner(is);
		
		
		
		int sum = 0;
		Line.dLine(80);
		System.out.println("과목1\t 과목2\t 과목3\t 과목4\t 과목5\t 과목6\t 과목7\t 총점");
		Line.dLine(80);
		while(scan.hasNext()) {
			line = scan.nextLine();
			String[] result = line.split(",");
			for (int i = 1; i < result.length; i++) {
				System.out.printf("%3s\t", result[i]);
			}
			
			for (int i = 1; i < result.length; i++) {
				sum += Integer.valueOf(result[i]);

			}
			System.out.println(sum);
			sum = 0;	

		}

	
	}	// end main

}
