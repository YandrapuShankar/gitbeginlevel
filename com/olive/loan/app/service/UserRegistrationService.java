package com.olive.loan.app.service;

import org.springframework.web.context.request.async.DeferredResult;

import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.RegistrationReq;
import com.olive.loan.app.vo.RegistrationResp;

public interface UserRegistrationService {

	
	void userRegistration(RegistrationReq RegistrationReq, DeferredResult<Result<String>> dr);
 

}