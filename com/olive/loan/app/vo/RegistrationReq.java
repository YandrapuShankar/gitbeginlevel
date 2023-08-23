package com.olive.loan.app.vo;

import javax.persistence.Column;

import com.olive.loan.app.entity.DeviceInfo;

public class RegistrationReq {
	
	private String userName;
	 
	
	private String mobileNumber;
	
	
	private String userEmail;

	
	private String passWord;
	
	
	
	private String userDateOfBirth;

	
	private String userOccupation;
	
	private DeviceDetails details;
	
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


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
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


	public DeviceDetails getDetails() {
		return details;
	}


	public void setDetails(DeviceDetails details) {
		this.details = details;
	}


	


}
