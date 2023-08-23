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
import com.olive.loan.app.service.AllLoansParamsListServiceImpl;
import com.olive.loan.app.service.LoanService;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.LoanDataReq;
import com.olive.loan.app.vo.LoanDataResponse;

@RestController
public class LoanApiController {
	
	@Autowired
	private LoanService loanService;
	
	@Autowired
	private AllLoansParamsListServiceImpl allLoansParamsListServiceImpl;
	
	@PostMapping(value = "v1/getLoan/{txnId}")
	public DeferredResult<Result<LoanDataResponse>> listInquireBills(@PathVariable(name ="txnId") String txnId,
			@Valid @RequestBody LoanDataReq req, BindingResult bindingResult) {
		Result<LoanDataResponse> result = new Result<LoanDataResponse>();
		result.setCode("91");
		result.setResult("Timed Out");
		DeferredResult<Result<LoanDataResponse>> dr = new DeferredResult<Result<LoanDataResponse>>(30000L, result);
		loanService.getLoan(req, dr);
		return dr;
	}
	
	//here starts the new test api for the list of params for the different loans
	
	@PostMapping(value = "v1/getLoansParamlist/{txnId}")
	public DeferredResult<Result<JsonNode>> loanParamslist(@PathVariable(name ="txnId") String txnId,
			@Valid @RequestBody LoanDataReq req, BindingResult bindingResult) {
		Result<JsonNode> result = new Result<JsonNode>();
		result.setCode("91");
		result.setResult("Timed Out");
		DeferredResult<Result<JsonNode>> dr = new DeferredResult<Result<JsonNode>>(30000L, result);
		allLoansParamsListServiceImpl.getAllLoansParamsList(req, dr);
		return dr;
	}
	
	
	
	
}
