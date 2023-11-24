package com.callor.hello.algorithm;

public class LoopC {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.print("* ");
			// 10개의 별을 출력한 후 줄바꿈(Enter)를 해 주면 되겠다.
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
			
		System.out.println("============================");
		int count = 0;
		for(int i = 0; i < 100; i++) {
			System.out.print("* ");
			// 별을 출력 할 때마다 count 를 1씩 증가
			count++;
			// 카운트가 10을 넘어가면 Enter 와 함께 count 를 다시 초기화
			if (count >= 10) {
				System.out.println();
				count = 0;
				
			}
		}
		System.out.println("============================");
		
		
		
		
		
	}
	
}
		
		
