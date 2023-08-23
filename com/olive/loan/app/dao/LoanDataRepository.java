package com.olive.loan.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olive.loan.app.entity.LoanData;

public interface LoanDataRepository extends JpaRepository<LoanData, Long> {

	List<LoanData> findByMobileNumber(String mobileNumber);
	public List<LoanData>findByMobileNumberAndLoanIdAndLoanType(String mobileNumber,String loanId,String loanType);
	
	public List<LoanData>findByMobileNumberOrderByLoanDateDesc(String mobileNumber);
}
