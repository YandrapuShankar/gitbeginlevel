package com.olive.loan.app.vo;

import java.util.Date;

public class LoanHistoryResponse {
public String loanAmount;
public String loanType;
public String status;
public String txnId;

public String getTxnId() {
	return txnId;
}
public void setTxnId(String txnId) {
	this.txnId = txnId;
}
public String getLoanAmount() {
	return loanAmount;
}
public void setLoanAmount(String loanAmount) {
	this.loanAmount = loanAmount;
}
public String getLoanType() {
	return loanType;
}
public void setLoanType(String loanType) {
	this.loanType = loanType;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
