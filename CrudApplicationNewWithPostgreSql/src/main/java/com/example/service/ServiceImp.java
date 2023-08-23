package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.Adhikritmodel;
import com.example.repo.AdhikritmodelRepo;
@org.springframework.stereotype.Service
public class ServiceImp implements Service {
@Autowired
private AdhikritmodelRepo repo;
	@Override
	public Adhikritmodel saveStudentDetails(Adhikritmodel object) {
		return  repo.save(object);
		
	}

	@Override
	public Adhikritmodel updateStudentDeatails(Adhikritmodel object, Integer courseCode) {
		Optional<Adhikritmodel>optional=repo.findById(courseCode);
		Adhikritmodel model=optional.get();
		model.setCourseCode(courseCode);
		model.setCourseName(object.getCourseName());
		model.setYear(object.getYear());
	model.setSemester(object.getSemester());
	model.setBranch(object.getBranch());
	model.setSection(object.getSection());
	model.setFacultyName(object.getFacultyName());
	model.setAcadamicYear(object.getAcadamicYear());
		
	return repo.save(model);
	
	}

	@Override
	public void deleteStudentDetails(Integer courseCode) {
		repo.deleteById(courseCode);

	}

	@Override
	public Adhikritmodel getOneStudentDetails(Integer courseCode) {
		Adhikritmodel model=repo.findById(courseCode).get();
		return model;
		
	}

	@Override
	public List<Adhikritmodel> getAllStudentDetails() {
		List<Adhikritmodel>many=(List<Adhikritmodel>) repo.findAll();
		return many;	
		}

}
