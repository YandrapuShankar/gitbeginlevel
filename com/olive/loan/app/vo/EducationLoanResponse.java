package com.olive.loan.app.vo;

import java.util.List;

public class EducationLoanResponse {
	public String loanId;
	public String loanType;
	public List<LoanParameter> loanParameter;
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
	public List<LoanParameter> getLoanParameter() {
		return loanParameter;
	}
	public void setLoanParameter(List<LoanParameter> loanParameter) {
		this.loanParameter = loanParameter;
	}

}
