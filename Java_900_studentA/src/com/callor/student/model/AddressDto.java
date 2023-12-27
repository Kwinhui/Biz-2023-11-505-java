package com.callor.student.model;

public class AddressDto {
	public AddressDto() {
		// TODO Auto-generated constructor stub
	}
	// 임의생성자를 만들게되면 기본생성자 사라짐
	// 임의생성자를 만들면 기본생성자를 같이 만들어 주어야함
	/*
	 * 매개변수가 있는 생성자
	 * 이 생성자를 임의생성자 라고 한다.
	 * 없어도 되는데 일부로 만든 생성자이다.
	 * 
	 * 임의 생성자를 만들면
	 * 기본 생성자는 사라진다.
	 */
	public AddressDto(String name) {
	}
}
