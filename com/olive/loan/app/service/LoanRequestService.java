package com.olive.loan.app.service;

import org.springframework.web.context.request.async.DeferredResult;

import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.LoanRequestDetails;

public interface LoanRequestService {

	void sendLoanReq(LoanRequestDetails req, DeferredResult<Result<String>> dr);

}
