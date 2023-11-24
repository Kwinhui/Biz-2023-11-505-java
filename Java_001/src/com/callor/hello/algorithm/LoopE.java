package com.callor.hello.algorithm;

public class LoopE {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1 + " "));
		}
		System.out.println();
		System.out.println("===========================");
		int count = 0;
		for (int i = 0; i < 100; i++) {
			System.out.print((i + 1) + " ");
			count++;
			if (count >= 10) {
				System.out.println();
				count = 0;
			}
		}
		System.out.println("===========================");
		
		
			for (int i = 0; i < 100; i++) {
				// for() 반복문 내( {} ) 에서 i 같은
				// 0 ~ 99 까지 변하고 있다.
				// 이 i 값에 1을 덧셈하여 출력하면
				// 1 ~ 100 까지 값을 출력할 수 있다.
				System.out.print(i + 1 + " ");
				// 출력하는 도중 만약 I + 1 이 10의 배수이면
				// 10개를 출력했다는 것이다.
				// 그 상황이 되면 Enter 를 표시하여 줄바꿈을 한다.
				if ((i + 1) % 10 == 0) {
					System.out.println();
				}
			}

		}

	
}
