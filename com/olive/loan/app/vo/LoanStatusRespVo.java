package com.olive.loan.app.vo;

import java.util.Date;

import javax.persistence.Column;



public class LoanStatusRespVo {
    private long id;
	
	
	private String loanId;
	
	private String txnId;
	
	private String loanType;
	
	private String loanAmount;
	
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

	@Override
	public String toString() {
		return "LoanStatusRespVo [id=" + id + ", loanId=" + loanId + ", txnId=" + txnId + ", loanType=" + loanType
				+ ", loanAmount=" + loanAmount + ", status=" + status + "]";
	}
	
	
}
