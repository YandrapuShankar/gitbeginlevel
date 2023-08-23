package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	public class Adhikritmodel {
	@Id	
	
	
	private Integer courseCode;
	private String courseName;
	private String year;
	private  int semester;
	private  String branch;
	private String section;
	private String facultyName;
	private String acadamicYear;
	public Integer getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(Integer courseCode) {
		this.courseCode = courseCode;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public String getAcadamicYear() {
		return acadamicYear;
	}
	public void setAcadamicYear(String acadamicYear) {
		this.acadamicYear = acadamicYear;
	}
	@Override
	public String toString() {
		return "Adhikritmodel [courseCode=" + courseCode + ", courseName=" + courseName + ", year=" + year
				+ ", semester=" + semester + ", branch=" + branch + ", section=" + section + ", facultyName="
				+ facultyName + ", acadamicYear=" + acadamicYear + "]";
	}
	
	
	
}
	
	
	
	