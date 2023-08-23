package com.olive.loan.app.vo;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.Valid;

import org.hibernate.annotations.Type;

public class LoanRequestDetails {

@Valid
public DeviceDetails deviceDetails;

@Valid
public LoanReq loanReq;

public String firstName;

public String lastName;

public int age;

public String mobileNumber;

public String address;

public String email;

public String identityType;

public String identityNumber;

public String gender;

public String propertyIdentificationNumber;

public String loanType;


public String pancardNumber;

public String loanAmount;

public String uploadDocumentProofOne;

public String uploadDocumentProofTwo;

public String uploadDocumentProofThree;


@Lob
@Type(type = "org.hibernate.type.TextType")
private String imageHashedData;



public String getImageHashedData() {
	return imageHashedData;
}

public void setImageHashedData(String imageHashedData) {
	this.imageHashedData = imageHashedData;
}

public DeviceDetails getDeviceDetails() {
	return deviceDetails;
}

public void setDeviceDetails(DeviceDetails deviceDetails) {
	this.deviceDetails = deviceDetails;
}

public LoanReq getLoanReq() {
	return loanReq;
}

public void setLoanReq(LoanReq loanReq) {
	this.loanReq = loanReq;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getIdentityType() {
	return identityType;
}

public void setIdentityType(String identityType) {
	this.identityType = identityType;
}

public String getIdentityNumber() {
	return identityNumber;
}

public void setIdentityNumber(String identityNumber) {
	this.identityNumber = identityNumber;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getPropertyIdentificationNumber() {
	return propertyIdentificationNumber;
}

public void setPropertyIdentificationNumber(String propertyIdentificationNumber) {
	this.propertyIdentificationNumber = propertyIdentificationNumber;
}

public String getLoanType() {
	return loanType;
}

public void setLoanType(String loanType) {
	this.loanType = loanType;
}

public String getPancardNumber() {
	return pancardNumber;
}

public void setPancardNumber(String pancardNumber) {
	this.pancardNumber = pancardNumber;
}

public String getLoanAmount() {
	return loanAmount;
}

public void setLoanAmount(String loanAmount) {
	this.loanAmount = loanAmount;
}

public String getUploadDocumentProofOne() {
	return uploadDocumentProofOne;
}

public void setUploadDocumentProofOne(String uploadDocumentProofOne) {
	this.uploadDocumentProofOne = uploadDocumentProofOne;
}

public String getUploadDocumentProofTwo() {
	return uploadDocumentProofTwo;
}

public void setUploadDocumentProofTwo(String uploadDocumentProofTwo) {
	this.uploadDocumentProofTwo = uploadDocumentProofTwo;
}

public String getUploadDocumentProofThree() {
	return uploadDocumentProofThree;
}

public void setUploadDocumentProofThree(String uploadDocumentProofThree) {
	this.uploadDocumentProofThree = uploadDocumentProofThree;
}

public LoanRequestDetails(@Valid DeviceDetails deviceDetails, @Valid LoanReq loanReq, String firstName, String lastName,
		int age, String mobileNumber, String address, String email, String identityType, String identityNumber,
		String gender, String propertyIdentificationNumber, String loanType, String pancardNumber, String loanAmount,
		String uploadDocumentProofOne, String uploadDocumentProofTwo, String uploadDocumentProofThree,
		String imageHashedData) {
	super();
	this.deviceDetails = deviceDetails;
	this.loanReq = loanReq;
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	this.mobileNumber = mobileNumber;
	this.address = address;
	this.email = email;
	this.identityType = identityType;
	this.identityNumber = identityNumber;
	this.gender = gender;
	this.propertyIdentificationNumber = propertyIdentificationNumber;
	this.loanType = loanType;
	this.pancardNumber = pancardNumber;
	this.loanAmount = loanAmount;
	this.uploadDocumentProofOne = uploadDocumentProofOne;
	this.uploadDocumentProofTwo = uploadDocumentProofTwo;
	this.uploadDocumentProofThree = uploadDocumentProofThree;
	this.imageHashedData = imageHashedData;
}

public LoanRequestDetails() {
	super();
}

@Override
public String toString() {
	return "LoanRequestDetails [deviceDetails=" + deviceDetails + ", loanReq=" + loanReq + ", firstName=" + firstName
			+ ", lastName=" + lastName + ", age=" + age + ", mobileNumber=" + mobileNumber + ", address=" + address
			+ ", email=" + email + ", identityType=" + identityType + ", identityNumber=" + identityNumber + ", gender="
			+ gender + ", propertyIdentificationNumber=" + propertyIdentificationNumber + ", loanType=" + loanType
			+ ", pancardNumber=" + pancardNumber + ", loanAmount=" + loanAmount + ", uploadDocumentProofOne="
			+ uploadDocumentProofOne + ", uploadDocumentProofTwo=" + uploadDocumentProofTwo
			+ ", uploadDocumentProofThree=" + uploadDocumentProofThree + ", imageHashedData=" + imageHashedData + "]";
}


}
