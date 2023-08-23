package com.olive.loan.app.service;

import org.springframework.web.context.request.async.DeferredResult;

import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.LoanDataReq;
import com.olive.loan.app.vo.LoanDataResponse;

public interface LoanService {

	public void getLoan(LoanDataReq req, DeferredResult<Result<LoanDataResponse>> dr);

}
