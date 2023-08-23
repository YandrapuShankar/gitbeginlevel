package com.olive.loan.app.vo;

import java.math.BigDecimal;
import java.util.Arrays;

public class LoanListResponse {
	
	
	private String loanId;

	
	private String loanType;

	private String loanProviderName;

	
	private String loanProviderContact;
	
    private String maximumLoanAmount;
	
	
	private String 	tenureOfTheLoan;
	
	
	private String rateOfInterest;
	
	
	private String processingCharges;
	
	
	private String repayment;
	
    
    private String  interestRate;
	
    
    
    private String maximumAmount;
    
    
    private String hasedCriteriaData;
    
    
	private String tenureOfLoan;


    
    private String amountRepayment;
    
    
    private BigDecimal amountInNumbers;

	private String textData;

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

	public String getLoanProviderName() {
		return loanProviderName;
	}

	public void setLoanProviderName(String loanProviderName) {
		this.loanProviderName = loanProviderName;
	}

	public String getLoanProviderContact() {
		return loanProviderContact;
	}

	public void setLoanProviderContact(String loanProviderContact) {
		this.loanProviderContact = loanProviderContact;
	}

	public String getMaximumLoanAmount() {
		return maximumLoanAmount;
	}

	public void setMaximumLoanAmount(String maximumLoanAmount) {
		this.maximumLoanAmount = maximumLoanAmount;
	}

	public String getTenureOfTheLoan() {
		return tenureOfTheLoan;
	}

	public void setTenureOfTheLoan(String tenureOfTheLoan) {
		this.tenureOfTheLoan = tenureOfTheLoan;
	}

	public String getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(String rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public String getProcessingCharges() {
		return processingCharges;
	}

	public void setProcessingCharges(String processingCharges) {
		this.processingCharges = processingCharges;
	}

	public String getRepayment() {
		return repayment;
	}

	public void setRepayment(String repayment) {
		this.repayment = repayment;
	}

	public String getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}

	public String getMaximumAmount() {
		return maximumAmount;
	}

	public void setMaximumAmount(String maximumAmount) {
		this.maximumAmount = maximumAmount;
	}

	public String getHasedCriteriaData() {
		return hasedCriteriaData;
	}

	public void setHasedCriteriaData(String hasedCriteriaData) {
		this.hasedCriteriaData = hasedCriteriaData;
	}

	public String getTenureOfLoan() {
		return tenureOfLoan;
	}

	public void setTenureOfLoan(String tenureOfLoan) {
		this.tenureOfLoan = tenureOfLoan;
	}

	public String getAmountRepayment() {
		return amountRepayment;
	}

	public void setAmountRepayment(String amountRepayment) {
		this.amountRepayment = amountRepayment;
	}

	public BigDecimal getAmountInNumbers() {
		return amountInNumbers;
	}

	public void setAmountInNumbers(BigDecimal amountInNumbers) {
		this.amountInNumbers = amountInNumbers;
	}

	public String getTextData() {
		return textData;
	}

	public void setTextData(String textData) {
		this.textData = textData;
	}

	public LoanListResponse(String loanId, String loanType, String loanProviderName, String loanProviderContact,
			String maximumLoanAmount, String tenureOfTheLoan, String rateOfInterest, String processingCharges,
			String repayment, String interestRate, String maximumAmount, String hasedCriteriaData, String tenureOfLoan,
			String amountRepayment, BigDecimal amountInNumbers, String textData) {
		super();
		this.loanId = loanId;
		this.loanType = loanType;
		this.loanProviderName = loanProviderName;
		this.loanProviderContact = loanProviderContact;
		this.maximumLoanAmount = maximumLoanAmount;
		this.tenureOfTheLoan = tenureOfTheLoan;
		this.rateOfInterest = rateOfInterest;
		this.processingCharges = processingCharges;
		this.repayment = repayment;
		this.interestRate = interestRate;
		this.maximumAmount = maximumAmount;
		this.hasedCriteriaData = hasedCriteriaData;
		this.tenureOfLoan = tenureOfLoan;
		this.amountRepayment = amountRepayment;
		this.amountInNumbers = amountInNumbers;
		this.textData = textData;
	}

	public LoanListResponse() {
		super();
	}

	@Override
	public String toString() {
		return "LoanListResponse [loanId=" + loanId + ", loanType=" + loanType + ", loanProviderName="
				+ loanProviderName + ", loanProviderContact=" + loanProviderContact + ", maximumLoanAmount="
				+ maximumLoanAmount + ", tenureOfTheLoan=" + tenureOfTheLoan + ", rateOfInterest=" + rateOfInterest
				+ ", processingCharges=" + processingCharges + ", repayment=" + repayment + ", interestRate="
				+ interestRate + ", maximumAmount=" + maximumAmount + ", hasedCriteriaData=" + hasedCriteriaData
				+ ", tenureOfLoan=" + tenureOfLoan + ", amountRepayment=" + amountRepayment + ", amountInNumbers="
				+ amountInNumbers + ", textData=" + textData + "]";
	}
    
  
	
	
}
