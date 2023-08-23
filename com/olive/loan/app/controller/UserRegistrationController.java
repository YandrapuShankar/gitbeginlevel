package com.olive.loan.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.olive.loan.app.dao.UserRespository;
import com.olive.loan.app.service.UserRegistrationServiceImpl;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.RegistrationReq;
import com.olive.loan.app.vo.RegistrationResp;


@RestController
public class UserRegistrationController {
	@Autowired
	private UserRespository userRepository;

	
	@Autowired
	private UserRegistrationServiceImpl userRegistrationServiceImpl;
	
	@PostMapping(value = "v1/userregistration")
	public DeferredResult<Result<String>> listInquireBills(
			@Valid @RequestBody RegistrationReq registrationReq, BindingResult bindingResult) {
		Result<String> result = new Result<String>();
		result.setCode("91");
		result.setResult("Timed Out");
		DeferredResult<Result<String>> dr = new DeferredResult<Result<String>>(90000L, result);
		userRegistrationServiceImpl.userRegistration(registrationReq, dr);
		return dr;
		
		
	}
}
