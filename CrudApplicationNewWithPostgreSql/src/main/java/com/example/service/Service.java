package com.example.service;

import java.util.List;

import com.example.model.Adhikritmodel;

public interface Service {
	public Adhikritmodel saveStudentDetails(Adhikritmodel object);
	 public Adhikritmodel updateStudentDeatails(Adhikritmodel object,Integer courseCode);
	 public void deleteStudentDetails(Integer courseCode);
	 public Adhikritmodel getOneStudentDetails(Integer courseCode);
	 public List<Adhikritmodel> getAllStudentDetails();
	 
}
