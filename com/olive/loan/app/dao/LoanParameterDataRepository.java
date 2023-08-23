package com.olive.loan.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.olive.loan.app.entity.LoanParameterData;

public interface LoanParameterDataRepository extends JpaRepository<LoanParameterData, String>{
	
public List<LoanParameterData> findByLoanParamIdInOrderByNumberOfTheParameter(String[] paramId);



}