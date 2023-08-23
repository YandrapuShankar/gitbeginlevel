package com.olive.loan.app.service;

import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.jackson.databind.JsonNode;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.VariableRequestBody;

public interface RegistrationDataForAllLoansService {

	public void registerAllTheUserData(VariableRequestBody req, DeferredResult<Result<String>> dr);

	
}
