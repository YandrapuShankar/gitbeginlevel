package com.olive.loan.app.service;

import org.springframework.web.context.request.async.DeferredResult;

import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.LoanStatusRequest;
import com.olive.loan.app.vo.LoanStatusResponse;

public interface LoanStatusService {

	void getLoanStatus(LoanStatusRequest req, DeferredResult<Result<LoanStatusResponse>> dr);

}
