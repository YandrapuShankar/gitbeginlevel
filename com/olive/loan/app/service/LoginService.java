package com.olive.loan.app.service;

import org.springframework.web.context.request.async.DeferredResult;

import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.LoginReq;
import com.olive.loan.app.vo.LoginResponse;

public interface LoginService {

	public void getLoginResponse(LoginReq loginReq,DeferredResult<Result<LoginResponse>> dr);

}
