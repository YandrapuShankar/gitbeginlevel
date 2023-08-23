package com.olive.loan.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_registration_details")
public class RegistrationData {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_serial_id")
	private long id;
	
	@Column(name="user_name")
	private String userName;
	 
	@Column(name="mobile_number")
	private String mobileNumber;
	
	@Column(name="user_email")
	private String userEmail;
     
	@Column(name="user_password")
	private String userPassWord;

	@Column(name="user_DateOfBirth")
	private String userDateOfBirth;

	
	@Column(name="user_occupation")
	private String userOccupation;

	@Column(name="status")
	private String status;
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getUserPassWord() {
		return userPassWord;
	}


	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}


	public String getUserDateOfBirth() {
		return userDateOfBirth;
	}


	public void setUserDateOfBirth(String userDateOfBirth) {
		this.userDateOfBirth = userDateOfBirth;
	}


	public String getUserOccupation() {
		return userOccupation;
	}


	public void setUserOccupation(String userOccupation) {
		this.userOccupation = userOccupation;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	
}
