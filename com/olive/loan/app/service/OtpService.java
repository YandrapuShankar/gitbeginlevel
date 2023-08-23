package com.olive.loan.app.service;

import org.springframework.web.context.request.async.DeferredResult;

import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.ChangePassWordReq;
import com.olive.loan.app.vo.OtpRequestVo;
import com.olive.loan.app.vo.OtpResponse;
import com.olive.loan.app.vo.VerifyOtpReq;

public interface OtpService {

	public void otpSave(OtpRequestVo otpRequestVo,DeferredResult<Result<OtpResponse>> dr);
	
	public void verifyOtp(VerifyOtpReq verifyOtpReq,DeferredResult<Result<String>> dr);
	
	public void changePassWord(ChangePassWordReq changePassWordReq,DeferredResult<Result<String>> dr);

}
