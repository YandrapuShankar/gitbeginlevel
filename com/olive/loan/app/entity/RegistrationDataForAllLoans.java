package com.olive.loan.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name="tbl_all_loans_registration_data")
@TypeDefs({
    @TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)
})
public class RegistrationDataForAllLoans {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="loan_id")
	private String loanId;
	
	@Column(name="loan_type")
	private String loanType;
	
	@Column(name="mobile_number")
	private String mobileNumber;
	
	
	@Column(name="txn_id")
	private String txnId;

	 @Column(name = "data_json", columnDefinition = "jsonb")
	    @Type(type = "jsonb")
	 private String userRegistrationData;
	 
	 
	 @Column(name="loan_date")
     private Date loanDate;

     
	 @Column(name="loan_status")
	 private String status;


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


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getTxnId() {
		return txnId;
	}


	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}


	public String getUserRegistrationData() {
		return userRegistrationData;
	}


	public void setUserRegistrationData(String userRegistrationData) {
		this.userRegistrationData = userRegistrationData;
	}


	public Date getLoanDate() {
		return loanDate;
	}


	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public RegistrationDataForAllLoans(long id, String loanId, String loanType, String mobileNumber, String txnId,
			String userRegistrationData, Date loanDate, String status) {
		super();
		this.id = id;
		this.loanId = loanId;
		this.loanType = loanType;
		this.mobileNumber = mobileNumber;
		this.txnId = txnId;
		this.userRegistrationData = userRegistrationData;
		this.loanDate = loanDate;
		this.status = status;
	}


	public RegistrationDataForAllLoans() {
		super();
	}


	@Override
	public String toString() {
		return "RegistrationDataForAllLoans [id=" + id + ", loanId=" + loanId + ", loanType=" + loanType
				+ ", mobileNumber=" + mobileNumber + ", txnId=" + txnId + ", userRegistrationData="
				+ userRegistrationData + ", loanDate=" + loanDate + ", status=" + status + "]";
	}
	 
	 
}
