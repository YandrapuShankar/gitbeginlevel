package com.olive.loan.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.olive.loan.app.service.HealthCheckService;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.HealthCheckReq;
import com.olive.loan.app.vo.HealthCheckResponse;

@RestController
public class HealthCheckController {

	@Autowired
	HealthCheckService healthCheckService;

	@PostMapping(value = "v1/healthcheck/{txnId}")
	public DeferredResult<Result<HealthCheckResponse>> listInquireBills(@PathVariable(name = "txnId") String txnId,
			@Valid @RequestBody HealthCheckReq req, BindingResult bindingResult) {
		Result<HealthCheckResponse> result = new Result<HealthCheckResponse>();
		result.setCode("91");
		result.setResult("Timed Out");
		DeferredResult<Result<HealthCheckResponse>> dr = new DeferredResult<Result<HealthCheckResponse>>(30000L,result);
		healthCheckService.getHealthCheckResponse(txnId, dr,req);
		return dr;
	}
}
