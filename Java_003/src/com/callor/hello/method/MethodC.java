package com.callor.hello.method;


public class MethodC {
	public static String nation() {
		String str = "대한민국";
		
		return str;
	}
	public static void main(String[] args) {
		String nation = nation();
		
		System.out.println(nation);
		// ..println() method 는 화면에 값을 출력만 할 뿐 
		// return type 이 void 이다.
		// nation = System.out.println(nation());
		System.out.println(nation());
		
	}
}


