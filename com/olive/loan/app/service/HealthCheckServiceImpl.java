package com.olive.loan.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

import com.google.gson.Gson;
import com.olive.loan.app.dao.UserRespository;
import com.olive.loan.app.entity.RegistrationData;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.HealthCheckReq;
import com.olive.loan.app.vo.HealthCheckResponse;

@Service
public class HealthCheckServiceImpl implements HealthCheckService {

	@Value("${version:0.1}")
	String version;
	
	Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserRespository repository;

	@Async
	@Override
	public void getHealthCheckResponse(String txnId, DeferredResult<Result<HealthCheckResponse>> dr,HealthCheckReq checkReq) {
		try {
		Result<HealthCheckResponse> result = new Result<HealthCheckResponse>();
		HealthCheckResponse healthCheckResponse = new HealthCheckResponse();
		RegistrationData data=repository.findByMobileNumber(checkReq.deviceDetails.getMobileNumber());
		logger.info("The RegistrationData response{}:::::::::::::",new Gson().toJson(data));
		if(data!=null) {
		if(("ACTIVE").equalsIgnoreCase(data.getStatus())) {
			healthCheckResponse.setStatus("ACTIVE");
		}	
		}
		else
		{
			healthCheckResponse.setStatus("INACTIVE");
		}
		healthCheckResponse.setVersion(version);
		result.setCode("00000");
		result.setData(healthCheckResponse);
		result.setResult("SUCCESS");
		dr.setResult(result);
		logger.info("The resultResponse{}:::::::::::::::::::::::",new Gson().toJson(result));
		return;
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
