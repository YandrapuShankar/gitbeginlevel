package com.olive.loan.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.olive.loan.app.service.LoanStatusService;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.LoanStatusRequest;
import com.olive.loan.app.vo.LoanStatusRespVo;
import com.olive.loan.app.vo.LoanStatusResponse;

@RestController
public class LoanStatusController {
	
	@Autowired
	private LoanStatusService loanStatusService;
	
	@PostMapping(value = "v1/loanStatus/{txnId}")
	public DeferredResult<Result<LoanStatusResponse>> listInquireBills(@PathVariable(name = "txnId") String txnId,
			@Valid @RequestBody LoanStatusRequest req, BindingResult bindingResult) {
		Result<LoanStatusResponse> result = new Result<LoanStatusResponse>();
		result.setCode("91");
		result.setResult("Timed Out");
		DeferredResult<Result<LoanStatusResponse>> dr = new DeferredResult<Result<LoanStatusResponse>>(30000L, result);
		loanStatusService.getLoanStatus(req, dr);
		return dr;
	}

}
