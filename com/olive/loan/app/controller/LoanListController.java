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

import com.olive.loan.app.service.LoanListService;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.DeviceDetails;
import com.olive.loan.app.vo.LoanListResponse;

@RestController
public class LoanListController {
	
	@Autowired
	private LoanListService loanListService;
	
	@PostMapping(value = "v1/loanList/{txnId}")
	public DeferredResult<Result<List<LoanListResponse>>> listInquireBills(@PathVariable(name = "txnId") String txnId,
			@Valid @RequestBody DeviceDetails req, BindingResult bindingResult) {
		Result<LoanListResponse> result = new Result<LoanListResponse>();
		result.setCode("91");
		result.setResult("Timed Out");
		DeferredResult<Result<List<LoanListResponse>>> dr = new DeferredResult<Result<List<LoanListResponse>>>(30000L, result);
		loanListService.getLoanList(req, dr);
		return dr;
	}
}
