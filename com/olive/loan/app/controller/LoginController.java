package com.olive.loan.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.olive.loan.app.service.LoginService;
import com.olive.loan.app.service.LoginServiceImpl;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.LoginReq;
import com.olive.loan.app.vo.LoginResponse;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;

	@PostMapping(value = "v1/login/{txnId}")
	public DeferredResult<Result<LoginResponse>>loginReq(@PathVariable(name = "txnId") String txnId,
			@Valid @RequestBody LoginReq req, BindingResult bindingResult) {
		Result<LoginResponse> result = new Result<LoginResponse>();
		result.setCode("91");
		result.setResult("Timed Out");
		DeferredResult<Result<LoginResponse>> dr = new DeferredResult<Result<LoginResponse>>(30000L,result);
		loginService.getLoginResponse(req, dr);
		return dr;
	}
}
