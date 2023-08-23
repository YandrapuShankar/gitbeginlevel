package com.olive.loan.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.jackson.databind.JsonNode;
import com.olive.loan.app.service.LoanRequestService;
import com.olive.loan.app.service.RegistrationDataForAllLoansServiceImpl;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.LoanRequestDetails;
import com.olive.loan.app.vo.VariableRequestBody;

@RestController
public class LoanReqController {
	
@Autowired	
private LoanRequestService loanListService;


@Autowired 
private RegistrationDataForAllLoansServiceImpl registrationDataForAllLoansServiceImpl;

	
	@PostMapping(value = "v1/loanRequest/{txnId}")
	public DeferredResult<Result<String>> listInquireBills(@PathVariable(name = "txnId") String txnId,
			@Valid @RequestBody LoanRequestDetails req, BindingResult bindingResult) {
		Result<String> result = new Result<String>();
		result.setCode("91");
		result.setResult("Timed Out");
		DeferredResult<Result<String>> dr = new DeferredResult<Result<String>>(30000L, result);
		loanListService.sendLoanReq(req, dr);
		return dr;
	}
	
	@PostMapping(value = "v1/register all types of loans/{txnId}")
	public DeferredResult<Result<String>> loanParamslist(@PathVariable(name ="txnId") String txnId,
			@Valid @RequestBody VariableRequestBody variableRequestBody, BindingResult bindingResult) {
		Result<String> result = new Result<String>();
		result.setCode("91");
		result.setResult("Timed Out");
		DeferredResult<Result<String>> dr = new DeferredResult<Result<String>>(30000L, result);
		registrationDataForAllLoansServiceImpl.registerAllTheUserData(variableRequestBody, dr);
		return dr;
	}
	
	
}
