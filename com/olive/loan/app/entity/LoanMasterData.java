package com.olive.loan.app.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
@Entity
@Table(name="tbl_masterloan_data")
public class LoanMasterData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="loan_id")
	private String loanId;
	
	@Column(name="loan_type")
	private String loanType;
	
	@Column(name="first_name_id")
	private String firstNameId;
	
	@Column(name="last_name_id")
	private String lastNameId;
	
	@Column(name="mobile_number_id")
	private String mobileNumberId;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="options")
	private String options;
	
	@Column(name="identity_number_id")
	private String identityNumberId;
	
	@Column(name="gender_id")
	private String genderId;
	
	@Column(name="property_identification_number_id")
	private String propertyIdentificationNumberId;
	
	@Column(name="ageId")
	private String ageId;
	
	@Column(name="addressId")
	private String addressId;
	
	@Column(name="loan_amount_id")
	private String loanAmountId;
	
    @Column(name="pancard_number_paramId")
    private String pancardNumberParamId;
   
    @Column(name="document_proof_one")
    private String  uploadTheProofDocumentOne;
    
    
    
    @Column(name="document_proof_two")
    private String uploadTheProofDocumentTwo;
    
    
    
    
    @Column(name="document_proof_three")
    private String  uploadTheProofDocumentThree;
    
	
    



	public String getUploadTheProofDocumentOne() {
		return uploadTheProofDocumentOne;
	}


	public void setUploadTheProofDocumentOne(String uploadTheProofDocumentOne) {
		this.uploadTheProofDocumentOne = uploadTheProofDocumentOne;
	}


	public String getUploadTheProofDocumentTwo() {
		return uploadTheProofDocumentTwo;
	}


	public void setUploadTheProofDocumentTwo(String uploadTheProofDocumentTwo) {
		this.uploadTheProofDocumentTwo = uploadTheProofDocumentTwo;
	}


	public String getUploadTheProofDocumentThree() {
		return uploadTheProofDocumentThree;
	}


	public void setUploadTheProofDocumentThree(String uploadTheProofDocumentThree) {
		this.uploadTheProofDocumentThree = uploadTheProofDocumentThree;
	}


	public String getPancardNumberParamId() {
		return pancardNumberParamId;
	}


	public void setPancardNumberParamId(String pancardNumberParamId) {
		this.pancardNumberParamId = pancardNumberParamId;
	}


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

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getFirstNameId() {
		return firstNameId;
	}

	public void setFirstNameId(String firstNameId) {
		this.firstNameId = firstNameId;
	}

	public String getLastNameId() {
		return lastNameId;
	}

	public void setLastNameId(String lastNameId) {
		this.lastNameId = lastNameId;
	}

	public String getMobileNumberId() {
		return mobileNumberId;
	}

	public void setMobileNumberId(String mobileNumberId) {
		this.mobileNumberId = mobileNumberId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getIdentityNumberId() {
		return identityNumberId;
	}

	public void setIdentityNumberId(String identityNumberId) {
		this.identityNumberId = identityNumberId;
	}

	public String getGenderId() {
		return genderId;
	}

	public void setGenderId(String genderId) {
		this.genderId = genderId;
	}

	public String getPropertyIdentificationNumberId() {
		return propertyIdentificationNumberId;
	}

	public void setPropertyIdentificationNumberId(String propertyIdentificationNumberId) {
		this.propertyIdentificationNumberId = propertyIdentificationNumberId;
	}

	public String getAgeId() {
		return ageId;
	}

	public void setAgeId(String ageId) {
		this.ageId = ageId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getLoanAmountId() {
		return loanAmountId;
	}

	public void setLoanAmountId(String loanAmountId) {
		this.loanAmountId = loanAmountId;
	}


	public LoanMasterData(long id, String loanId, String loanType, String firstNameId, String lastNameId,
			String mobileNumberId, String emailId, String options, String identityNumberId, String genderId,
			String propertyIdentificationNumberId, String ageId, String addressId, String loanAmountId,
			String pancardNumberParamId, String uploadTheProofDocumentOne, String uploadTheProofDocumentTwo,
			String uploadTheProofDocumentThree) {
		super();
		this.id = id;
		this.loanId = loanId;
		this.loanType = loanType;
		this.firstNameId = firstNameId;
		this.lastNameId = lastNameId;
		this.mobileNumberId = mobileNumberId;
		this.emailId = emailId;
		this.options = options;
		this.identityNumberId = identityNumberId;
		this.genderId = genderId;
		this.propertyIdentificationNumberId = propertyIdentificationNumberId;
		this.ageId = ageId;
		this.addressId = addressId;
		this.loanAmountId = loanAmountId;
		this.pancardNumberParamId = pancardNumberParamId;
		this.uploadTheProofDocumentOne = uploadTheProofDocumentOne;
		this.uploadTheProofDocumentTwo = uploadTheProofDocumentTwo;
		this.uploadTheProofDocumentThree = uploadTheProofDocumentThree;
	}


	public LoanMasterData() {
		super();
	}

	
	
	
}
