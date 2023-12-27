package com.callor.student.model;

public enum StdIndex {
	학번(0),
	이름(1),
	학과(2),
	학년(3),
	전화번호(4),
	주소(5);
	// 위 괄호안의 값이 아래의 index 에 담겨 하나의 배열로 만들어짐
	public int index;
	private StdIndex(int index) {
		this.index = index;
	}
}
