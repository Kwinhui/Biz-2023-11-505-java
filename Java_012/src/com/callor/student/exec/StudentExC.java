package com.callor.student.exec;

import com.callor.student.models.StIndex;

public class StudentExC {
	public static void main(String[] args) {
		System.out.println(StIndex.학번.getIndex());
		System.out.println(StIndex.이름.getIndex());
		System.out.println(StIndex.학과.getIndex());
		System.out.println(StIndex.학년.getIndex());
		System.out.println(StIndex.전화번호.getIndex());
		System.out.println(StIndex.주소.getIndex());
	}
}
