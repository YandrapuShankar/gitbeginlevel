package com.olive.loan.app.service;

import java.util.List;

import org.springframework.web.context.request.async.DeferredResult;

import com.olive.loan.app.util.Result;
import com.olive.loan.app.vo.DeviceDetails;
import com.olive.loan.app.vo.LoanListResponse;

public interface LoanListService {

	public void getLoanList(DeviceDetails req, DeferredResult<Result<List<LoanListResponse>>> dr);

}
