package com.olive.loan.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.olive.loan.app.service.LoanHistoryNewServiceImpl;
import com.olive.loan.app.service.LoanHistoryService;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.DeviceDetails;
import com.olive.loan.app.vo.LoanHistoryResponse;

@RestController
public class LoanHistoryController {

	@Autowired
	private LoanHistoryService loanHistoryService;
	
	
	@Autowired
	private LoanHistoryNewServiceImpl LoanHistoryNewServiceImpl;

	@PostMapping(value = "v1/loanHistory/{txnId}")
	public DeferredResult<Result<List<LoanHistoryResponse>>> listInquireBills(@PathVariable(name = "txnId") String txnId,
			@Valid @RequestBody DeviceDetails req, BindingResult bindingResult) {
		Result<LoanHistoryResponse> result = new Result<LoanHistoryResponse>();
		result.setCode("91");
		result.setResult("Timed Out");
		DeferredResult<Result<List<LoanHistoryResponse>>> dr = new DeferredResult<Result<List<LoanHistoryResponse>>>(30000L, result);
		loanHistoryService.getLoanHistory(req, dr);
		return dr;
	}
	
	@PostMapping(value = "v1/loansHistory/{txnId}")
	public DeferredResult<Result<List<LoanHistoryResponse>>> getTheLoanHistory(@PathVariable(name = "txnId") String txnId,
			@Valid @RequestBody DeviceDetails req, BindingResult bindingResult) {
		Result<LoanHistoryResponse> result = new Result<LoanHistoryResponse>();
		result.setCode("91");
		result.setResult("Timed Out");
		DeferredResult<Result<List<LoanHistoryResponse>>> dr = new DeferredResult<Result<List<LoanHistoryResponse>>>(30000L, result);
		LoanHistoryNewServiceImpl.getTheAppliedLoans(req, dr);
		return dr;
	}
	
	
	
}
