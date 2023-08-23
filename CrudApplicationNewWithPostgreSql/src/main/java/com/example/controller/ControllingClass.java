package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Adhikritmodel;
import com.example.service.ServiceImp;

@RestController
public class ControllingClass {
	@Autowired
	private ServiceImp service;
	@PostMapping("/save")
	public String save(@RequestBody Adhikritmodel model,Model m)
	{
		Adhikritmodel object2=service.saveStudentDetails(model);
		String message=null;
		if(object2!=null)
				{
			      message="Adikrit data saved successfully";
			
			
				}
		else
		{
			
			message="adikrit data is not saved successfully";
		}
	return message;

	}
	@DeleteMapping("/delete/{courseCode}")
	public void delete(@PathVariable Integer courseCode)
	{
		
	service.deleteStudentDetails(courseCode);
	      

	}
	@GetMapping("get/{courseCode}")
	public Adhikritmodel getOne(@PathVariable Integer courseCode)
	{
		Adhikritmodel object=service.getOneStudentDetails(courseCode);

	  return object;


	}
	@GetMapping("/getAll")
	public List<Adhikritmodel>getAll()
	{
		List<Adhikritmodel> objects=service.getAllStudentDetails();
	     return objects;

	}
	@PutMapping("/update/{courseCode}")
	public Adhikritmodel update(@RequestBody Adhikritmodel model,@PathVariable Integer courseCode)
	{
		
	Adhikritmodel object=service. updateStudentDeatails(model,courseCode);


	return object;
	}


}
