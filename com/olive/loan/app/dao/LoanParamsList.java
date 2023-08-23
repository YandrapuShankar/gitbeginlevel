package com.olive.loan.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fasterxml.jackson.core.JsonParser;
import com.olive.loan.app.entity.AllLoanParamsList;

public interface LoanParamsList extends JpaRepository<AllLoanParamsList, Long> {
	
	public AllLoanParamsList findFirstByLoanIdAndLoanTypeOrderByVersionIdDesc(String loanId,String loanType);

}
