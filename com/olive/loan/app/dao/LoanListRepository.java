package com.olive.loan.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olive.loan.app.entity.LoanList;

public interface LoanListRepository extends JpaRepository<LoanList, Long>{
	
	public LoanList findByLoanIdAndLoanType(String loanId,String loanType);
	  
	
}
