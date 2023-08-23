package com.olive.loan.app.service;

import org.springframework.web.context.request.async.DeferredResult;

import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.HealthCheckReq;
import com.olive.loan.app.vo.HealthCheckResponse;

public interface HealthCheckService {

	public void getHealthCheckResponse(String txnId,DeferredResult<Result<HealthCheckResponse>> dr,HealthCheckReq checkReq);

}
