package com.olive.loan.app.vo;

import java.util.List;

import com.olive.loan.app.entity.LoanData;

public class LoanStatusResponse {
public List<LoanStatusRespVo> loanData;

public List<LoanStatusRespVo> getLoanData() {
	return loanData;
}

public void setLoanData(List<LoanStatusRespVo> loanData) {
	this.loanData = loanData;
}

}
