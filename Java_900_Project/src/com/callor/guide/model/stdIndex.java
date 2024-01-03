package com.callor.guide.model;

public enum stdIndex {
	id(0),
	종목명(1),
	순서(2),
	방법(3);
	
	public int index;
	private stdIndex(int index) {
		this.index = index;
	}
}
