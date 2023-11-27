package com.callor.hello.prime;

public class PrimeCB {
	public static void main(String[] args) {
		int num = 8;
		int index = 0;
		for(index = 2; index < num; index++) {
			if(num % index == 0) {
				break;
			}
		}
		
		// num이 7일때 소수이기 떄문에 index 상태는 7이다.
		// num이 8일때 소수가 아니기때문에 위에 if 문에서 8 % 2 == 0 이기 때문에 break 문을 만나서 빠져나온다.
		// 그렇기 때문에 index 는 2이다.
		
		/*
		 * 코드가 여기에 다다랐을때
		 * inbdex 와 num 의 관계
		 * 1. 만약 num 값이 소수가 아닌 경우는
		 * 		for () 반복문이 break 를 만나서 중단된 경우이다.
		 * 		이때는 index 값이 항상 num 보다 작다
		 * 		(index < num)
		 * 2. 만약 num 값이 소수인 경우
		 * 		for () 반복문은 모두 완료(끝까지 반복)된다.
		 * 		이때는 index 값이 num 와 같거나 크다.
		 * 		(index >= num)
		 */
		
		if (index < num) {
			System.out.printf("%d MOD %d = %d, " , num, index, num % index);
			System.out.println(num + " 는 소수가 아님");
		}
		else {
			System.out.println(num + " 는 소수");
		}
			
	}

}
