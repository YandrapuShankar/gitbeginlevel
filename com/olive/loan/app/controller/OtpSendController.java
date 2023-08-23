package com.olive.loan.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import com.olive.loan.app.service.OtpService;
import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.ChangePassWordReq;
import com.olive.loan.app.vo.OtpRequestVo;
import com.olive.loan.app.vo.OtpResponse;
import com.olive.loan.app.vo.VerifyOtpReq;

@RestController
public class OtpSendController {
	
	@Autowired
	OtpService otpService;

	@PostMapping(value = "v1/otp generate/{txnId}")
	public DeferredResult<Result<OtpResponse>>sendOtp(@PathVariable(name = "txnId") String txnId,
			@Valid @RequestBody OtpRequestVo otpRequestVo, BindingResult bindingResult) {
		Result<OtpResponse> result = new Result<OtpResponse>();
		result.setCode("91");
		result.setResult("Timed Out");
		DeferredResult<Result<OtpResponse>>dr = new DeferredResult<Result<OtpResponse>>(30000L,result);
		otpService.otpSave(otpRequestVo, dr);
		return dr;
	}
	
	@PostMapping(value = "v1/otp verification/{txnId}")
	public DeferredResult<Result<String>>verifyOtp(@PathVariable(name = "txnId") String txnId,
			@Valid @RequestBody VerifyOtpReq verifyOtpReq, BindingResult bindingResult) {
		Result<String> result = new Result<String>();
		result.setCode("91");
		result.setResult("Timed Out");
		DeferredResult<Result<String>>dr = new DeferredResult<Result<String>>(30000L,result);
		otpService.verifyOtp(verifyOtpReq, dr);
		return dr;
	}
	
	@PostMapping(value = "v1/change PassWord/{txnId}")
	public DeferredResult<Result<String>>changePassword(@PathVariable(name = "txnId") String txnId,
			@Valid @RequestBody ChangePassWordReq changePassWordReq, BindingResult bindingResult) {
		Result<String> result = new Result<String>();
		result.setCode("91");
		result.setResult("Timed Out");
		DeferredResult<Result<String>>dr = new DeferredResult<Result<String>>(30000L,result);
		otpService.changePassWord(changePassWordReq, dr);
		return dr;
	}
	
	
	
	
	
	
	
	
}
