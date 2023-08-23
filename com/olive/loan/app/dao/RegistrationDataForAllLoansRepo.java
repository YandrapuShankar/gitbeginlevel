package com.olive.loan.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olive.loan.app.entity.RegistrationDataForAllLoans;

public interface RegistrationDataForAllLoansRepo extends JpaRepository<RegistrationDataForAllLoans, Long> {
	
	List<RegistrationDataForAllLoans>findByMobileNumberOrderByLoanDateDesc(String mobileNumber);

}
