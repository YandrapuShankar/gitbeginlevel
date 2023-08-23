package com.olive.loan.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="tbl_loan_data")
public class LoanData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="loan_id")
	private String loanId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="mobile_number")
	private String mobileNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="property_identification_number")
	private String propertyIdentificationNumber;
	
	@Column(name="age")
	private int age;
	
	@Column(name="address")
	private String address;
	
	@Column(name="txn_id")
	private String txnId;
	
	@Column(name="loan_type")
	private String loanType;
	
	@Column(name="loan_amount")
	private String loanAmount;
	
	@Column(name="status")
	private String status;
	
	@Column(name="loan_date")
	private Date loanDate;
	
	@Column(name="pancard_number")
	private String pancardNumber;
	
	@Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name="hashed_image_data")
    private String imageData;
	
	
	
	public String getImageData() {
		return imageData;
	}

	public void setImageData(String imageData) {
		this.imageData = imageData;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}

	public void setPancardNumber(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	@Column(name="identity_type")
	private String identityType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
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

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public String getIdentityType() {
		return identityType;
	}

	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public LoanData(long id, String loanId, String firstName, String lastName, String mobileNumber, String email,
			String identityNumber, String gender, String propertyIdentificationNumber, int age, String address,
			String txnId, String loanType, String loanAmount, String status, Date loanDate, String pancardNumber,
			String imageData, String identityType) {
		super();
		this.id = id;
		this.loanId = loanId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.identityNumber = identityNumber;
		this.gender = gender;
		this.propertyIdentificationNumber = propertyIdentificationNumber;
		this.age = age;
		this.address = address;
		this.txnId = txnId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.status = status;
		this.loanDate = loanDate;
		this.pancardNumber = pancardNumber;
		this.imageData = imageData;
		this.identityType = identityType;
	}

	public LoanData() {
		super();
	}

	@Override
	public String toString() {
		return "LoanData [id=" + id + ", loanId=" + loanId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobileNumber=" + mobileNumber + ", email=" + email + ", identityNumber=" + identityNumber
				+ ", gender=" + gender + ", propertyIdentificationNumber=" + propertyIdentificationNumber + ", age="
				+ age + ", address=" + address + ", txnId=" + txnId + ", loanType=" + loanType + ", loanAmount="
				+ loanAmount + ", status=" + status + ", loanDate=" + loanDate + ", pancardNumber=" + pancardNumber
				+ ", imageData=" + imageData + ", identityType=" + identityType + "]";
	}

}
