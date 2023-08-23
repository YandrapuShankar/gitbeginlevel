package com.olive.loan.app.service;

import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.jackson.databind.JsonNode;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.LoanDataReq;

public interface AllLoanParamsListService {

	public void getAllLoansParamsList(LoanDataReq req, DeferredResult<Result<JsonNode>> dr);
}
