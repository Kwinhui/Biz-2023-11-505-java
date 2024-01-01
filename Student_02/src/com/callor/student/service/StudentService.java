package com.callor.student.service;

import com.callor.student.model.StudentDto;

public interface StudentService {
	
	public void searchStd();
	public void loadStd();
	public StudentDto selectStd(String name);
	public void printStd(StudentDto dto);

}
