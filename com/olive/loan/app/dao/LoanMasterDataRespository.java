package com.olive.loan.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olive.loan.app.entity.LoanMasterData;

public interface LoanMasterDataRespository extends JpaRepository<LoanMasterData, Long>{
//LoanMasterData findByLoanIdAndLoanTypeList(String loanId, String loanType);
	
	LoanMasterData findByLoanIdAndLoanType(String loanId, String loanType);

}
