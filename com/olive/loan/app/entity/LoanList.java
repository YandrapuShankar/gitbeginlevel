package com.olive.loan.app.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "tbl_loan_list")
public class LoanList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "loan_id")
	private String loanId;

	@Column(name = "loan_type")
	private String loanType;

	@Column(name = "loan_provider_name")
	private String loanProviderName;

	

	@Column(name = "loan_provider_contact")
	private String loanProviderContact;
	
	@Column(name="maximum_loan_amount")
	private String maximumLoanAmount;
	
	@Column(name="tenure_of_the_Loan")
	private String 	tenureOfTheLoan;
	
	@Column(name="rate_of_interest")
	private String rateOfInterest;
	
	@Column(name="processing_charges")
	private String processingCharges;
	
	@Column(name="repayment")
	private String repayment;
	
    @Column(name="InterestRate")
    private String  interestRate;
	
    
    @Column(name="MaximumAmount")
    private String maximumAmount;
    
    
    @Column(name="TenureOfLoan")
    private String tenureOfLoan;

    
    @Column(name="amount_repayment")
    private String amountRepayment;
    
    
    
    @Column(name="sorting_orderId")
    private int sortingOrderId;

    @Column(name="max_amount_in_numbers")
    private BigDecimal amountInNumbers;
    
    
    @Lob
    @Type(type = "org.hibernate.type.TextType")
    @Column(name="hashed_text_data")
    private String textData;


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


	public int getSortingOrderId() {
		return sortingOrderId;
	}


	public void setSortingOrderId(int sortingOrderId) {
		this.sortingOrderId = sortingOrderId;
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


	public LoanList(long id, String loanId, String loanType, String loanProviderName, String loanProviderContact,
			String maximumLoanAmount, String tenureOfTheLoan, String rateOfInterest, String processingCharges,
			String repayment, String interestRate, String maximumAmount, String tenureOfLoan, String amountRepayment,
			int sortingOrderId, BigDecimal amountInNumbers, String textData) {
		super();
		this.id = id;
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
		this.tenureOfLoan = tenureOfLoan;
		this.amountRepayment = amountRepayment;
		this.sortingOrderId = sortingOrderId;
		this.amountInNumbers = amountInNumbers;
		this.textData = textData;
	}


	public LoanList() {
		super();
	}


	@Override
	public String toString() {
		return "LoanList [id=" + id + ", loanId=" + loanId + ", loanType=" + loanType + ", loanProviderName="
				+ loanProviderName + ", loanProviderContact=" + loanProviderContact + ", maximumLoanAmount="
				+ maximumLoanAmount + ", tenureOfTheLoan=" + tenureOfTheLoan + ", rateOfInterest=" + rateOfInterest
				+ ", processingCharges=" + processingCharges + ", repayment=" + repayment + ", interestRate="
				+ interestRate + ", maximumAmount=" + maximumAmount + ", tenureOfLoan=" + tenureOfLoan
				+ ", amountRepayment=" + amountRepayment + ", sortingOrderId=" + sortingOrderId + ", amountInNumbers="
				+ amountInNumbers + ", textData=" + textData + "]";
	}

    
    
    
	
	
	
}
